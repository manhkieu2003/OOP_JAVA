package org.example.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("ss1","manh");
        map.put("ss1","hue"); // ghi de len key la ss1
        map.put("ss2","woman");
        map.put("ss3","hello");
        map.put("ss4","world");
        map.put("ss5","man");
        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            System.out.println(key + ":" + map.get(key));
        }


    }
}
