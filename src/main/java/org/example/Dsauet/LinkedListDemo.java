package org.example.Dsauet;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // use as a stack; // lifo : vao truoc ra sau
//       list.push("A");
//       list.push("B");
//       list.push("C");
//       list.push("D");
//       list.push("E");
//        System.out.println(list);
//        list.pop();
        // use  as a Queue: fifo: hahangfg doi vao truoc ra truoc
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.poll();
        System.out.println(list);
    }
}
