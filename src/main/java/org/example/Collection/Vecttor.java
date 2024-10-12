package org.example.Collection;

import org.w3c.dom.ls.LSOutput;

import java.util.Vector;

// vector co the doi duoc thanh danh sach liet ke(enum)

public class Vecttor {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3,3);
        // initcapacity:3
        // neu nhu nhap het phan tu se cong them 3;
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println(vector.capacity());
        System.out.println(vector.size());
    }



}
