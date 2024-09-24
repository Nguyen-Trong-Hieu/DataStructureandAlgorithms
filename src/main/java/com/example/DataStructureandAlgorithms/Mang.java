package com.example.DataStructureandAlgorithms;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Mang {

    public static void bubbleSort(int[] array, boolean ascending){
        int n =array.length;
        for(int i = 0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                /*if(ascending){
                    //Sắp xếp tăng dần
                    if(array[j] > array[j+1]){
                            int temp = array[j];
                            array[j]=array[j+1];
                            array[j+1]=temp;
                    }
                }
                //Sắp xếp giảm dần
                else {
                    if(array[j]<array[j+1]){
                        int temp = array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }*/
                if ((ascending && array[j] > array[j + 1]) || (!ascending && array[j] < array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void findNumber(int[] array,boolean max){
        /*int n = array.length;
        int Max = array[0];
        int Min = array[0];
        for(int i =1 ; i< n;i++){
            if(array[i]>Max){
                Max = array[i];
            }
            else {
                Min=array[i];
            }
        }
        if(max == true){
            System.out.println("Max : "+Max);
        }
        else {
            System.out.println("Min : "+Min);
        }*/

        int result = array[0];
        for (int value : array) {
            if ((max && value > result) || (!max && value < result)) {
                result = value;
            }
        }
        System.out.println((max ? "Max" : "Min") + " : " + result);
    }

    public static void ViewArray(int[] array){
        //Hiển thị mảng sau khi sắp xếp
        /*for(int i = 0;i<array.length;i++){
            System.out.println(array[i]+ " ");
        }
        System.out.println();*/

        System.out.println(Arrays.toString(array));
    }

    public static void SearchNum(int[] array, int x){
        int vitri= 0;
        for(int i =0;i<array.length-1;i++){
            if(x == array[i]){
                vitri=i+1;
                break;
            }
        }
        System.out.println("Số cần tìm là : "+ x +" tại vị trí "+ vitri);
    }

    public static void MangNangCao(){
        Scanner scanner = new Scanner(System.in);
        //Khai báo phần tử N và Q
        System.out.println("Nhập vào số lượng phần tử N nhị phân : ");
        int N = scanner.nextInt();
        System.out.println("Nhập vào ố lần truy vấn : ");
        int Q = scanner.nextInt();


        //Kiểm tra ràng buộc của N
        if(N < 1 || N > 1000000){
            System.out.println("Giá trị N không hợp lệ !");
            return;
        }
        //Kiểm tra ràng buộc của Q
        if(Q < 1 || Q > 1000000){
            System.out.println("Giá trị Q không hợp lệ !");
            return;
        }

        //Tạo mảng nhị phân
        System.out.println("Nhập vào mảng nhị phân có " + N + " phần tử.");
        int[] array = new int[N];
        for (int i=0;i<N;i++){
            array[i] = scanner.nextInt();
            //Kiểm tra ràng buộc từng phần tử
            if(array[i] != 0 && array[i] != 1){
                System.out.println("Giá trị phần tử không hợp lệ !");
                return;
            }
        }

        //Thực hiện Q truy vấn
        for(int i=0;i<Q;i++){
            System.out.println("Nhập vào cú pháp truy vấn.");
            int type = scanner.nextInt();
            if(type==1){
                //Truy vấn 1 X : Thay đổi giá trị tại vị trí X
                int X = scanner.nextInt();
                //Kiểm tra ràng buộc của X
                if(X < 0 || X >= N){
                    System.out.println("Giá trị X không hợp lệ");
                    return;
                }
                array[X] = 1 -array[X];
            }
            else if (type == 0) {
                //Truy vấn 0 I R : Kiểm tra chẵn lẻ tại vị trí R
                int I = scanner.nextInt();
                int R = scanner.nextInt();

                if (I < 0 || I > R || R >= N) {
                    System.out.println("I và R Không hợp lệ !");
                    return;
                }
                //Kiểm tra giá trị tại R
                if (array[R] == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
            else {
                System.out.println("Giá trị Lỗi.");
            }
        }
        scanner.close();
    }


    public static void main(String[] args) {

        //Nhập vào một mảng giá trị
        Scanner scanner = new Scanner(System.in);

        //Kích thước của mảng
        System.out.print("Nhập số phần tử của mảng : ");
        int size =scanner.nextInt();

        //Khai báo mảng
        int[] array = new int[size];

        //Nhập vào giá trị từng phần tử trong mảng
        for(int i =0; i< size;i++){
            System.out.print("Nhập vào giá trị phần tử thứ " + (i+1) + " : ");
            array[i] =scanner.nextInt();
        }

        //Hiển thị các giá trị của mảng
        /*System.out.println("Các giá trị của mảng lần lượt là : ");
        for(int i = 0;i<size;i++){
            System.out.println("Phần tử thứ " + (i+1) + " là " + array[i]);
        }*/

        System.out.println("Các giá trị của mảng: " + Arrays.toString(array));

        //Nhập vào yêu cầu
       /* System.out.println("1.Sắp xếp lại mảng giảm dần");
        System.out.println("2.Sắp xếp lại mảng tăng dần");
        System.out.println("3.Tìm ra số lớn nhất trong mảng");
        System.out.println("4.Tìm ra số nhỏ nhất trong mảng");
        System.out.println("5.Tìm số");
        System.out.println("6. Mảng nâng cao");
        System.out.print("Nhập vào yêu cầu : ");*/

        // Chọn chức năng
        System.out.println("1. Sắp xếp giảm dần\n2. Sắp xếp tăng dần\n3. Tìm số lớn nhất\n4. Tìm số nhỏ nhất\n5. Tìm số\n6. Mảng nâng cao");
        System.out.print("Nhập vào yêu cầu: ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                bubbleSort(array,false);
                System.out.println("Mảng sau khi sắp xếp giảm dần");
                ViewArray(array);
                break;
            case 2 :
                bubbleSort(array,true);
                System.out.println("Mảng sau khi sắp xếp tăng dần");
                ViewArray(array);
                break;
            case 3 :
                findNumber(array,true);
                break;
            case 4:
                findNumber(array,false);
                break;
            case 5:
                System.out.println("Nhập vào số cần tìm :");
                int x = scanner.nextInt();
                SearchNum(array,x);
                break;
            case 6:
                MangNangCao();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
            return;
        }

        scanner.close();
    }
}
