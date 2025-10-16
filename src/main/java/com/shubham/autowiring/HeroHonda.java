package com.shubham.autowiring;

public class HeroHonda {
    Bike bike;

    public HeroHonda(Bike bike){

        this.bike=bike;
    }
    public HeroHonda(){
        System.out.println("default const from HEROHONDA");
    }
    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        System.out.println("setEngine() method called");
        this.bike = bike;
    }

    public void getrun(){
        System.out.println(bike);
    }
}
