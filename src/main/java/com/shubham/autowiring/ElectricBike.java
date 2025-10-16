package com.shubham.autowiring;

public class ElectricBike implements Bike{

    public void run(){
        System.out.println("Electric Bike is called");
    }
    public ElectricBike(){
        System.out.println("Electric Bike constructor called");

    }
}
