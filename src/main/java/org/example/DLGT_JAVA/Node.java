package org.example.DLGT_JAVA;

public class Node {
    int data; // Dữ liệu trong nút
    Node next; // Con trỏ đến nút tiếp theo

    Node(int data) {
        this.data = data;
        this.next = null; // Khởi tạo con trỏ next là null
    }
}
