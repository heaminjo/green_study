package com.example.test01.mytest;

import org.springframework.beans.factory.annotation.Autowired;

//구매
public class Buy {

    //분양 받을 동물
    @Autowired
    private Animal animal;

    private String name;

    public Buy() {}

    public Buy(Animal animal, String name) {
        this.animal = animal;
        this.name = name;
    }
    //구매 완료 동물 sound
    public void complete(){
        System.out.println("구매완료");
        animal.sound();
    } 
}
