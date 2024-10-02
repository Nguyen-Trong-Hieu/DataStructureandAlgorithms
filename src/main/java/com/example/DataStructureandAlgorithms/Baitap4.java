package com.example.DataStructureandAlgorithms;

import java.util.Scanner;

public class Baitap4 {
    //Phương trình giải bậc 2 : ax2+bx+c=0
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        giaiPT2(a,b,c);
    }

    public static void giaiPT2(float a, float b, float c){
        if(a ==0 ){
            if( b == 0){
                System.out.println("PT Vô nghiệm");
            }
            else {
                System.out.println("PT có 1 nghiệm : " + "x="+(-c/b));
            }
            return;
        }

        float delta = b*b -4*a*c;
        float x1;
        float x2;
        if(delta>0){
            x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
            x2= (float) ((-b-Math.sqrt(delta))/(2*a));
            System.out.println("PT 2 nghiệm"+"x1="+x1+"x2="+x2);
        }
        else  if(delta==0){
            x1 = (-b/(2*a));
            System.out.println("PT nghiệm kép"+"x1, x2 = "+x1);
        }
        else {
            System.out.println("PT vô nghiệm");
        }
    }
}
