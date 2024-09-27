package org.example.viduKtra1;

import java.util.Scanner;

public class Xulyxau {
    private String xau;
    public Xulyxau(){
        System.out.println("Mời nhập xâu:");
        Scanner sc = new Scanner(System.in);
        xau = sc.nextLine();
    }
    public void Dodaixau(){
        System.out.println("do dai:"+xau.length());

    }
    public void xulysau()
    {
        String[] xaus =xau.split("[\\.\\?\\!]"); // dem cau cach boi . hoac ? hoac !
        System.out.println("so cau trong xau"+xaus.length);
    }
}
