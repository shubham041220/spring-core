package org.example;

public class PEngine implements IEngine{

    PEngine()
    {
        System.out.println("petrol Engine constructor");
    }
    public int start()
    {
        System.out.println("starting P");
        return 1;
    }


}

