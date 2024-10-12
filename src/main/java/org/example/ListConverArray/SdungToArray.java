package org.example.ListConverArray;

import org.example.kiemtra2.PTGT;

import java.util.LinkedList;
import java.util.List;

public class SdungToArray {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

       String[] array = list.toArray(new String[0]);
        //toArray(new String[0]): Phương thức toArray được gọi trên list để chuyển đổi danh sách thành một mảng.
        //Tham số new String[0] là một mảng rỗng kiểu String. Điều này cho phép Java biết loại kiểu mà mảng đầu ra sẽ có.
        //Nếu mảng có kích thước 0, Java sẽ tự động tạo một mảng mới có kích thước đúng với số lượng phần tử trong danh sách.
//        String[] array2 = list.toArray(new String[list.size()]);
        for(String s : array)
        {
            System.out.println(s);
        }
        List<PTGT> PTGTList = new LinkedList<>();
        PTGTList.add(new PTGT("a1","nn",1,45,"do"));
        PTGTList.add(new PTGT("a2","mm",1,45,"den"));
        PTGT[] a = PTGTList.toArray(new PTGT[PTGTList.size()]);
        System.out.println(a[0]);
        for(PTGT s : a)
        {
            System.out.println(s);
        }
    }
}
