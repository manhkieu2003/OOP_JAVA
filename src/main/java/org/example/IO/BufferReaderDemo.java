package org.example.IO;

import java.io.*;

public class BufferReaderDemo {
    public static void main(String[] args) {

    String filename = "src/main/java/org/example/IO/tho.txt"; // duong dan tuyet doi
        String fileout = "src/main/java/org/example/IO/out.txt"; // duong dan tuyet doi
        BufferedReader br = null;
        PrintWriter pw;
        try {
            br = new BufferedReader(new FileReader(filename));  // return ra null
            pw = new PrintWriter(new FileWriter(fileout));
            String line="";
            while((line=br.readLine())!=null)   // neu bang null thi ket thuc k doc nua
            {
                System.out.println(line);
                pw.println(line); //ghi tung ki tu da doc vao out.txt
            }
            br.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
