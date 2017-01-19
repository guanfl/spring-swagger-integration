/**
* ClassName : SwaggerConfig.java
* Create on ：2017年1月12日
* Copyrights 2017 guanfl All rights reserved.
* Email : guanfl@foxmail.com
*/
package com.github.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()); 
    }
    
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("测试API接口文档").description("guanfl©2017 Copyright. Powered By https://github.com/guanfl")
                .contact(new Contact("guanfl", "", "guanfl@foxmail.com")).license("Apache License Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html").version("2.0").build();
    }
}
