package com.example.DataStructureandAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Baitap1 {
    public static void main(String[] args) {
        /*
        Viết chương trình tìm tất cả các số chia hết cho 7
        nhưng không phải bội số của 5, nằm trong đoạn 10 và 200 (tính cả 10 và 200).
        Các số thu được sẽ được in thành chuỗi trên một dòng, cách nhau bằng dấu phẩy.
        */

        int min = 10;
        int max = 200;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = min;i<=max;i++){
            if(i % 7 == 0 && i%5!=0 ){
                list.add(i);
            }
        }
        showList(list);
    }

    public static void showList(List<Integer> list){
        if(list != null && !list.isEmpty()){
            int size = list.size();
            for (int i = 0;i<size -1;i++){
                System.out.print(list.get(i) + ",");
            }
            System.out.println(list.get(size-1));
        }
    }
    /*public static void showList(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            // In phần tử đầu tiên trước (để không có dấu phẩy sau nó)
            System.out.print(list.get(0));

            // Duyệt qua các phần tử còn lại, bắt đầu từ i = 1
            for (int i = 1; i < size; i++) {
                System.out.print("," + list.get(i));
            }

            System.out.println(); // Kết thúc dòng
        }
    }*/

}
