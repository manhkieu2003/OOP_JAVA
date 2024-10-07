package org.example.Collection;

public class Sinhvien {
    private int ma;
    private String ten;

    public Sinhvien() {
    }
    public Sinhvien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                '}';
    }
}
