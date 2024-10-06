package org.example.sach;

public class Sach {
    private String ma;
    private String ten;
    private Boolean tviet;
    private String tacgia;
    private double gia;
    private int sluong;

    public Sach() {
    }

    public Sach(String ma, String ten, Boolean tviet, String tacgia, double gia, int sluong) {
        this.ma = ma;
        this.ten = ten;
        this.tviet = tviet;
        this.tacgia = tacgia;
        this.gia = gia;
        this.sluong = sluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Boolean getTviet() {
        return tviet;
    }

    public void setTviet(Boolean tviet) {
        this.tviet = tviet;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }
    public double getTongtien()
    {
        return  sluong*gia;
    }

    @Override
    public String toString() {
        return (ma+"\t"+ten+"\t"+(tviet?"Tiếng Việt":"Nước ngoài")+"\t"+gia+"\t"+getTongtien());
    }
}
