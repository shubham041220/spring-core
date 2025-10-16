package com.shubham.practise;

public class Car {
    Engine engine;


    public  Car(Engine engine){
        this.engine=engine;
        engine.run();
    }
}
