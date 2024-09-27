package org.example.viduKtra1;

import java.util.Scanner;

public class MainKtra1 {
    public static void main(String[] args) {
        songuyen sn =null;
        Xulyxau xlx = null;
        while (true){
            System.out.println("1.Nhap so nguyen n");
            System.out.println("2.Tong");
            System.out.println("3.Day so nguyen so");
            System.out.println("4.Nhap mot xau");
            System.out.println("5.do dai xau");
            System.out.println("6.so cau trong xau");
            System.out.println("0.Thoat");
            System.out.print("Lua chon:");
            Scanner sc = new Scanner(System.in);
            int chon = sc.nextInt();
            switch (chon){
                case 0:
                    System.out.println("bye bye");
                    System.exit(0);
                    break;
                case 1:
                    sn = new songuyen();
                    break;
                case 2:
                    System.out.println("Tong="+sn.Tong());
                    break;
                case 3:
                  sn.languyento();
                    break;
                case 4:
                    xlx = new Xulyxau();
                    break;
                case 5:
                    xlx.Dodaixau();
                    break;
                case 6:
                   xlx.xulysau();
                    break;
                default:
                    System.out.println("chi chon tu 0 den 4");
                    break;
            }

        }
    }
}
