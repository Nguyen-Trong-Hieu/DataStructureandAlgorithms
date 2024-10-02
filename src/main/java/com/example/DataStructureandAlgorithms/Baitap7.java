package com.example.DataStructureandAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Baitap7 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập A , B");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(USCLN(a,b));
        System.out.println(BSCNN(a,b));
    }

    //Cách 1 liệt kê các USCL rồi chọn ra UCLN
/*
    public static int UCLN(int a , int b){
        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> listb = new ArrayList<Integer>();
        List<Integer> listc = new ArrayList<Integer>();
        for (int i = 1; i<=a;i++){
            if(a%i ==0){
                lista.add(i);
            }
            break;
        }
        for (int i = 1; i<=a;i++){
            if(b%i ==0){
                listb.add(i);
            }
            break;
        }

        for (int i =0;i<lista.size();i++){
            for (int j = 0; j <listb.size();j++){
                if(lista.get(i) == listb.get(j)){
                    listc.add(i);
                }
            }
        }

        return Collections.max(listc);

    }
*/

    public static int USCLN(int a , int b){
        if(b == 0 ) return a;
        return USCLN(b,a % b);
    }

    public static int BSCNN(int a, int b){
        return (a*b)/ USCLN(a,b);
    }
}
