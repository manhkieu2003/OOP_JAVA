package org.example.kiemtra2;

import java.sql.SQLOutput;
import java.util.*;

public class QLPTGT implements Chucnang {
    private List<PTGT> list;
    private Scanner sc = new Scanner(System.in);
    public QLPTGT() {
        list = new ArrayList<PTGT>();
        list.add( new Oto("HN432","Yaris",2024,80808080,"BB765",4,"do"));
        list.add( new Oto("HN789","KiaMorninh",2021,9000000,"BB766",4,"xanh"));
        list.add(new Xemay("HN123","SH",2020,120000,"Hong",150));
        list.add(new Xemay("HN567","WAY",2021,90000,"DEN",110));

    }
    // kiem tra tontai
    private PTGT tontai(String ma) {
        for(PTGT i :list){
            if(i.getMa().equalsIgnoreCase(ma)){
                return i;
            }

        }
        return null;
    }
    // chung nhap nhap
    private PTGT nhap()
    {
        PTGT t=null;
        String ma,hang;
        int nam;
        double gia;
        String mau;
        String regex ="^HN\\d{3}";
       while(true){
           System.out.println("Moi nhap ma");

           ma = sc.nextLine();
           if(ma.matches(regex)&& (tontai(ma)==null)){ //ddung nhu regex va ma chua ton tai la ma bang null
             break;

           }
           System.err.println("moi nhap lai ma");



       }
        System.out.println("Moi nhap hang");
       hang = sc.nextLine();
        System.out.println("nhap nam");
        nam = sc.nextInt();
        System.out.println("nhap gia");
        gia = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap mau");
        mau = sc.nextLine();
        t = new PTGT(ma,hang,nam,gia,mau);

        return t;
    }
    @Override
    public void nhapOto() {
     PTGT t = nhap();
        System.out.println("nhap dong co");
       String dc = sc.nextLine();
        System.out.println("nhap so cho");
        int scho = sc.nextInt();
    list.add(new Oto(t.getMa(), t.getHang(), t.getNam(), t.getGia(),dc, scho,t.getMau()));
    }

    @Override
    public void nhapXemay() {
     PTGT t = nhap();
        System.out.println("nhap cong suat");
        double congsuat = sc.nextDouble();
        list.add(new Xemay(t.getMa(), t.getHang(), t.getNam(), t.getGia(),t.getMau(),congsuat));

    }

    @Override
    public void vietDs() {
        System.out.println("Danh sach xe Oto");
        for(PTGT i : list){
            if(i instanceof Oto)   // kieemr tra neu la ooto
            {
                System.out.println(i);
            }
        }
        System.out.println("Danh sach xe May");
        for(PTGT i : list){
            if(i instanceof Xemay) // kiem tra neu la xe may
            {
                System.out.println(i);
            }
        }
    }

    @Override
    public void sua() {
        // cách 1
        System.out.println("nhap ma can sua");
        String ma = sc.nextLine();
        PTGT t = tontai(ma);
        if (t == null) {
            System.err.println("co dau ma sua");
        } else {
            int pos = list.indexOf(t); // lay vi tri
            // nhap thong tin can sua
            System.out.println("nhap hang");
            String hang = sc.nextLine();
            System.out.println("nhap nam");
            int nam = Integer.parseInt(sc.nextLine());
            System.out.println("nhap gia");
            double gia = sc.nextDouble();
            sc.nextLine();
            System.out.println("nhap mau");
            String mau = sc.nextLine();
            PTGT p = list.get(pos);      // truy cap dung vao vi tri do
            p.setHang(hang);
            p.setNam(nam);
            p.setGia(gia);
            p.setMau(mau);
            System.out.println("sua thanh cong");
        }
//        System.out.println("===========================");
//        //cach 2
//        System.out.println("nhap ma can sua");
//        String ma = sc.nextLine();
//        PTGT t = tontai(ma);
//        if(t == null){
//            System.out.println("co dau ma sua");
//        }else{
//            int pos = list.indexOf(t);
//            // nhap thong tin can sua
//            System.out.println("nhap hang");
//            String hang = sc.nextLine();
//            System.out.println("nhap nam");
//            int nam =Integer.parseInt(sc.nextLine());
//            System.out.println("nhap gia");
//            double gia = sc.nextDouble();
//            sc.nextLine();
//            System.out.println("nhap mau");
//            String mau = sc.nextLine();
//         PTGT pt = new PTGT(ma,hang,nam,gia,mau);
//         list.set(pos,pt);
//            System.out.println("sua thanh cong");
    //}


    }

    @Override
    public void xoa() {
        System.out.println("nhap ma can xoa");
        String ma = sc.nextLine();
        PTGT t = tontai(ma);
        if(t==null)
        {
            System.err.println("có dau ma xoa");
        }else{
            list.remove(t);
            System.out.println("da xoa thanh cong");
        }
    }

    @Override
    public void tkTheoMa() {
        System.out.println("nhap ma can tim");
        String ma = sc.nextLine();
        PTGT t = tontai(ma);
        if(t==null)
        {
            System.err.println("co dau ma tim");
        }else{
            System.out.println(t);
        }
    }

    @Override
    public void tkTheoHang() {
        // tim co chua xau
        System.out.println("nhap hang can tim");
        String hang = sc.nextLine().toLowerCase(); // ve chu thuong
        boolean co = false;
        for(PTGT i : list){
            if(i.getHang().toLowerCase().equals(hang)) // if(i.getHang().toLowerCase().indexof(hang) >=0)
            {
                System.out.println(i);
                co=true;
            }
        }
        if(!co)
        {
            System.out.println("ko tim thay");
        }
    }

    @Override
    public void tkTheoNam() {
        // tu nam nao den nam nao
        System.out.println("nhap tu nam");
        int nam1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhap den nam");
        int nam2 = Integer.parseInt(sc.nextLine());
        boolean co = false;
        for(PTGT i : list){
            if(i.getNam()>=nam1 && i.getNam()<=nam2)
            {
                System.out.println(i);
                co= true; // danh dau da tim thay
            }
        }
        if(!co)

        {
            System.out.println("khong tim thay");
        }



    }

    @Override
    public void tkGiaCao() {
        System.out.println("nhap gia cao");
       double gia = sc.nextDouble();
        boolean co = false;
        for(PTGT i : list){
            if(i.getGia() >=gia)
            {
                System.out.println(i);
                co=true;
            }
        }
        if(!co)
        {
            System.out.println("khong tim thay");
        }

    }

    @Override
    public void sxTheoMa() {
     list.sort(new Comparator<PTGT>() {
         @Override
         public int compare(PTGT o1, PTGT o2) {
             return o1.getMa().compareToIgnoreCase(o2.getMa());
         }
     });
    }
    @Override
    public void sxTheoHang()
    {

    }

    @Override
    public void sxTheoNam() {    // day la su dung comparator : comparator la 1 inter nen dung 1 anonymousClass có t
        // sx dc nhieu
    Collections.sort(list,new Comparator<PTGT>(){

        @Override
        public int compare(PTGT o1, PTGT o2) {
            return o1.getNam()-o2.getNam(); // tang dan
            //giam dan o2.getNam() - o1.getNam()
        }
    });
    }

    @Override
    public void sxTheoGia() {
        Collections.sort(list);
    }

    @Override
    public void thongke() {

    }
}
