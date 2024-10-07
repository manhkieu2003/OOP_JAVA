package org.example.DLGT_JAVA;

import java.util.Arrays;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        String[] tenphim ={"manh","hue","anh","maianh"};
          // voi array
        Iterator<String> itphim = Arrays.asList(tenphim).iterator();
        System.out.println(itphim.hasNext());
        System.out.println(itphim.next());
        while (itphim.hasNext()) {
            System.out.println(itphim.next());
        }
    }
}
