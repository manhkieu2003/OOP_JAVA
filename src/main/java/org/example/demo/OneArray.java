package org.example.demo;

public class OneArray {
    // method
    //public protected  or modifier private
    //cach 2
    private static  double tongdayso(double... a1)   // static

    {
         double sum1 = 0;
         for(double x1:a1)
         {
             sum1+=x1;
         }
         return sum1;
    }
    // cach 1
    private static  double tongdayso2(double[] a)   // static

    {
        double sum = 0;
        for(double x:a)
        {
            sum+=x;
        }
        return sum;
    }

    public static void main(String[] args) {
        // neu co static thi dc goi luon
        double[] a = {1,2,4,5};
        System.out.println("tong="+tongdayso2(a));

//       OneArray a = new OneArray();
//        System.out.println("tong="+a.tongdayso2(new double[] {1,2,3}));
        System.out.println("tong ="+tongdayso(1.2,1.3,1.4));
    }
}
