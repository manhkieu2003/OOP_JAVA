package org.example.demo;

public class ObjectClone implements Cloneable {
    //Object cloning là cách để tạo ra một bản sao chính xác của một đối tượng bị clone. Phương thức clone() được sử dụng để tạo ra một object mới.
    // implement interface java.lang.Cloneable và co ngoai le CloneNotSupportedException.
     int rollno;
     String name;
     public ObjectClone(int rollno, String name) {
         this.rollno = rollno;
         this.name = name;
     }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            ObjectClone s1 = new ObjectClone(106, "An");
            ObjectClone s2 = (ObjectClone) s1.clone();
            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);
        } catch (CloneNotSupportedException c) {
        }
    }
}
