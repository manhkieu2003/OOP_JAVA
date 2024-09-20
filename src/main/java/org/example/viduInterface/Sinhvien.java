package org.example.viduInterface;

public class Sinhvien extends Dichoi  implements Dentruong,New1{
     // 1 class extends abstract class sử dụng tu khoa extend
    //2 class implement interface
    @Override
    public void mang() {
        System.out.println("mang sach ne");
    }

    @Override
    public void hoc() {
        System.out.println("van chua di hoc a");
    }

    @Override
    public void m1() {
        System.out.println("day la da ke thua m1");
    }

    @Override
    public void phuongtien() {
        System.out.println("phuong tien di lai");
    }
}
