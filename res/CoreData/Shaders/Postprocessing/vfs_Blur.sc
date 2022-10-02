�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�?zw/$֦�v�u���[�_�Rg� ���ɖa��/a�Vt�=
�B�!a��BRm�T�@>�[0�J;��lL�����T�6m�cW������q����[j���,��XE({��״�}?3��k	W�mc������qX��M��=��=,T>��������(&�i;pRh��ƽ��+i��Îp�]y.5G�㵃��cl��-��s�qDN�X�����;j�� �*��lԥ��v�P��b��MQ��p�sdI�e0�W�N����$.�k���p�bK�#�q~씔[�?�ϖ��Og�^E�,Z����5����& ��!�Sq�v2��]�ҨbӲB��r�#�,��R��'k-7|��`��e�{Ϙ:���3$R��#�[3Q*��[����t�˹F������y"��Ģ?t0�`P�4C�a�x^:oSe�����yorms ... )
#include "../Library/Common.glsl"
#include "../Library/Lighting.glsl"

#define LENGTH 0.0025

void main()
{
�   vec4 color = texture2D(u_diffuseTex,v_texcoord0);
     vec4 sum = vec4(0.0);

           // blur in y (vertical) take nin6 samples, with the distance LENGTH between them
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 4.0 * LENGTH, v�texcoord0.y)) * 0.05;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
  Z        sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += texture2D(_diffuseTex, vec2(v_texcoord0.x -       LENGTH, v_texcoord0.y)) * 0.15;
           sum += texture2D(u_diffuseTex, vec2(v_texco�rd0.x, v_texcoord0.y)) * 0.16;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x +       LENGTH, v_texcoord0.y)) * \.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += t�xture2D(u_diffuseTex, vec2(v_texcoord0.x + 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
           sum += texture2D(u_diffuseTex, vec�(v_texcoord0.x + 4.0 * LENGTH, v_texcoord0.y)) * 0.05;

           gl_FragColor = sum;
}

#endif
