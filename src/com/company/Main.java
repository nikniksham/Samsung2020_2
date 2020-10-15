package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car car1 = new Car("Красненькая", in.nextInt(), "Спортивная", in.nextDouble());
        car1.printParams();
        Vehicle vehicle = new Vehicle("Самолёт делает бжжж", in.nextInt(), "Бжжж делающий");
        vehicle.printParams();
    }
}
