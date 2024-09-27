package org.example.Mang;

import java.util.Scanner;

public class mang2chieu {
    public static void main(String[] args) {
        int m; // số dòng của matraanj
        int n; // so cot cua ma tran
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so dong cua ma tran");
            m= sc.nextInt();
            System.out.println("nhap so cot cua ma tran");
            n= sc.nextInt();
        }while(m<1||n<1);
        // khai bao 2 matran a va b
        int A[][] = new int[m][n];
        int B[][] = new int[m][n];
        // ma tran tong c
        int C[][] = new int[m][n];
        System.out.println("Nhap phan tu cho ma tran a");
         for(int i=0; i<m; i++) {
             for(int j=0; j<n; j++) {
                 System.out.println("A["+i+"]["+j+"] = ");
                 A[i][j]= sc.nextInt();
             }
         }
        System.out.println("nhap phan tu ma tran b");
         for(int i=0; i<m; i++) {
             for(int j=0; j<n; j++) {
                 System.out.println("B["+i+"]["+j+"] = ");
                 B[i][j]= sc.nextInt();
             }
         }
        System.out.println("gia tri ma tran a");
         for(int i=0; i<m; i++) {
             for(int j=0; j<n; j++) {
                 System.out.print(A[i][j]+"\t");
             }
             System.out.println("\n");

         }
        System.out.println("gia tri ma tran b");
         for(int i=0; i<m; i++) {
             for(int j=0; j<n; j++) {
                 System.out.print(B[i][j]+"\t");
             }
             System.out.println("\n");
         }
         // tong 2 ma tran
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                C[i][i] = A[i][j]+B[i][j];
            }
        }
        System.out.println("Tong 2 ma tran");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }


}
