package com.example.test01.iocDI04_LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component("lcI")
class LifeCycleI implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("destory()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()");
    }

    public LifeCycleI(){ System.out.println("LifeCycleI 기본 생성자");};
    public void begin(){System.out.println("LifeCycleI begin()");}
    public void end(){System.out.println("LifeCycleI end()");}
    public void login(){System.out.println("LifeCycleI login()");}
    public void list(){System.out.println("LifeCycleI list()");}
}
public class LC03_interface {
    public static void main(String[] args) {
        AbstractApplicationContext sc = new AnnotationConfigApplicationContext(AnnoConfig2.class);

        LifeCycleI lcI = (LifeCycleI) sc.getBean("lcI");
        lcI.login();
        lcI.list();
        sc.close();
    }
}
