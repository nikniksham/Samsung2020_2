package com.company;

import java.util.Scanner;

/*

package com.company;

public class _Double {
    private double self;

    public _Double(double self) {this.self = self;}

    public double multiplication(double other) {return self * other;}
    public double division(double other) {return self / other;}
    public double add(double other) {return self + other;}
    public double Subtraction(double other) {return self - other;}
    public double getSelf() {return self; }

    public void setSelf(double self) { this.self = self; }
}

 */
public class Main {
    public static void main(String[] args) {
        _Double a = new _Double(12.4);
        System.out.println(a.multiplication(3.2));
        System.out.println(a.division(3.2));
        System.out.println(a.add(3.2));
        System.out.println(a.Subtraction(3.2));
    }
}
