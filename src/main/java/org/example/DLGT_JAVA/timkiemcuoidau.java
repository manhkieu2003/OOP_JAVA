package org.example.DLGT_JAVA;

import java.util.Scanner;

public class timkiemcuoidau {

    public  void timkiemcuoidau(int[] a ,int key)
    {
        /// luu tru  vị trí tìm thấy
        for(int i=a.length-1;i>=0;i++)
        {
            if(a[i]==key)
            {
//                index=i;
                break;
            }
        }
    }

    public static void main(String[] args) {
        int index=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số phan tu mang");
        int n= sc.nextInt();;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap phan tu thu i"+(i+1));
            a[i]=sc.nextInt();
        }
        System.out.println("nhap phan tu can tim kiem");
        int key = sc.nextInt();
//        timkiemcuoidau(a,key);
        if(index !=1)
        {

        }

    }
}
