package org.example.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        String filename = "src/main/java/org/example/IO/tho.txt"; // duong dan tuyet doi
        try {
            FileReader fr = new FileReader(filename); // return ra so
            int k;
            while (true)
            {
                k=fr.read(); // doc file doc tung ki tu ca ke xuong dong
                if(k==-1) break;
                char c=(char)k; // ep kieu sang ky tu
                System.out.println(c);
            }
            fr.close(); // đongs luong
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
