�GSN    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�P�ڱ������.Z��Y�%M�$\T ������q5v��a҄Y�R��&,�;x��z���]���<�P�oV�t_a5�Fr2��˘���ǋ�{;�����b�qqk����6uJ¸z�pIѬ �G���Gn�p��&*@Ŷ�t@���V��4����9�GAn���ऒѩ�eݿ�V��i��2�)B�L�H���<'�B:f�h�ɑ �*�`\g��[��4�A�<�^HHj���r��,�4"H&sx���[�eS�/�I�4�N^\�2�#B�;��3��e�YF��We�*]���˺h��,��V��FlSi-�1��9���/t$���l`7E�ma��代Y'Cc�� h����f�p�x���Ge}~u��H�r LM�Va��~��l>v
�n��b��/i��O%,r$Q"�3K�~�q�����w����"��p��I��pktormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     �include "Library/Macro/FragPosFinal.glsl"

}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (unifo[ms,samplers, transforms ... )
//#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

v{id main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif�
