package com.example.iocanddi.model;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    public void move(){
        System.out.println("Hello Vehicle");
    }

}
