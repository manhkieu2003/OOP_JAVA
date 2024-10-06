package org.example.Collection;

import java.util.ArrayList;

public class ArrayLList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Phần tử thứ 2: " + list.get(1)); // Truy cập nhanh O(1)

        list.remove(0); // Xóa chậm O(n)
        System.out.println("Danh sách sau khi xóa: " + list);
    }
}
