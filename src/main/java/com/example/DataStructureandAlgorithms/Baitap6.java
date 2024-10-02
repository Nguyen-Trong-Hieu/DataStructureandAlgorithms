package com.example.DataStructureandAlgorithms;

import java.util.Scanner;

public class Baitap6 {
    //Fibonacci F0 = 0 , F1 = 1 , F2 = 1 , Fn = F(n-1) + F(n-2) với n >=2.
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập N ");
        int n = scanner.nextInt();
        for (int i =0;i< n;i++){
            System.out.print(FiboRecursion(i)+ " ");
        }
    }

    public static int FiboRecursion(int n){
        if(n>0 && n !=1){
            return FiboRecursion(n - 1) + FiboRecursion(n-2);
        }
        else if(n == 0 || n ==1){
            return n;
        }
        else {
            return -1;
        }
    }

}
