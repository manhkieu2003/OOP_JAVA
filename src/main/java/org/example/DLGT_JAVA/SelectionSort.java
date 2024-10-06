package org.example.DLGT_JAVA;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {64, 25, 12, 22, 11};
//        selectionSort(arr);
//        System.out.println("Mảng sau khi sắp xếp:");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu i"+(i+1));
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("mang sau khi sap xep");
        for(int i :arr)
        {
            System.out.print(i +" ");
        }
    }

}
