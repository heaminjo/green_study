package com.example.test01.iocDI03_jc;

import com.example.test01.iocDI02_anno.AnnoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

interface Speakeri {
    void volumeUp();
    void volumeDown();
} //Speakeri

@Component("sA")
class SpeakerA implements Speakeri {
    public SpeakerA() { System.out.println("~~ SpeakerAAA Default 생성자 ~~"); }
    @Override
    public void volumeUp() { System.out.println("~~ SpeakerAAA volumeUp ~~"); }
    @Override
    public void volumeDown() { System.out.println("~~ SpeakerAAA volumeDown ~~"); }
} //SpeakerA

class SpeakerB implements Speakeri {
    public SpeakerB() { System.out.println("~~ SpeakerBBB Default 생성자 ~~"); }
    @Override
    public void volumeUp() { System.out.println("~~ SpeakerBBB volumeUp ~~"); }
    @Override
    public void volumeDown() { System.out.println("~~ SpeakerBBB volumeDown ~~"); }
} //SpeakerB

public class TVUser10_Speakeri {
    public static void main(String[] args) {
        AbstractApplicationContext cs = new AnnotationConfigApplicationContext(javaConfig10.class);
        Speakeri spa = (Speakeri) cs.getBean("sA");

        spa.volumeDown();

        Speakeri spb = (Speakeri) cs.getBean("spb");
        spb.volumeDown();


    }
}
