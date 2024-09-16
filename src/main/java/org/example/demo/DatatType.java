package org.example.demo;

public class DatatType {
    public static void main(String[] args) {
        // các kiểu dữ liệu
        int x,y;
        x=8;
        y=x; //y=8;
        long a;
        a=7; // 7l nếu viết là 7 chương trình sẽ hieeur int
        double m=6.8; // thêm hậu tố d cũng được
        float k;
        k=1.3f; // hộ tố là f
        char traloi;
        traloi ='c';
        String ten="to an an";
        boolean gioitinh;
        gioitinh =true;
        System.out.println("a="+a);
        System.out.println(gioitinh?"nam":"nu");
        boolean bb = ten instanceof String;
        System.out.println(bb);
        int v=8;
        v %=2;//0
        System.out.println(v);
        int i=0 ; //i++ ,++i
        // giống nhau là đều tăng lên 1
        // ++i cộng rồi mời thực hiện i
        // i++ thực hiện i rooi mới cộng
//        System.out.println(++i);//1
        System.out.println(i++);//0
        int x1=1;
        System.out.println("X="+x1+2);// x=12
        System.out.println("X="+(x1+2)); // x=3
        // chyển kiêu
        //+1 widening casting(implecit) chuyển đổi tuwf kooong gian nhỏ => to
        // byte->short-> int ->long->float->doube
        //+2 narrowing casting(explicitly done) : chuyển đổi sang lớn => bé
        // double ->float ->long ->int ->short-> byte
        double d=100.4;
        long l = (long) d; // ép kiểu
        int a1=1/2;
        double a2 = (double)1/2; // kiểu về doube thì mới ra 0.5
        System.out.println(a2);
        System.out.println("A1="+a1); //0








    }
}
