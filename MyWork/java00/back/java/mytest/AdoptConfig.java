package com.example.test01.mytest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//분양 시스템
@Configuration
public class AdoptConfig {

    //구매 Bean 생성자 주입
    @Bean
    public Buy buy(){
        return new Buy(animal(),"나비");
    }

    //구매할 동물
    //구매할 동물을 바꾸고 싶은 경우 Component를 건드리지않고
    //설정파일에서만 변경해주면 된다.
    @Bean
    public Animal animal(){
        return new Dog();
    }
}
