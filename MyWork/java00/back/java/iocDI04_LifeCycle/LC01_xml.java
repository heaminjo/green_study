package com.example.test01.iocDI04_LifeCycle;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


class LifeCycle{
    public LifeCycle(){ System.out.println("LifeCycle 기본 생성자");};
    public void begin(){System.out.println("LifeCycle begin()");}
    public void end(){System.out.println("LifeCycle end()");}
    public void login(){System.out.println("LifeCycle login()");}
    public void list(){System.out.println("LifeCycle list()");}
}
public class LC01_xml {
    public static void main(String[] args) {
        AbstractApplicationContext sc = new GenericXmlApplicationContext("lc01.xml");

        LifeCycle lc = (LifeCycle) sc.getBean("lc");

        lc.login();
        lc.list();
        sc.close();
    }
}
