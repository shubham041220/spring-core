package com.shubham.autowiring;

public class PetrolBike implements Bike{
    public void run(){
        System.out.println("Petrol Bike is called");
    }
    public PetrolBike(){
        System.out.println("Petrol Bike constructor called");
    }
}
