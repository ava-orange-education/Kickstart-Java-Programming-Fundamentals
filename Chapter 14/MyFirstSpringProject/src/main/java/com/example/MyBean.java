package com.example;

public class MyBean {
    private String propertyName;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void printProperty() {
        System.out.println("Property Value: " + propertyName);
    }
}
