package com.example.DataStructureandAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baitap14 {
    //Ctrinh liệt kê các số Fibonacci nhỏ hơn n là số nguyên tố

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào N");
        int n = scanner.nextInt();
        List<Integer> fibonacciList = Fibonacci(n);
        if(isPrimeNumber(n) == true){
            if(!fibonacciList.isEmpty()){
                System.out.println("Danh sách Fibonacci của "+n+" là ");
                for (int number : fibonacciList){
                    System.out.println(number+" ");
                }
            }
            else {
                System.out.println("Không có danh sách Fibonacci.");
            }
        }
        else{
            System.out.println("Lỗi n không phải số nguyên tố.");
        }
    }

    public static boolean isPrimeNumber(int n ){
        if(n<2){
            return false;
        }
        for (int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

   /* public static int isFibonacci(int n){
        if(n>=2){
            return isFibonacci(n - 1) + isFibonacci(n-2);
        }
        else if(n == 0 || n ==1){
            return n;
        }
        else {
            return -1;
        }
    }*/

    public static int isFibonacci(int index){
        if(index <=1) return index;
        return isFibonacci(index -1 ) + isFibonacci(index-2);
    }


    public static List<Integer> Fibonacci(int n){
        List<Integer> list = new ArrayList<Integer>();
        if(isPrimeNumber(n) == true){
            for (int i =0;i<n;i++){
                list.add(isFibonacci(i));
            }
        }
        return list;
    }
}
