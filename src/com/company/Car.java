package com.company;

public class Car extends Vehicle{
    private double mileage;
    public Car(String name, int mass, String type, double mileage) {
        super(name, mass, type);
        this.setMileage(mileage);
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void printMileage() {
        System.out.println("Mileage: " + this.getMileage() + " km");
    }

    public void printParams() {
        System.out.println("Name: " + this.getName());
        System.out.println("Mass: " + this.getMass());
        System.out.println("Type: " + this.getType());
        System.out.println("Mileage: " + this.getMileage() + " km");
    }
}
