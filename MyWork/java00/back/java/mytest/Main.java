package com.example.test01.mytest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext sc = new AnnotationConfigApplicationContext(AdoptConfig.class);

        //구매
        Buy buy = (Buy)sc.getBean("buy");

        buy.complete();
    }
}
