package com.example.DataStructureandAlgorithms;

import java.util.Scanner;

public class Baitap10 {
    //Liệt kê số nguyên tố có 5 chữ số
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Liệt kê số ngto 5 chữ số");
        for (int i = 10001;i<99999;i+=2){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Có " +count);
    }

    public static boolean isPrimeNumber(int n ){
        if (n<2){
            return false;
        }

        for (int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }


}
