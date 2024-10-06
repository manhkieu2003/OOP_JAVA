package org.example.DLGT_JAVA.Stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        //offer nhu add
        for(int i=0;i<5;i++)

        {
            q.add(i);
        }
        System.out.println(q);
        int element = q.remove(); //0
        System.out.println(element); // 1 2 3 4
        System.out.println(q);

        // To view the head of queue
        int head = q.peek(); // dau hang doi -1
        System.out.println("head of queue-"
                + head);
        int size = q.size();
        System.out.println("Size of queue-"
                + size);
        // su dung iterator de duyet
        Iterator iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
//


//        ==========================
        // su dung listiterator
        ListIterator<Integer> listIterator =  ((LinkedList<Integer>) q).listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " ");
        }
        System.out.println("=========================");
//        next(),nextIndex(),remove()
        while(listIterator.hasNext())
        {
            int number = listIterator.next();// Lấy phần tử tiếp theo
            int index = listIterator.nextIndex(); // Lấy chỉ số tiếp theo

            System.out.println("Phần tử: " + number + ", Chỉ số tiếp theo: " + index);
            // Xóa các số chẵn
            if (number % 2 == 0) {
                iterator.remove(); // Xóa phần tử hiện tại
                System.out.println("Đã xóa: " + number);
            }
        }
        // Xóa phần tử "Banana"


        // duyet nguoc lai
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " ");
        }
        for(int i:q)
        {
            System.out.println(i);
        }


    }
}
