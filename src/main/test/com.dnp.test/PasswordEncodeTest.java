package com.dnp.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

/**
 * Created by huazai on 2018/12/13.
 */
public class PasswordEncodeTest {
    public static void main(String[] args) {
        String pwdEncode = new BCryptPasswordEncoder().encode("123456");
        System.out.println("pwdEncode = " + pwdEncode);
        String xx =PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("123456");
        System.out.println("xx = " + xx);
    }
}
