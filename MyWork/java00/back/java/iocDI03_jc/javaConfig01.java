package com.example.test01.iocDI03_jc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig01 {
    //직접 수동적으로 bean을 생성 후 넘겨준다.
    @Bean
    public TV tv(){return new ssTVi();}

    @Bean
    public TV lgtv(){return new lgTVi();}
}
