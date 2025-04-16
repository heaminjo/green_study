package com.example.test01.iocDI02_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;


interface Speakeri {
    void volumeUp();
    void volumeDown();
} //Speakeri

@Component("sA")
@Lazy
class SpeakerA implements Speakeri {
    public SpeakerA() { System.out.println("~~ SpeakerAAA Default 생성자 ~~"); }
    @Override
    public void volumeUp() { System.out.println("~~ SpeakerAAA volumeUp ~~"); }
    @Override
    public void volumeDown() { System.out.println("~~ SpeakerAAA volumeDown ~~"); }
} //SpeakerA

@Component("sB")
@Lazy
class SpeakerB implements Speakeri {
    public SpeakerB() { System.out.println("~~ SpeakerBBB Default 생성자 ~~"); }
    @Override
    public void volumeUp() { System.out.println("~~ SpeakerBBB volumeUp ~~"); }
    @Override
    public void volumeDown() { System.out.println("~~ SpeakerBBB volumeDown ~~"); }
} //SpeakerB


@Component("lgtv")
class LgTV implements TV {

    @Autowired(required = false)
    @Qualifier("sA")
    private Speakeri speaker;
    private String color;
    private int price;

    public LgTV(){
        System.out.println("lg기본 생성자");

    }

    public LgTV(Speakeri speaker, String color, int price) {
        this.speaker = speaker;
        this.color = color;
        this.price = price;
    }

    @Override
    public void powerOn(){System.out.println("LgTV turnOn");};
    @Override
    public void powerOff(){System.out.println("LgTV turnOff");};
    @Override
    public void volumeUp(){System.out.println("LgTV soundUp");};
    @Override
    public void volumeDown(){System.out.println("LgTV soundDown");};

}
public class TVUser07_Speakeri {
    AbstractApplicationContext cs = new AnnotationConfigApplicationContext(AnnoConfig.class);
    TV tv = (TV) cs.getBean("lgtv");
}
