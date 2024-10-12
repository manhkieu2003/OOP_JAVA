package org.example.ListConverArray;

import java.util.LinkedList;
import java.util.List;

public class SdungStream {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        String[] arr
                = list.stream().toArray(String[] ::new);
        for (String str : arr)
        {
            System.out.println(str);
        }
    }

}
