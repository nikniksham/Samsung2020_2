package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[][] m = new int[2 * x + 1][2 * x + 1];
        fillMatrix4(m);
        printMatrix3(m);
    }

    public static void fillMatrix(int[][] x, Scanner scan) {
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {x[i][j] = scan.nextInt();}}}

    public static void fillMatrix2(int[][] x) {
        int l = x.length;
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {
            if (i + j == l - 1) {x[i][j] = 1;}
            else if (i + j > l - 1) {x[i][j] = 2;}}}}

    public static void fillMatrix2(int[][] x, int _x, int _y) {
        for (int i = 0; i < _x * _y; i++) {
            x[i / _x][i % _x] = (i / _x) * (i % _x);
        }}

    public static void printMatrix(int[][] x) {
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {System.out.print(x[i][j] + " ");}System.out.println();}}

    public static void printMatrix1(int[][] x) {
        for (int j = 0; j < x[0].length; j++) {for (int i = x.length - 1; i >= 0; i--) {System.out.print(x[i][j] + " ");}System.out.println();}}

    public static void printMatrix2(int[][] x) {
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {System.out.printf("%4d", x[i][j]);}System.out.println();}}

    public static void printMatrix3(int[][] x) {
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {System.out.printf("%3d", x[i][j]);}System.out.println();}}

    public static void fillMatrix3(int[][] x) {
        int num = 0; boolean a = true;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) { if (a) {x[i][j] = num++;} else {x[i][j] = num--;}}
                if (a) {num--;} else {num++;} num += x[i].length; a = !a;}}

    public static void fillMatrix4(int[][] m) {
        int xSize = m.length, ySize = m.length, dx = 0, dy = 1;
        int x = xSize - 1, y = 0;
        for (int i=xSize * ySize - 1; i > 0; --i) {
            m[y][x] = i;
            if (dy == 1 && (y + dy == ySize || m[y + dy][x] != 0)) {
                dy = 0; dx = -1;
            }
            else if (dx == -1 && (x + dx == -1 || m[y][x + dx] != 0)) {
                dx = 0; dy = -1;
            }
            else if (dy == -1 && (y + dy == -1 || m[y + dy][x] != 0)) {
                dx = 1; dy = 0;
            }
            else if (dx == 1 && (x + dx == xSize || m[y][x + dx] != 0)) {
                dy = 1; dx = 0;
            }
            y += dy; x += dx;
        }
    }

    public static void checkSMatrix(int[][] x) {
        boolean s = true;
        for (int i = 0; i < x.length; i++) {for (int j = 0; j < x[i].length; j++) {
            if (x[i][j] != x[j][i] && i != j) {s = false;}}}
        System.out.println((s ? "yes" : "no"));
    }
}