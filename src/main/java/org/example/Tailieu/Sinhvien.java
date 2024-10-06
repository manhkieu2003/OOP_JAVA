package org.example.Tailieu;

public class Sinhvien extends Ngoaikhoa implements Dihoc{
    @Override
    public void bang() {
        System.out.println("SINH vien bang");
    }

    @Override
    public double mangTien() {
        return 45000;
    }

    @Override
    public void tinchi(int num) {
           for(int i=0;i<num;i++)
        {
            System.out.println("tinchi:"+(i+1));
        }
    }

    @Override
    public void thamgia() {
        System.out.println("Clb ptit");
    }

    @Override
    public double getDiem() {
        return 1000;
    }
}
