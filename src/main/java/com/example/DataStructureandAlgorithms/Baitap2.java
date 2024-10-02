package com.example.DataStructureandAlgorithms;

import java.util.Scanner;

public class Baitap2 {
    //Viết chương trình tính giai thừa của một số nguyên dương n . n nhập.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Giai thua "+n + "là "+ DeQui(n));
    }

    public static long DeQui(int n){
        if(n>0){
            return n*DeQui(n-1);
        }
        else {
            return 1;
        }
    }
}
