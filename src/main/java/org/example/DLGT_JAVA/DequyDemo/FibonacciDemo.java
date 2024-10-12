package org.example.DLGT_JAVA.DequyDemo;

import java.util.Scanner;
// vi du
//1 dieu kien dung
//2 la cong thuc de quy

public class FibonacciDemo {
    public int fibonacci(int n) {
        if (n<0) {
            System.out.println("so nho hon 0");
        } else if(n==0 || n==1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        FibonacciDemo demo = new FibonacciDemo();
        System.out.println("nhap thong tin n phan tu");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(demo.fibonacci(i) + " ");
        }
    }
}
