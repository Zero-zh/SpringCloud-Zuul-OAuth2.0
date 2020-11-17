package com.itheima.distributed;

import org.springframework.security.crypto.bcrypt.BCrypt;

//@Test
public class Test {

    @org.junit.Test
    public void testBCrypt(){

        //对密码进行加密
        String hashpw = BCrypt.hashpw("123",BCrypt.gensalt());
        System.out.println(hashpw);

        //校验密码
        boolean checkpw = BCrypt.checkpw("secret","$2a$10$OUTYbtFAiTaQm3ZaD2mY1.GLG6V5oqPtLHqgs6yIg1pBKQFWAOGry");
//        boolean checkpw1 = BCrypt.checkpw("123",hashpw);
        System.out.println(checkpw);
//        System.out.println(checkpw1);
    }


}
