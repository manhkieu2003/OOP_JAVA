package org.example.viduInterface;

public interface Dentruong {
    // interface deu phai la public
    // phuong thuc co than thi phai co tu khoa static hoac default
    // interface ho tro da thua ke
    // interface ko dc implement 1 cai abstract class và nó extends dc 1 interface khac
     // nhưng mà abstract class co the implement 1 interface
    // mặc định khai báo phải là public

    public int n=10;
    public void mang();
    public static  void tien()
    {
        System.out.println("tien dola ne");
    }
    default int getTet()
    {
        return 500;
    }
    public void hoc(); // dc goi la abstractMeothod vi chua dc cai dat

}
