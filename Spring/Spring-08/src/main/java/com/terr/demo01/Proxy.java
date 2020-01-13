package com.terr.demo01;

public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
        seeHouse();
        fare();
    }
    public  void seeHouse(){
        System.out.println("中介带你看房");
    }

    public  void fare(){
        System.out.println("中介收中介费");
    }
}
