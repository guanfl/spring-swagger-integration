/**
* ClassName : TestApplication.java
* Create on ：2017年1月12日
* Copyrights 2017 guanfl All rights reserved.
* Email : guanfl@foxmail.com
*/
package com.github.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import springfox.documentation.spring.web.plugins.Docket;

public class TestApplication {
   
    @Test
    public void testGetBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml","classpath:spring/spring-mvc.xml");
        Assert.isNull(context.getBean(Docket.class), "空的");
    }
}
