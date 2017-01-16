/**
* ClassName : TestMapInsert.java
* Create on ：2017年1月3日
* Copyrights 2017 guanfl All rights reserved.
* Email : guanfl@foxmail.com
*/
package com.github.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestMapInsert {
    
    @Test
    public void testInsert(){
        Map<String,String> map = new HashMap<>();
        for(int i = 0 ; i < 10; i ++){
            map.put("key", i + "helo");
        }
        System.out.println(map);
    }

}
