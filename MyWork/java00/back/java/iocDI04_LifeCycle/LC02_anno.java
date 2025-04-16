package com.example.test01.iocDI04_LifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
//
//@Component("lcA")
//class LifeCycleA{
//    public LifeCycleA(){ System.out.println("LifeCycleA 기본 생성자");};
//    @PostConstruct
//    public void begin(){System.out.println("LifeCycleA begin()");}
//    @PreDestroy
//    public void end(){System.out.println("LifeCycleA end()");}
//    public void login(){System.out.println("LifeCycleA login()");}
//    public void list(){System.out.println("LifeCycleA list()");}
//}
//public class LC02_anno {
//    public static void main(String[] args) {
//        AbstractApplicationContext sc = new AnnotationConfigApplicationContext(AnnoConfig2.class);
//
//        LifeCycleA lcA = (LifeCycleA) sc.getBean("lcA");
//        lcA.login();
//        lcA.list();
//        sc.close();
//    }
//}
