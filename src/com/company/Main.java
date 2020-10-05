package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[][] m = new int[x][x];
        fillMatrix(m, scan);
        checkSMatrix(m);
    }

    public static void fillMatrix(int[][] x, Scanner scan) {
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {x[i][j] = scan.nextInt();}}}

    public static void fillMatrix2(int[][] x) {
        int l = x.length;
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {
            if (i + j == l - 1) {x[i][j] = 1;}
            else if (i + j > l - 1) {x[i][j] = 2;}}}}

    public static void printMatrix(int[][] x) {
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {System.out.print(x[i][j] + " ");}System.out.println();}}

    public static void printMatrix1(int[][] x) {
        for (int j = 0; j < x[0].length; j++) {for (int i = x.length - 1; i >= 0; i--) {System.out.print(x[i][j] + " ");}System.out.println();}}

    public static void checkSMatrix(int[][] x) {
        boolean s = true;
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {
            if (x[i][j] != x[j][i] && i != j) {s = false;}}}
        System.out.println((s ? "yes" : "no"));
    }
}