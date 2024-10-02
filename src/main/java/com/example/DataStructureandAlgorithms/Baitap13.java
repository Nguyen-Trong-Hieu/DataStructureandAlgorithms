package com.example.DataStructureandAlgorithms;

import java.util.Scanner;

public class Baitap13 {
    //Ctrinh kiểm tra n là số thuận nghịch
    private static final Scanner scanner = new Scanner(System.in);
    public static int Dec10 = 10;
    public static void main(String[] args) {
        System.out.println("Nhập n ");
        int n = scanner.nextInt();
        System.out.println("Kết quả :"+isThuanNghich(n));
    }

    /*public static boolean isThuanNghich(int n ){
        // Ví dụ số 12321 ngược lại là 12321 luôn
        // Còn 1234 ngược lại là 4321
        int tmp = n;
        int s2 = 0;
        do{
            s2 = s2*Dec10+ n%Dec10;
            n/=Dec10;
        }while (n != 0);
        if(tmp == s2){
            return true;
        }
        return false;
    }*/
    public static boolean isThuanNghich(int n ){
        String numberStr = String.valueOf(n);
        int size = numberStr.length();
        for (int i = 0;i< (size/2);i++){
            if(numberStr.charAt(i)!= numberStr.charAt(size-i-1)){
                return false;
            }
        }
        return true;
    }
}
