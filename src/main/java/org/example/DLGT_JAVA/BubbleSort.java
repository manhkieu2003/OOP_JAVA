package org.example.DLGT_JAVA;
// Bubble tang dan;
public class BubbleSort {
    public static void Bubble(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            boolean flag = false;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]<a[j+1]) // dieu kien hoan doi  // neu giam dan thi doi dau
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        Bubble(arr);

        System.out.println("Mảng đã được sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
