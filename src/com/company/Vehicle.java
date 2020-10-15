package com.company;

public class Vehicle {
    private String name;
    private int mass;
    private String type;
    public Vehicle(String name, int mass, String type) {
        this.setName(name);
        this.setMass(mass);
        this.setType(type);
    }

    public void printParams() {
        System.out.println("Name: " + this.getName());
        System.out.println("Mass: " + this.getMass());
        System.out.println("Type: " + this.getType());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
