package org.example;

public class Dengine implements IEngine{

    Dengine(){
        System.out.println("Diesel engine");
    }
    public int start(){
        System.out.println("Diesel engine");
        return 1;

    }
}
