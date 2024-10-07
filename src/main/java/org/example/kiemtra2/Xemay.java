package org.example.kiemtra2;

public class Xemay extends PTGT implements Tinhgia{
    private double congsuat;
    public Xemay()
    {

    }

    public Xemay(String ma, String hang, int nam, double gia, String mau, double congsuat) {
        super(ma, hang, nam, gia, mau);
        this.congsuat = congsuat;
    }
    public double getCongsuat() {
        return congsuat;
    }
    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }

    @Override
    public double laygia() {
        double t = super.getGia();
        if((2024-super.getNam()>=2))
        {
            t=t*0.95;
        }
        return t;
    }
    public String toString()
    {
        return getMa() +"\t"+ getHang() +"\t"+getNam() +"\t"+laygia() +"\t"+ getMau()+"\t"+congsuat;
    }

}
