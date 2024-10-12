package org.example.Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDemo {
    public static void main(String[] args) {
        List<String> g
                = Arrays.asList("geeks", "for", "geeks");
        //String du lieu de gom
        //Long la kieu tra ve
        Map<String,Long> count =g.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //Function.identity() co the thay bang thuoc tinh mk can gom nhom
        System.out.println(count);
    }
}
