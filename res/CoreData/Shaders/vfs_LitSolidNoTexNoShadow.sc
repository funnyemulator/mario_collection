�GSN    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�P�ڱ������.Z��Y�%M�$\T ������q8}��z��,�W&���{#T����C���?��2�4<c�yLu2������̌��f2�ͱ��
a�QK���/�qb��0�p�,�U���Od㊴v��/	���8-#���k����j���ckT���%������oǽ8�	ť��[�	z�|*�ey�,���oe��Ό�9�5��=@\���j��s`'j���uŇO�&E:<m݃�$�BY�'�H�P�k}~�f�Jl�t��r��v�N�Qc�=���׵B��LH��t��NnMV�]��W�/U��(y=���E'V�f7��赾X&j`��C	�e�s�f��eHW%X*���'B�Jg��GK��n>`
�{u��@�� t��MM"p6QH�=*�P�?�Ծ����
��"��J�n�1M�O�o1N
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, �ransforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{

    vec3 environmentColo5 = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + envi[onmentColor) * u_matDiffColor.rgb,1.0);
}

#endif
