�GSN    �L&�D���Z��lBعزᧇB+��È���f��Z�$��8� WO��0'>l����-�3KH�(m��������Z��x�o�*R�Ƕ�$�b�7qF��A��E�T��%(�!x��z���]���<�P�oV�t_a5�Br?������ۅγZַ���Q�<qp����Z9\ʭ3�5��'�f���{j�����IN$���x���g��ֆ	�*�	�,~A���Zڤ����g��{�m��*��v�F7�3g�#o�0��SW�&R7�����9�~tK��}"8���j�� .I���'��,�=OtfeRۙ�Z�mrQ;�c��U�" S�=�`dH���h��l�S��F?��d���V��L��^M��F��?C[]
�/ێ�fք87Tq���
 &[w
�/C�Ʃ��[fE{��E����j�g�t���9B u{��X�i+c�Ei��A��Y0lzz�~��W��/x��N1Gt`H�`��>����>����&�S�}� �R�B �Dvg;
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   //gl_Position.x = u *�2.0 - 1.0;
   //gl_Position.y = v * 2.0 - 1.0;

   v_position = gl_Position;
}

#endif


/// Frag shader
#ifdef FS
M#define USING_INOUT_POSITION
#include "Library/Varying.glsl"


#include "Library/Common.glsl"

void main()
{
    //floa] depth = v_position.z / v_position.w * 0.5 + 0.5;
    //gl_FragColor = vec4(EncodeDepth(depth),1.0);
    gl_FragColor = vec4_gplat(0);
}

#endif
