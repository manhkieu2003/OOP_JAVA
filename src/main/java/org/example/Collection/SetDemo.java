package org.example.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// cung k trung lap gia tri
public class SetDemo {
    public static void main(String[] args) {
//        Set set = new HashSet();
//
//        set.add("manh");
//        set.add("woman");
//        set.add("woman");
//        set.add("james");
//        set.add("john");
//        System.out.println(set);
        Integer[] a={1,2,3,4,5,2,3,6,7};
        Set s = new HashSet();
        for(Integer i:a)
        {
            s.add(i);
        }
        System.out.println(Arrays.toString(a)); // in mang 
        System.out.println(s);

    }
}
