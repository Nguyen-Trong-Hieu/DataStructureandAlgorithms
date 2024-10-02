package com.example.DataStructureandAlgorithms;

import java.util.Scanner;

public class Baitap9 {
    //Viết liệt kê n số nguyên tố đầu tiên trong java.

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        int dem =0;
        for (int i=2;dem<n;i++){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
                dem++;
            }
        }
    }

    public static boolean isPrimeNumber(int n ){
        if(n<2){
            return false;
        }
        for (int i =2;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}
