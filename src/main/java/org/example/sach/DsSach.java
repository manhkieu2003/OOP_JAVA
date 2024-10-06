package org.example.sach;

import java.util.Scanner;

public class DsSach {
    private Sach[] list;
    private Scanner sc;
    private int m;
    public DsSach() {
        sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong sach toi da");
        int n = sc.nextInt();
        list = new Sach[n];
        m=0;



    }
    // kiểm tra trùng lap sach
    private boolean isMaSachTrung(String ma) {
        for (int i = 0; i < m; i++) {
            if (list[i].getMa().equals(ma)) {
                return true; // Mã sách đã tồn tại
            }
        }
        return false; // Mã sách không tồn tại
    }

    public void nhapSach()
    {
        String ma;
        String ten;
        Boolean tviet;
        String tacgia;
        double gia;
        int sluong;
        sc.nextLine();
        System.out.println("nhap ma sach");
        ma = sc.nextLine();
        // Kiểm tra mã sách có trùng hay không
        if (isMaSachTrung(ma)) {
            System.out.println("Mã sách đã tồn tại. Vui lòng nhập mã khác.");
            return; // Dừng phương thức nếu mã đã tồn tại
        }
        System.out.println("ten sach");
        ten = sc.nextLine();
        System.out.println("tviet sach(true/false)");
        tviet = sc.nextBoolean();
        sc.nextLine();
        System.out.println("tacgia sach");
        tacgia = sc.nextLine();
        System.out.println("gia sach");
        gia = sc.nextDouble();
        System.out.println("Nhap vao so luong sach");
        sluong = sc.nextInt();
        list[m++] = new Sach(ma, ten, tviet, tacgia, gia, sluong);
        System.out.println("Sách đã được thêm thành công.");


    }
    public void hienthiSach()
    {
        System.out.println("danh sach Sach");
        for(int i=0;i< m;i++)
        {
            System.out.println(list[i]);
        }
    }
    public void timkiemSach()
    {
        sc.nextLine();
        System.out.println("Nhap ma sach can tim");
        String ma= sc.nextLine();




    }
}
