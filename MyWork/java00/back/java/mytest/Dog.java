package com.example.test01.mytest;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal{

    public Dog() {System.out.println("dog 기본 생성자");};

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
