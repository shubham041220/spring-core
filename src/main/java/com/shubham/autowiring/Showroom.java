package com.shubham.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Showroom {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        HeroHonda activa=applicationContext.getBean(HeroHonda.class);
        activa.getrun();

}}
