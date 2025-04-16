package com.example.test01.iocDI02_anno;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

//interface TV{
//    void powerOn();
//    void powerOff();
//    void volumeUp();
//    void volumeDown();
//}
//@Component("lgtv")
//@Lazy
//class lgTVi implements TV {
//    public lgTVi() {
//        System.out.println("lg 기본 생성");
//    }
//
////    @Autowired
////    @Qualifier("speakerA")
////    private Speaker speaker;
//
//    @Override
//    public void powerOn(){System.out.println("lgTV turnOn");};
//    @Override
//    public void powerOff(){System.out.println("lgTV turnOff");};
//    @Override
//    public void volumeUp(){System.out.println("lgTV soundUp");};
//    @Override
//    public void volumeDown(){System.out.println("lgTV soundDown");};
//}
//@Component("sstv")
//@Lazy
//class ssTVi implements TV {
//    public ssTVi() {
//        System.out.println("ss 기본 생성!");
//    }
//
//    @Override
//    public void powerOn(){System.out.println("ScTV turnOn");};
//    @Override
//    public void powerOff(){System.out.println("ScTV turnOff");};
//    @Override
//    public void volumeUp(){System.out.println("ScTV soundUp");};
//    @Override
//    public void volumeDown(){System.out.println("ScTV soundDown");};
//}
//
//@Component("aitv")
//@Lazy
//class AiTVs implements Speaker{
//    private Speaker speaker;
//    private String color;
//    private int price;
//
//    public AiTVs(){
//        System.out.println("ai 기본 생성");
//    }
//
//    public Speaker getSpeaker() {
//        return speaker;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setSpeaker(Speaker speaker) {
//        this.speaker = speaker;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    @Override
//    public void volumeUp(){System.out.println("AiTV soundUp");};
//    @Override
//    public void volumeDown(){System.out.println("AiTV soundDown");};
//
//}
public class TVUser05{
    public static void main(String[] args) {
        //스프링 컨테이너 생성'
//        AbstractApplicationContext sc = new GenericXmlApplicationContext("app02.xml");

        AbstractApplicationContext sc = new AnnotationConfigApplicationContext(AnnoConfig.class);

//        TV tv = (TV)sc.getBean("sstv");
//        tv.powerOn();
//        tv.volumeDown();
//        tv.volumeUp();
//        tv.powerOff();


        sc.close();
    }
}
