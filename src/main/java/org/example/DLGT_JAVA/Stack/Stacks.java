package org.example.DLGT_JAVA.Stack;

import java.util.Stack;

public class Stacks {
    //  co che la lifo :last in first out : vao sau ra truoc
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        stack.peek();
        System.out.println(stack.peek());//Trả về phần tử ở đầu ngăn xếp nhưng không xóa phần tử đó
        System.out.println(stack);
        stack.pop(); //Loại bỏ và trả về phần tử trên cùng của ngăn xếp. Một 'EmptyStackException'

       // Một ngoại lệ sẽ được đưa ra nếu chúng ta gọi pop() khi ngăn xếp đang trống
        System.out.println(stack);
    }
}
