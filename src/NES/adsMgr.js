

var list_devices = [
    "C9055E77E210FA89E6777BC451F892AC",
    "F107715443A297819F22474E9ECDBE19",
    "95DFD82C3BAB18A49FB5AAFFC6888E47",
    "C3047AD3BF8A97D87AFAB1E8FA6426AA",
    "9F8DD62C1840D269CE304CFB23C088C5",
    "0457FADBD4B28922B9A24756B34EB36A",
    "771F688757FE9C025B650285A211568C",
    "A6012A0A150FC2E4C207B27C847E001E",
    "2EA126FB58FC42659263F2425F549F85",
    "7BC21849B7C16227A9D63282A4DCC44F"
]

var AdsMap = {
    "" : ""
};

var ADSTYPE = {
    ADMOB: 0,
    IRONSRC: 1,
    FAN: 2
}

class AdsMgr {
    constructor(){
        this.adsAvaiable = true;
        this.timeAds = 0;
        // setInterval(this.update.bind(this),0);
        cc.director.getScheduler().scheduleUpdateForTarget(this,-1,false);

        this.next_time_enable_ads = 0;
        this.disableAdsByWatched = false;
    }

    init() {

        this.adsType = ADSTYPE.ADMOB;
        this.ads = null;

        var contents;
        if(cc.sys.isNative)
            contents = jsb.fileUtils.getStringFromFile("res/db_config/default.json");
        else
            contents = FileUtils.getInstance().getTextFileData("res/db_config/default.json");
        var configs = JSON.parse(contents);
        var pkg = fr.platformWrapper.getPackageName();

        if(!configs[pkg])
            return false;

        if(this.adsType === ADSTYPE.IRONSRC)
        {
            this.ads = fr.ironSrc;
            this.ads.init(configs[pkg]["ironsrcId"]);
        }
        else if(this.adsType === ADSTYPE.ADMOB)
        {
            this.ads = fr.admob;

            if (configs[pkg]["admob_interId_aC"]){
                if (Math.random() < 0.2){
                    this.ads.init({
                        adsID: configs[pkg]["admob_interId_aC"],
                        videoID: configs[pkg]["admob_rewardId_aC"]
                    });
                }
                else {
                    this.ads.init({
                        adsID: configs[pkg]["admob_interId"],
                        videoID: configs[pkg]["admob_rewardId"]
                    });
                }
            }
            else {
                this.ads.init({
                    adsID: configs[pkg]["admob_interId"],
                    videoID: configs[pkg]["admob_rewardId"]
                });
            }
        }
        return true;
    }

    isAdsDisabled(){
        return this.disableAdsByWatched;
    }

    update(dt){
        if(!this.adsAvaiable)
        {
            this.timeAds += dt;
            if(this.timeAds>=AdsMgr.TIME_FOR_SHOW)
            {
                this.adsAvaiable = true;
                this.timeAds = 0;
            }
        }
    }

    resetAds() {
        this.adsAvaiable = false;
        this.timeAds = 0;
    }

    showAds(){
        if(gameData.usingCoin || gameData.userData.proVersion || this.disableAdsByWatched)
            return;
        if(this.adsAvaiable)
        {
            this.adsAvaiable = false;
            this.timeAds = 0;

            this.ads.showAds();
            return true;
        }
        return false;
    }

    showAdsDirect() {
        if(gameData.usingCoin || gameData.userData.proVersion || this.disableAdsByWatched)
            return;
        this.ads.showAds();

    }

    showVideo(cb){
        if(this.ads)
            this.ads.showVideo(cb);
    }
}

AdsMgr.TIME_FOR_SHOW = 20;
var adsMgr = new AdsMgr();
