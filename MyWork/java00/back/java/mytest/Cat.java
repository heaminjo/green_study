package com.example.test01.mytest;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal{

    public Cat() {System.out.println("cat 기본 생성자");};

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
