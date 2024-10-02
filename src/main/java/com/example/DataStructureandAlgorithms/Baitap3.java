package com.example.DataStructureandAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baitap3 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Nhập số nguyên n ");
        int n = scanner.nextInt();

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =1 ;i< n+1;i++){
            map.put(i,i*i);
        }
        System.out.println(map);
    }
}
