package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
        int[][] m = new int[x][y];
        fillMatrix(m, scan);
        System.out.println(y + " " + x);
        printMatrix1(m);
    }

    public static void fillMatrix(int[][] x, Scanner scan) {
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {x[i][j] = scan.nextInt();}}}

    public static void printMatrix(int[][] x) {
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {System.out.print(x[i][j] + " ");}System.out.println();}}

    public static void printMatrix1(int[][] x) {
        for (int j = 0; j < x[0].length; j++) {for (int i = x.length - 1; i >= 0; i--) {System.out.print(x[i][j] + " ");}System.out.println();}}

    }