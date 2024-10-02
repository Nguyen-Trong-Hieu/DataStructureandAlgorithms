package com.example.DataStructureandAlgorithms;

import java.util.Scanner;

public class Baitap5 {
    //Chương trình chuyển đổi một số tự nhiện hệ số 10 thành môột số ở hệ cơ số B
    //(1<=B<=32) bất kỳ. VD 2<=B<=16. Số đại diện B > 10 là A = 10, B = 11 , C = 12, D=13, E = 14, F=15.

    public static final char CHAR_55 = 55;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên dương N = ");
        int N = scanner.nextInt();
        System.out.println("So" +N + "trong he co so 2 = "+Baitap5.convertNumber(N,2));
        System.out.println("So" +N + "trong he co so 16 = "+Baitap5.convertNumber(N,16));
    }

    public static String convertNumber(int n , int b){
        if(n<0 || b < 2 || b > 16){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;

        while (remainder>0){
            if(b>10){
                m = remainder%b;
                if(m >=10){
                    sb.append((char) (CHAR_55+m));
                }
                else {
                    sb.append(m);
                }
            }
            else {
                sb.append(remainder%b);
            }
            remainder = remainder/b;
        }
        return sb.reverse().toString();
    }
}
