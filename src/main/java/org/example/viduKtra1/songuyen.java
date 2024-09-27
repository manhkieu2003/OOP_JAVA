package org.example.viduKtra1;

import java.util.Scanner;

public class songuyen {
    private int n;
    public songuyen() {
        System.out.println("Moi nhap n=");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }
    public int Tong()
    {
        int t=0;
        for(int i=0;i<=n;i++)
        {
           t+=i;
        }
        return t;
    }
    private boolean ktranguyento(int n)
    {
        if(n<2) return false;
        int squareRoot = (int) Math.sqrt(n);
        for(int i=2;i<=squareRoot;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void languyento()
    {
        for(int i=1;i<=n;i++)
        {
            if (ktranguyento(i)) {
                System.out.print(i + " ");
            }

        }
        System.out.println("");
    }
}
