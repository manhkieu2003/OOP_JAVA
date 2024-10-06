package org.example.Tailieu;

public class tailieu {
    private String ma;
    private String tenNxb;
    private int soPH;
    private double gia;

    public tailieu() {
    }

    public tailieu(String ma, String tenNxb, int soPH,double gia) {
        this.ma = ma;
        this.tenNxb = tenNxb;
        this.soPH = soPH;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNxb() {
        return tenNxb;
    }

    public void setTenNxb(String tenNxb) {
        this.tenNxb = tenNxb;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }
    public double getGia()
    {
        return gia;
    }
    public void setGia(double gia)
    {
        this.gia=gia;
    }

    @Override
    public String toString() {
        return "tailieu{" +
                "ma='" + ma + '\'' +
                ", tenNxb='" + tenNxb + '\'' +
                ", soPH=" + soPH +
                ", gia=" + gia +
                '}';
    }
}
