package org.example.Tailieu;

public class Sach extends tailieu implements giaable {
    private String tentacgia;
    private String tensach;
    private int sotrang;


    public Sach() {
        super();
    }

    public Sach(String tentacgia, String tensach, int sotrang ,String ma, String tenNxb, int soPH,double gia) {
        super( ma,  tenNxb, soPH,gia);
        this.tentacgia = tentacgia;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
//    @Override
//    public double getGia()
//    {
//        if(sotrang>500)
//        {
//            return (0.9*super.getGia());
//        }else{
//            return super.getGia();
//        }
//    }



    @Override
    public String toString() {
        return "Sach{" +
                "getMa='" + getMa() + '\'' +
                ", tensach='" + tensach + '\'' +
                ", getGia=" + getGia() +
                '}';
    }
}
