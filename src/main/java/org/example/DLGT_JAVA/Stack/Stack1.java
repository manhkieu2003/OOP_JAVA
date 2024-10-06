package org.example.DLGT_JAVA.Stack;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(0);
        stack1.push(5);
        stack1.peek();
        System.out.println(stack1.peek());
        stack1.push(1);
        stack1.push(-1);
        stack1.pop();
        stack1.push(2);
        System.out.println(stack1);
    }
}
