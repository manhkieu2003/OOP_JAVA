package org.example.DLGT_JAVA;

import java.util.Scanner;

public class LinearSearch {
    public int LinearSearch(int a[] ,int n,int x)
    {
        int i=0;
        while((i<n) && (a[i]!=x)) i++;
        if(i >n) return -1;
        else return i;
    }

    public static void main(String[] args) {
        System.out.println("nhap so luong phan tu mang");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap phan thu i"+(i+1));
            a[i] = sc.nextInt();

        }
        System.out.println("nhap phan tu can tim");
        int x = sc.nextInt();
        LinearSearch ls = new LinearSearch();
        int res = ls.LinearSearch(a,n,x);
        if (res != -1)
        {
            System.out.println("tim thay o vi tri thu"+res);
        }else{
            System.out.println("ko tim thay");
        }


    }
}
