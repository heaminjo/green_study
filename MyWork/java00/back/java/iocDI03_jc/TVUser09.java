package com.example.test01.iocDI03_jc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

interface TV{
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
//@Component("lgtv")
//@Lazy
class lgTVi implements TV {

    private Speaker speaker;
    private String color;
    private int price;
    public lgTVi() {
        System.out.println("lg 기본 생성");
    }

    public lgTVi(Speaker speaker, String color, int price) {
        this.speaker = speaker;
        this.color = color;
        this.price = price;
    }
//    @Autowired
//    @Qualifier("speakerA")
//    private Speaker speaker;

    @Override
    public void powerOn(){System.out.println("lgTV turnOn");};
    @Override
    public void powerOff(){System.out.println("lgTV turnOff");};
    @Override
    public void volumeUp(){System.out.println("lgTV soundUp");};
    @Override
    public void volumeDown(){System.out.println("lgTV soundDown");};
}
//@Component("sstv")
//@Lazy
class ssTVi implements TV {
    public ssTVi() {
        System.out.println("ss 기본 생성!");
    }

    @Override
    public void powerOn(){System.out.println("ScTV turnOn");};
    @Override
    public void powerOff(){System.out.println("ScTV turnOff");};
    @Override
    public void volumeUp(){System.out.println("ScTV soundUp");};
    @Override
    public void volumeDown(){System.out.println("ScTV soundDown");};
}
class Speaker{
    public Speaker(){
        System.out.println("speaker 기본 생성자");
    }

    public void volumeUp(){System.out.println("ScTV volumeUp");}
    public void volumeDown(){System.out.println("ScTV volumeDown");}
}
@Component("aitv")
@Lazy
class AiTVs implements TV{

    @Autowired(required = false)
    private Speaker speaker;
    private String color;
    private int price;

    public AiTVs(){
        System.out.println("ai 기본 생성");
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void powerOn() {
        System.out.println("aitv power On");
    }

    @Override
    public void powerOff() {

    }

    @Override
    public void volumeUp(){System.out.println("AiTV soundUp");};
    @Override
    public void volumeDown(){System.out.println("AiTV soundDown");};

}
//interface Speakeri {
//    void volumeUp();
//    void volumeDown();
//} //Speakeri

public class TVUser09 {

    public static void main(String[] args) {
        AbstractApplicationContext sc = new AnnotationConfigApplicationContext(JavaConfig09.class);

        TV sstv = (TV) sc.getBean("sstv");
        sstv.powerOff();

        TV lgtv = (TV) sc.getBean("lgtv");
        lgtv.powerOff();

        TV aitv = (TV) sc.getBean("aitv");
        aitv.powerOn();
    }
}
