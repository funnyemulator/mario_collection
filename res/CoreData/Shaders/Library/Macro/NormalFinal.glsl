�GSN    ���!��	7	)@c3wo\���^H�?���Wg0Ĝ��A�^�d��
W�{r�y"&/6�
U^���a��N�̨�nW�]q�l��܆���҂X.h�Wu�\ �h�Q ���^~j��$Z�[E�m�<�N#��ӡ�c�>S��d~������玮�!�����u+0Y�$ڴ��:Wl2��U$*�0 ϣ����qM��A��!��|n/�����ù�b�3t`W~=��ܿ��&SE�����`o.3_������m+��b��^&�sXF�B��W�r�&���4{꥟�s���W)��M��f� -�Nj�F�����$@��Ѽ �I;�Da��qT*k���]�;�N����#�# �,c���r����8Px\���q	T�7k��H�����H��x�/���r��Bb\'^��Z��;���1���92N��[�@=G��d�ɮ�k�������hҽ�F��ۣlRV1�j[�8 �x�:oqeY3�����[? normal = mul(inverseTransposeWorldMatrix , normal);
    #else
    normal = mul(u_model[0], vec4(normal,0.0)).xyz;
    #endi�
#endif

    v_normal = normalize(normal.xyz);
