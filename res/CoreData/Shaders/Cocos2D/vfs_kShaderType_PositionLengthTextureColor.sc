�GSN    �˅1��\7,5V'Y 6Nh &[7��H�ah�,yQ�Ű?s@Ł����'��v�y8�h9(/�}R2Q���wt�X1�Ѫ�-Y�>����ۜk�ş�5&�fG�}a�:�vu���[A�W�p�8:�v�8�Kf�����~���cW������x����Ae�܆��@s�Q����s#-�e)�b豺рݟ%����:��{o'��������K�+a9-~�����;~H�����5~!.XF������~+��#A��z�SL^�\�����X	��x�*ε�� Ǖ��z�3�Y�a��Zx��7�0YTt�s:#��s����ba�&���(,�Rz�`��<|���]�"�Q����vM��(Z��������J+�� �y
n�m=�*�A���S��*q��y�>�Ɛ5��>V-Vٔm��0���9���$)}���\8E$��`��ӕL�ŰB����Sֻ�J!Z��ԡ�p^e~�gV�q]b�{�= .ū���kion = mul(mul(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = vec4(a_color0.rgb * a_color0.a�* u_alpha.x, a_color0.a * u_alpha.x);;
    v_texCoord = a_texcoord0;
}



#endif

#ifdef FS
$input v_fragmentColor, v_'exCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4�CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 C9_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);


voidNmain()
{
    // gl_FragColor = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);

    gl_FragColor = v_fragmentColor * �tep(0.0, 1.0 - length(v_texCoord));
}


#endif
