package com.example.DataStructureandAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baitap11 {
    //Ptich số nguyên n thành các thừa số nguyên tố
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        List<Integer> listNumbers = phanTichSoNguyen(n);
        System.out.println("Kết quả");
        int size = listNumbers.size();
        for (int i =0;i<size-1;i++){
            System.out.print(listNumbers.get(i) + " x ");
        }
        System.out.print(listNumbers.get(size-1));
    }

    public static List<Integer> phanTichSoNguyen(int n){
        int i =2;
        List<Integer> listNumbers = new ArrayList<Integer>();

        while (n>1){
            if(n%i ==0){
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
}
