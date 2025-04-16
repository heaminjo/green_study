package com.example.test01.iocDI_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser02 {
    public static void main(String[] args) {
        //스프링 컨테이너 생성
        AbstractApplicationContext sc = new GenericXmlApplicationContext("app02.xml");


        TV tv = (TV)sc.getBean("tv");
            tv.powerOn();
            tv.volumeDown();
            tv.volumeUp();
            tv.powerOff();


    }
}
