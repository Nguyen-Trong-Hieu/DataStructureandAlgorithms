package com.example.DataStructureandAlgorithms;

import java.util.Scanner;

public class Baitap8 {
    //Viết ct liệt kê số nguyên tố nhỏ hơn n
    //Số nguyên dương n

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập n ");
        int n  = scanner.nextInt();
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3;i<n;i+=2){
            if(isPrimeNumber(i)){
                System.out.print(" "+i);
            }
        }
    }

    public static boolean isPrimeNumber(int n ){
        if(n<2){
            return false;
        }
        for (int i = 2;i<=Math.sqrt(n);i++){
            if(n% i == 0){
                return false;
            }
        }
        return true;
    }


}
