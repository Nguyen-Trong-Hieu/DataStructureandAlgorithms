package com.example.DataStructureandAlgorithms;

import java.util.Scanner;

public class Baitap12 {
    //Tính tổng vd n = 1234 => s = 1 + 2 + 3 + 4 = 10
    private static final Scanner scanner = new Scanner(System.in);
    public static int Dec10 = 10;

    public static void main(String[] args) {
        System.out.println("Nhập n");
        int n  = scanner.nextInt();
        System.out.println("Gía trị "+SumN(n));
    }

    public static int SumN(int n ){
        int s= 0;
        do{
            s = s+n%10;
            n = n/Dec10;
        }
        while (n>0);
        return s;
    }
}
