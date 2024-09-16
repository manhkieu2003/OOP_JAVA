package org.example.demo;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // menu while switch
        while (true){
            System.out.println("1.Lua chon 1");
            System.out.println("2.Lua chon 2");
            System.out.println("3.Lua chon 3");
            System.out.println("4.Lua chon 4");
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
                    System.out.println("Lua chon 1");
                    break;
                case 2:
                    System.out.println("lua chon 2");
                    break;
                case 3:
                    System.out.println("lua chon 3");
                    break;
                case 4:
                    System.out.println("lua chon 4");
                    break;
                default:
                    System.out.println("chi chon tu 0 den 4");
                    break;
            }

        }
    }
}
