package org.example.DLGT_JAVA;

import java.util.Scanner;

import java.util.Scanner;
// đây là tìm kiếm tuần tự
public class Timkiemtuantu {
    // Phương thức thực hiện tìm kiếm tuần tự
    public int timkiemtuantu(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Timkiemtuantu tk = new Timkiemtuantu();
       Scanner sc = new Scanner(System.in);
        System.out.println("Mời b nhập số phần tử mảng ");
        int n= sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("nhap phan tu thu i"+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("nhap phan tu can tim");
        int key = sc.nextInt();
        int result = tk.timkiemtuantu(arr,key);
        if(result==-1)
        {
            System.out.println("không tìm thấy phần tu do");
        }else{
            System.out.println("tìm thấy tại vị trí "+result);
        }



    }
}
