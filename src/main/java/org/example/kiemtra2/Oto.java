package org.example.kiemtra2;

public class Oto extends PTGT implements  Tinhgia{
    private String dongco;
    private int socho;
    public Oto(){

    }

    public Oto(String ma, String hang, int nam, double gia,String dongco, int socho, String mau) {
        super(ma, hang, nam, gia, mau);
        this.dongco = dongco;
        this.socho = socho;
    }

    public String getDongco() {
        return dongco;
    }

    public void setDongco(String dongco) {
        this.dongco = dongco;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    @Override
    public double laygia() {
        double t = super.getGia();
        if((2024-super.getNam())>=2)
        {
            t=t*0.85;
        }
        return t;
    }
public String toString()
{
    return getMa() +"\t"+ getHang() +"\t"+getNam() +"\t"+laygia() +"\t"+ getMau()+"\t"+socho;
}
}
