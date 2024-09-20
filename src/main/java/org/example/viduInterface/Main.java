package org.example.viduInterface;

public class Main {

public static void main(String[] args) {
    Sinhvien sv = new Sinhvien();

    Dentruong.tien();
    sv.hoc();
    sv.mang();
    sv.m1();
    Dentruong dt = new Sinhvien(); // new thong qua lop con
    dt.getTet();
    dt.hoc();
    dt.mang();
    Dichoi dc = new Sinhvien();
    dc.phuongtien();
    System.out.println("======");

    // anonymous class : lớp khuyết danh hay còn là lớp ko tên
    Dentruong dtc = new Dentruong() {
        @Override
        public void mang() {
            System.out.println("mang balo di hoc");
        }

        @Override
        public void hoc() {

        }
    };
    dtc.mang();
    Dichoi dct = new Dichoi(1,"thuhai") {
        @Override
        public void phuongtien() {
           System.out.println("phuongtien dang di  di hoc");
        }


    };
    System.out.println(dct.getMa());
    System.out.println(dct.getNgaydi());


}


}
