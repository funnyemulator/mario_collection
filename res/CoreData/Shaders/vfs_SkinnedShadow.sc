�GSN    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�T�پ���u��)W��h�L!�jc9����$��*}��{��`�wm��V�7D��W��Q���!�&�QF�hY=+�*O"K���ٟ�����e8��ʹ�$X�#sm����]8]��a�fI��g�)���l^"ī���#i���q۾�i�����%��{6n���8������!���u��C���?�N�@�e��P�,\0�h����9�W4u��f"y���r��+b���k��.�rk
t=%RÀ�L�x~C�c�U�Z�N^S�=�,#N�t��&��o�{D��L~��<���H��f����8�d[�	��W�h��.d%���Y)Pe�$g�ɩ��2)���镄)�$�(��Jdl���%VPZ�X��?��a#nQ�j<�@�G��'n��E!J,XT5�2S�B�j�����x����3��9�;�Z�S�I-_wport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x�= u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Common.gl4l"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
