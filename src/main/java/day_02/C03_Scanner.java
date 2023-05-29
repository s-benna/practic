package day_02;

import java.util.Scanner;

public class C03_Scanner {
    /*
    Kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        int x = input.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz");
        int y = input.nextInt();

        boolean sonuc = karelerEsitMi(x,y);
        System.out.println("Sonuc: " + sonuc);

    }

    private static boolean karelerEsitMi(int x, int y) {

    boolean sonuc = x*x==y*y;
    return sonuc;

    }
}

