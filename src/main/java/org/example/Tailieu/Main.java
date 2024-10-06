package org.example.Tailieu;

public class Main {

    public static void main(String[] args) {

        tailieu tl = new tailieu("n66","suthat",12,10);
        Sach sh = new Sach("nguyenmanhson","OOP",1000,"b76","suthat",12,20);
        System.out.println(tl);
        System.out.println(sh);
        Dihoc dh = new Sinhvien();
        dh.bang();
        System.out.println("mangtien"+dh.mangTien());
        dh.tinchi(3);
        ((Sinhvien) dh).thamgia(); // ep kieu vi dang o di hoc phai ep kieu ve sinhvien;
        


    }
}
