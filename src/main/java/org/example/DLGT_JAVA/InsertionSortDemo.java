package org.example.DLGT_JAVA;
// sap xep chèn

import java.util.Scanner;

public class InsertionSortDemo {
    public void sort(int[] arr) {
        int n = arr.length; // 4 phan tu
        for (int i = 1; i < n; i++) { // i=1 ; i<4 ;i++
                int key = arr[i]; // key =a[i]=a[1]
                int j = i - 1;
         while (j >= 0 && arr[j] > key) {
             arr[j + 1] = arr[j];
             j = j - 1;
         }
         arr[j + 1] = key;
        }

    }
    public static void main(String[] args) {
        InsertionSortDemo demo = new InsertionSortDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan thu i"+i);
            arr[i] = sc.nextInt();
        }
        demo.sort(arr);
        System.out.println("Mảng đã được sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
