package com.example.iocanddi;

import com.example.iocanddi.model.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocAndDiApplication {

    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(IocAndDiApplication.class, args);

        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.move();
        System.out.println("hello");
    }

}
