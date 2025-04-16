package com.example.test01.iocDI03_jc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig09 {
    @Bean
    public TV sstv() {return new ssTVi();}

    @Bean
    public TV lgtv() {return new lgTVi(sp(),"blue",1000);}

    public Speaker sp() { return new Speaker();}

    @Bean
    public TV aitv(){ return new AiTVs();}
}
