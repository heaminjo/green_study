package com.example.test01.iocDI_xml;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class Speaker{


    public Speaker(){
        System.out.println("speaker 기본 생성자");
    }

    public void volumeUp(){System.out.println("ScTV volumeUp");}
    public void volumeDown(){System.out.println("ScTV volumeDown");}


}
class SsTVs implements TV{
    private Speaker speaker;
    private String color;
    private int price;

    public SsTVs(){
        System.out.println("ss기본 생성자");
    }

    public SsTVs(Speaker speaker, String color, int price) {
        this.speaker = speaker;
        this.color = color;
        this.price = price;
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
//생성자 주입
class LgTVs implements TV{
    private Speaker speaker;
    private String color;
    private int price;

    public LgTVs(){
        System.out.println("lg기본 생성자");
    }

    public LgTVs(Speaker speaker, String color, int price) {
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
//setter 주입
class AiTVs implements TV{
    private Speaker speaker;
    private String color;
    private int price;

    public AiTVs(){
        System.out.println("ai기본 생성자");
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
    public void powerOn(){System.out.println("AiTV turnOn");};
    @Override
    public void powerOff(){System.out.println("AiTV turnOff");};
    @Override
    public void volumeUp(){System.out.println("AiTV soundUp");};
    @Override
    public void volumeDown(){System.out.println("AiTV soundDown");};

}
public class TVUser03 {
    public static void main(String[] args) {
        //스프링 컨테이너 생성
        AbstractApplicationContext sc = new GenericXmlApplicationContext("app03.xml");

        TV sstv = (TV)sc.getBean("sstv");
        sstv.powerOff();

        TV lgtv = (TV)sc.getBean("lgtv");
        lgtv.volumeUp();
        TV aitv = (TV)sc.getBean("aitv");
        aitv.powerOn();
        System.out.println(aitv.toString());
        Speaker sp = (Speaker) sc.getBean("sp");
        sp.volumeDown();
    }
}
