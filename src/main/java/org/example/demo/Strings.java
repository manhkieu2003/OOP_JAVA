package org.example.demo;

import java.util.Locale;

public class Strings { // co 4 kieu sau
    // String, StringBuffer : có hoo tro dong bo,String builder ko ho tro dong bo(not threadsafe),String tokenizer
    // String cấp phát tĩnh : new sẽ mặc dinh la 256 ki tu 3 cái con lai la cap phat tinh
    // cấp phát tĩnh thì k có lenh inssert update delej day
    public static void main(String[] args) {
        //String methods basic
        String name ="Ly Lao Lo";
        String name1="  Ly Lao Lo  ";
        String name2=" Ly Lao Lo";
        System.out.println(name.toUpperCase()); // LY LAO LO
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name1.trim()); // bo dau cach dau cuoi
        System.out.println(name2.indexOf("y")); // 2
        System.out.println(name2.indexOf("La")); // 4
//        System.out.println(name.lastIndexOf("L"));

        System.out.println(name.length()); // 9
        System.out.println(name.charAt(1)); // lai dem tu 0  den n : =>y
        System.out.println(name.substring(5)); // bat dau xoa tu vi tri thu 5
        System.out.println(name.substring(2,5));// " La"
        String html = "html.com";
        String st1 =".com";
        String st2 =".gom";
        boolean retval1 = html.endsWith(st1);
        boolean retval2 = html.endsWith(st2);
        System.out.println(retval1); // true
        System.out.println(retval2); // false
        System.out.println("==================");
        String a ="Ha noi";
        System.out.println(a.compareTo("ha noi")); //-32
        // compareto: phân biet chu thuong chu hoa nó sẽ tinhs từ so sanh tu trai sang phai tru vs bang ma ascii
        System.out.println(a.compareToIgnoreCase("ha noi")); //0 : khong phan biet chu thuong chua hoa
        System.out.println(a.compareTo("Ha")); //4
        System.out.println(a.compareTo("Ha noi")); //0
        System.out.println(a.compareTo("Ha noi ruc ro ve dem")); //-32
        System.out.println(a.equalsIgnoreCase("Ha Noi")); // true
        System.out.println(a.equals("Ha Noi"));
        System.out.println("==============");
        //split chặt sâu kí tu
       String xau ="  mau do la   mau   yeu thich cua co   ".trim();
        String[] tus =xau.split("\\s+"); // chawt theo dau cach
        System.out.println("tu:"+tus.length); //8
        String st ="ngay 19 thang 9 nay 88 cay 66";
        String[] tu = st.split("[\\s\\d]+");
        for (String i :tu)
        {
            System.out.println(i);
        }




    }


}
