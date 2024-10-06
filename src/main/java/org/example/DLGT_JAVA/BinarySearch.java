package org.example.DLGT_JAVA;

import java.util.Scanner;

public class BinarySearch {
    public  int Timkiem(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Tính chỉ số giữa

            // Nếu phần tử giữa là phần tử cần tìm
            if (arr[mid] == key) {
                return mid;
            }

            // Nếu phần tử cần tìm nhỏ hơn phần tử giữa, tìm ở nửa bên trái
            if (arr[mid] > key) {
                right = mid - 1;
            }
            // Nếu phần tử cần tìm lớn hơn phần tử giữa, tìm ở nửa bên phải
            else {
                left = mid + 1;
            }
        }

        return -1; // Nếu không tìm thấy phần tử
    }
        public static void main(String[] args) {
        System.out.println("nhap so luong mang");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap phan thu thu i"+(i+1));
            a[i] = sc.nextInt();
        }
        System.out.println("nhap phan tu can tim");
        int key = sc.nextInt();
        BinarySearch bs = new BinarySearch();
        int result = bs.Timkiem(a,key);
        if(result != -1)
        {
            System.out.println("đã tìm thay phan tu tai"+result);
        }else{
            System.out.println("khong tim phan tu");
        }
    }
}
