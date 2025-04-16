package com.example.test01.iocDI_xml;


class SsTV{
    public void turnOn(){System.out.println("ScTV turnOn");}
    public void turnOff(){System.out.println("ScTV turnOff");}
    public void soundUp(){System.out.println("ScTV soundUp");}
    public void soundDown(){System.out.println("ScTV soundDown");}
}
class LgYV{
    public void powerOn(){System.out.println("ScTV powerOn");}
    public void powerOff(){System.out.println("ScTV powerOff");}
    public void volumeUp(){System.out.println("ScTV volumeUp");}
    public void volumeDown(){System.out.println("ScTV volumeDown");}
}

interface TV{
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

class lgTVi implements TV{
    @Override
    public void powerOn(){System.out.println("lgTV turnOn");};
    @Override
    public void powerOff(){System.out.println("lgTV turnOff");};
    @Override
    public void volumeUp(){System.out.println("lgTV soundUp");};
    @Override
    public void volumeDown(){System.out.println("lgTV soundDown");};
}

class ssTVi implements TV{
    @Override
    public void powerOn(){System.out.println("ScTV turnOn");};
    @Override
    public void powerOff(){System.out.println("ScTV turnOff");};
    @Override
    public void volumeUp(){System.out.println("ScTV soundUp");};
    @Override
    public void volumeDown(){System.out.println("ScTV soundDown");};
}

class BeanFactory{
    public TV getBean(String tv){
        if(tv != null && tv.equals("ss")){
            return new ssTVi();
        }else if(tv != null && tv.equals("lg")) {
            return new lgTVi();
        }else{
            return null;
        }
    }
}
public class TVUser01 {
    public static void main(String[] args) {
//        TV tv = new ssTVi();
//        tv.powerOn();
//        tv = new lgTVi();
//        tv.powerOff();

        BeanFactory factory = new BeanFactory();
        TV tv = factory.getBean("ss");

//        if(tv != null){
//            tv.powerOn();
//            tv.volumeDown();
//            tv.volumeUp();
//            tv.powerOff();
//        }else{
//            System.out.println("tv 선택 에러");
//        }
    }
}
