package org.example.DLGT_JAVA;

public class Swap {
    public static int[]  swap( int[] arr,int a, int b) {
        int temp = arr[a];    // temp =20;

        arr[a] = arr[b];       //arr[1] = 40;

        arr[b] = temp;       // arr[3] =20;
        return arr;       // trả ra mảng mới [10,40,30,20,50]
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        // Hoán đổi phần tử tại chỉ số 1 và 3
        swap(arr, 1, 3);

        System.out.println("Mảng sau khi hoán đổi:");
        printArray(arr);
    }
}
