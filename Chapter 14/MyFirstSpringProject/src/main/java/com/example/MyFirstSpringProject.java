package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyFirstSpringProject {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            CalculatorService calculatorService = context.getBean(CalculatorService.class);

            int sum = calculatorService.add(300, 19);
            int product = calculatorService.multiply(8, 24);

            System.out.println("Sum of 300 and 19 is: " + sum);
            System.out.println("Product of 8 and 24 is: " + product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

