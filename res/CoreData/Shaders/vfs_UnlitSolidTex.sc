�GSN    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��.Z��y�	#�7as*����y�7)Z��zÊk�h#��j�{Z���ՌG�<��MZ�SmZ�jN	��ݢ��릣�Lgђ���.R�5{>����]$W��r�l �g�l�פ1I�����J'���Th@۶�w��S��>�&��mk@䱃y����ǫjڲv�g�����e�<� a�+���m=O��ϖ�&�@3��o@\�F�&��0.gȻ�K��~�
2si ���F�ee]Y��K�U�$8 �?�Jl�t��r��v�N�Qc�=���׵H��WN����Ac]]
���}���/s7Ɣ�)`!A�4����&/��R���m�r�{���<b&0Z1G��<�c1aa�qA��?��a9k@�<A��S��iK��X
+{kZO6�b*�~�~�����s����2�Y�v�	��_�	m7 transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = text�re2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a);
}

#endif
