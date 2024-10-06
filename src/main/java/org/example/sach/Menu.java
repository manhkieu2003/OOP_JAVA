package org.example.sach;



import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
         DsSach ds =null;
        while (true){
            System.out.println("1.Nhap so luong sach");
            System.out.println("2.Nhap 1 quyen sach");
            System.out.println("3.hien thi sach");
            System.out.println("4.Tim kiem sach");
            System.out.println("5.do dai xau");
            System.out.println("6.so cau trong xau");
            System.out.println("0.Thoat");
            System.out.print("Lua chon:");
            Scanner sc = new Scanner(System.in);
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 0:
                    System.out.println("bye bye");
                    System.exit(0);
                    break;
                case 1:
                   ds = new DsSach();

                    break;
                case 2:
                   ds.nhapSach();
                    break;
                case 3:
                   ds.hienthiSach();
                    break;
                case 4:
                    ds.timkiemSach();
                    break;
                default:

                    break;
            }

        }
    }
}
