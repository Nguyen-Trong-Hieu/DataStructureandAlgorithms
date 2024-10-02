package com.example.DataStructureandAlgorithms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Baitap15 {
    //Ctrinh nhập số nguyên dương n và thực hiện các chức năng sau
    //1.Tính tổng n
    //2.Phân tích n thành thừa số nguyên tố
    //3.Liệt kê các ước số của n
    //4.Liêt kê các ước số là nguyên tố của n

    private static final Scanner scanner = new Scanner(System.in);

    public static int SumN(int n){
        int s =0;
        for (int i =0;i<n;i++){
            s+=i;
        }
        return s;
    }

    public static List<Integer> phantichThuasoNT(int n){
        int i =2;
        List<Integer> listNumbers = new ArrayList<Integer>();

        while (n>1){
            if(n%i == 0){
                n = n/i;
                listNumbers.add(i);
            }
            else {
                i++;
            }
        }
        if(listNumbers.isEmpty()){
            listNumbers.add(n);
        }
        return listNumbers;
    }

    public static List<Integer> UocSo(int n ){
        List<Integer> listNumbers = new ArrayList<Integer>();
        for (int i = 1;i<=n;i++){
            if(n%i==0){
                listNumbers.add(i);
            }
        }
        return listNumbers;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> UocSoNT(int n ){
        List<Integer> listNumbers = new ArrayList<Integer>();
        for (int i = 1;i<=n;i++){
            if(n%i==0){
                if(isPrime(i)){
                    listNumbers.add(i);
                }
            }
        }
        return listNumbers;
    }

    public static int Nhap(){
        System.out.println("Nhập N");
        int n = scanner.nextInt();
        return n;
    }
    public static void main(String[] args) {
        System.out.println("1.Tính tổng n\n" +
                "2.Phân tích n thành thừa số nguyên tố\n" +
                "3.Liệt kê các ước số của n\n" +
                "4.Liêt kê các ước số là nguyên tố của n");
        System.out.println("Nhập vào giá trị :");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Tổng :"+SumN(Nhap()));
                break;
            case 2:
                List<Integer> listTsnt = phantichThuasoNT(Nhap());
                System.out.println("Danh sách TSNT");
                for (int number : listTsnt){
                    System.out.print(number+" ");
                }
                break;
            case 3:
                List<Integer> listUS = UocSo(Nhap());
                System.out.println("Danh sách US");
                for (int number : listUS){
                    System.out.print(number+" ");
                }
                break;
            case 4:
                List<Integer> listUSNT = UocSoNT(Nhap());
                System.out.println("Danh sách USNT");
                for (int number : listUSNT){
                    System.out.print(number+" ");
                }
                break;
            default:
                System.out.println("Lỗi");
                break;
        }
    }

}
