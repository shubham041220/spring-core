package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car=new Car();
        PEngine petrol=new PEngine();
        car.setEngine(petrol);
        car.run();



    }
}
