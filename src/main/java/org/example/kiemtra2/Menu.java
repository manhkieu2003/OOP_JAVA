package org.example.kiemtra2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLPTGT q = new QLPTGT();
        // menu while switch
        while (true){
            System.out.println("Menu");
            System.out.println("1.Nhap Oto");
            System.out.println("2.Nhap xe may");
            System.out.println("3.Viet danh sach");

            System.out.println("4.Sửa");
            System.out.println("5.Xoa");
            System.out.println("6.Tim kiem theo ma");

            System.out.println("7.Tim kiem theo hang");
            System.out.println("8.Tim kiem theo nam");
            System.out.println("9.Tim kiem gia cao");

            System.out.println("10.Sap xep theo ma");
            System.out.println("11.Sap xep theo hang");
            System.out.println("12.Sap xep theo nam");
            System.out.println("13.Sap xep theo ");
            System.out.println("14.Thong khe");
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
                  q.nhapOto();
                    break;
                case 2:
                  q.nhapXemay();
                    break;
                case 3:
                  q.vietDs();
                    break;
                case 4:
                    q.sua();
                    break;
                case 5:
                   q.xoa();
                    break;
                case 6:
                    q.tkTheoMa();
                    break;
                case 7:
                   q.tkTheoHang();
                    break;
                case 8:
                    q.tkTheoNam();
                    break;
                case 9:
                    q.tkGiaCao();
                    break;
                case 10:
                      q.sxTheoMa();
                    break;
                case 11:

                    break;
                case 12:
                  q.sxTheoNam();
                    break;
                case 13:
                   q.sxTheoGia();
                    break;
                default:
                    System.out.println("chi chon tu 0 den 14");
                    break;
            }

        }
    }
}
