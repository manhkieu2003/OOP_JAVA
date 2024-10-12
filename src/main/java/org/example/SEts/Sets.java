package org.example.SEts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    //Set: gia tri k duoc giong nhau ( no duplicate)
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("manh");
        s.add("manh");
        s.add("maianh");
        s.add("hue");
        s.add("anh");
        s.forEach(System.out::println); // set k trung lap gia tri
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
