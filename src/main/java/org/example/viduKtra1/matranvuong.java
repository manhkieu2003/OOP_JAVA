package org.example.viduKtra1;

import java.util.Scanner;

public class matranvuong {
    private double[][] a;
    public matranvuong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma tran");
        int n = sc.nextInt();
        a = new double[n][n];
        for(int i = 0; i < a.length; i++){
            System.out.println("nhap hang"+i);
            for(int j = 0; j < a[0].length; j++){
                a[i][j]=Double.parseDouble(sc.next());
            }
        }

    }
//    public viet()
//    {
//
//    }
}
