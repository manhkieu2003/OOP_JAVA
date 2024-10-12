package org.example.ListConverArray;

import java.util.LinkedList;
import java.util.List;

// su dung get de chuyen doi tu List sang Array
public class SdungGet {
    public static void main(String[] args) {

    List<String > list = new LinkedList<>();
    list.add("manh");
    list.add("hue");
    list.add("maianh");
    list.add("anh");
    // lưu tru no ben trong mang
        String[] arr = new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i); // gan phan tu
        }
        for (String x : arr)
            System.out.print(x + " ");
    }

}
