�GSN    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��#Q��b�LV�2FV���� �H���f��`�*��9�&Cû!�׍V���(��DS�jF�S/i���������l2���m�YA���5�ck��\�G-��C�i���}_!��K��U3Ʉ�dGܷ�b����@�M��dpC����ټ��M���,�d���7�f*�+c�(׶_U�=Q+�k�Ғ�eW�25��}#5���&�?�10
qԴ�h��c�V,F'~(���_�eu[�*��4�8Yy�=�`l�:��n��O!�BI��J>ߩ'\�Ձ	��2D��~H��^��CqQ7l�_��W�f��4sq���ARh	<�u-�����OjK`��#�蕜'�x�y���&bT`m��e�_,JKH�Fc�f?ݭs"c �p}�	�8��#{��DCOsd�h�'�����L��n��.�S�l��.�P�fklarying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.gls�"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a)|
}

#endif
