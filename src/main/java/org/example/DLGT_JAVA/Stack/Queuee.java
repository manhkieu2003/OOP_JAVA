package org.example.DLGT_JAVA.Stack;

import java.util.LinkedList;
import java.util.Queue;
//queue la 1 interface thong new thong qua lop cai dat cua no

public class Queuee {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("manh");
        queue.add("woman");
        queue.add("hue");
        queue.add("maianh");
        System.out.println(queue);
// remove the element at the front of the queue
        String front = queue.remove();  // xoa thang o dau
        System.out.println("Removed element: " + front);
        // print the updated queue
        System.out.println("Queue after removal: " + queue);
        // add another element to the queue
        queue.add("date");
        System.out.println(queue);

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
        // print the updated queue
        System.out.println("Queue after peek: " + queue);
        // xoa phan tu theo chi dinh
        queue.remove("woman");
        System.out.println(queue);
        System.out.println("Poll Method " + queue.poll()); // phan tu dau tien

        System.out.println("Final Queue " + queue);

    }
}
