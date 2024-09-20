package org.example.viduInterface;

public abstract class Dichoi {
    // abstract class nhu kieu la o giua class va interface co du moi thu
    // phuong thuc chua cai dat co tu khoa abstract
    private int ma;
    private String ngaydi;

    public Dichoi() {
    }

    public Dichoi(int ma, String ngaydi) {
        this.ma = ma;
        this.ngaydi = ngaydi;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getNgaydi() {
        return ngaydi;
    }

    public void setNgaydi(String ngaydi) {
        this.ngaydi = ngaydi;
    }

    public abstract  void phuongtien();
}
