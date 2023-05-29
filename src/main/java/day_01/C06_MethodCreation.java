package day_01;

public class C06_MethodCreation {
    public static void main(String[] args) {


        //Kare prizmanin hacminin bulan ve donduren bir method yaziniz.
        //Not: KAre prizma hacmi: taban alani*yukseklik ==> a*a*h
        int tabanKenar = 3;
        int yukseklik=4;
        //taban keanri 3, yukseklik 4 ==>hacim:36


        System.out.println(karePrizmaHacimBul(3,4));


    }//main


    public static int karePrizmaHacimBul ( int tabanKenari, int yukseklik ){
        int hacim=tabanKenari*tabanKenari*yukseklik;
        // * * * * *Donderecgimiz "METHOD VOID" degilse mutlaka "RETURN" etmeliyiz. * * * * *
        //access mod + static + return type + isim () {}
        //public, default, private, protected
        return hacim;// void yazmadigimiz icin return ettik. yukarida void=>int yazildigi icin
    }//karePrizmaHacimBul













}//class
