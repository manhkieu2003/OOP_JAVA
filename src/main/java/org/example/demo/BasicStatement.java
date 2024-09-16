package org.example.demo;

import java.util.Scanner;

public class BasicStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao gia tri a =");
        int a = sc.nextInt();
        System.out.println("a="+a);
        System.out.println("nhap vao gioitinh");
        boolean gioitinh = sc.nextBoolean();
        System.out.println("gioitinh="+(gioitinh? "nam":"nữ"));
        sc.nextLine();
        String ten;
        System.out.println("nhap ten");
        ten= sc.nextLine();
        System.out.println("ten="+ten);
    }
}
