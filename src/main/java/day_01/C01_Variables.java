package day_01;




public class C01_Variables {
    public static void main(String[] args) {

    //yorum
    /*
    yorum
    yorum
    yorum
     */


        //bir variable olustur, yazdir
        //syntax: data turu + datanin ismi = (atama operatoru) variable degeri
        int yas = 32;
        int sayi= 50;

        System.out.println(yas);//ln==> line next yani islemi yap
        System.out.println(sayi);

        //sayi = 50 seklinde yazdir, yani etiketi ile yazdir.
        System.out.println("sayi= " + sayi);
        System.out.println("sayi = " + sayi);//soutv degiskeni etiketi ile birlikte yazdirma islemi yapar.

        //String bir data olusturalim ==> non-primitive "Buyuk harfle baslar"
        String isim= "Ali";//etiketiyle birlikte yazdir (isim=Ali seklinde)
        System.out.println("isim = " + isim);


        //Olusturdugun bir Variable'i farkli bir Variable'ye kopyalama
        int benimYasim =yas; //rename ile heryerde ad degistirilir "all"
        System.out.println("benimYasim = " + benimYasim);
        String onunIsmi= isim;
        System.out.println("onunIsmi = " + onunIsmi);

        /*
        camelCase   kucuk baslar Buyuk devam eder
        PascalCase  Buyuk baslar Buyuk devam eder
        snake_case  aralarda _ cizgi olur
        kebab-case  aralarda - cizgi olur
        */



        //Ayni satirda coklu variable deklare et
        int yil=2023, ay= 4, gun=21;
        System.out.println("yil= " + yil);

        //Bir variable degerini guncelle
        yil=2024;
        System.out.println("yil = " + yil);//Java yukaridan asagiya ve soldan saga calisir, java runtime programming'dir, yani calisirken tanimlar.
        //Degiskenleri(Variable) yazdir



        //Bir variable deklere et : x
        double x;

        //Bir variable baslat : y (initialize)
        double y=12.5;

        //Başka bir variable başlat : z
        double z=33;

        //x degişkenini y degişkeni ile başlat
        x=y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Variable y'i guncelle==>14.9 olarak guncelle
        y=14.9;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Degişkenleri yazdır


























    }//main

}//class
