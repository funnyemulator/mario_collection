�GSN    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��.Z��y�	#�7as*����y�7)Z��zÊk�h#��D�:]�����Z���*�_�BM�oPtb�5Pld�������ɯ�e:����#W�>ls�@�N7@Ը|�x��g� ���+_!ˬ�G��:r���2Sg���ķ��?�"�D�k{_���x������-ӽi�!ť*���7�r-�e%�OߛyU�of�c�̊�k[�GyJ��mb���)��:6l���i��"�8Fv R����a~BS�7��O�0$�x�Jl�2��zé#���g'~�0G�����f���� �iSF�ۜ�yU��ip���JT`+
�4e�ק��&=��h����o�{�a�OHZh��	�7B?KK�Sj��n��tl/�rb�	�F��{=��B6$YF!�)B��#���ʄ��C��+�Q�9�V�B�m�|%^edViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Posit�on.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Comm(n.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
