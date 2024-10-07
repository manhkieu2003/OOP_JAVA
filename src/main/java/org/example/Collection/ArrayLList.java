package org.example.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayLList {
    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Cherry");
//        list.add(1);
//        list.add(new Sinhvien(1,"manh"));
//
//
//
//        System.out.println(list.get(3));
//        System.out.println("Phần tử thứ 2: " + list.get(4)); // Truy cập nhanh O(1)
//        String x = (String) list.get(2); // phai ep kieu vi ko co generic
//        int x1 = (int) list.get(3);
//        System.out.println(x1);
//
//        list.remove(0); // Xóa chậm O(n)
//        System.out.println("Danh sách sau khi xóa: " + list);
        System.out.println("==================");
        // co generic
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        String chuoi = list.get(0);
        System.out.println(chuoi);
        // cach1
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        //cach2
        for(String i:list)
        {
            System.out.println(i);
        }
        System.out.println("=================");
//        cach3 dung iterator
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
        //cach 4 dung listiterator duyet nguoc lai
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
