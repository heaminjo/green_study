package com.example.test01.iocDI03_jc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.test01.iocDI03_jc")
public class javaConfig10 {

    @Bean
    public Speakeri spb(){return new SpeakerB();}

}
