package org.example;

public class Car {

    IEngine engine;

    Car(){
        System.out.println("car constructor");
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    void run(){
        int start=engine.start();
        if(start >0)
            System.out.println("car started with "+ engine);
        else
            System.out.println("NO ENGINE");
    }
}
