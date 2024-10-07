package org.example.DLGT_JAVA.BubbleSortName;

public class BubbleSortByName {
    public static void BubbleSort(Person[] arr)
    {
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0; i < n-1; i++)
        {
            boolean flag = true;
            for (int j=0;j<n-1-i;j++)
            {
                // So sánh tên của hai Person liền kề (so sánh chuỗi)
                if (arr[j].getName().compareTo(arr[j + 1].getName()) > 0) {
                    Person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }

    }
    // Phương thức in mảng các Person
    public static void printArray(Person[] arr) {
        for (Person person : arr) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        // Tạo một mảng các đối tượng Person
        Person[] persons = {

                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("David", 28),
                new Person("Eve", 22),
                new Person("Alice", 30),
        };

        System.out.println("Danh sách ban đầu:");
        printArray(persons);  // In danh sách trước khi sắp xếp

        BubbleSort(persons);  // Gọi phương thức sắp xếp theo tên

        System.out.println("\nDanh sách sau khi sắp xếp theo tên:");
        printArray(persons);  // In danh sách sau khi sắp xếp
    }
}
