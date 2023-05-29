package day_04;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        /*  Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.          */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kelime giriniz..");
        String kelime = input.next().toLowerCase();

        int sayac = 0; //a harflerini koyacagimiz konteyner, her a harfi ile sayac artacak

        for ( int i =0; i<kelime.length(); i++){
            if (kelime.charAt(i)=='a'){
                sayac++;
            } else if (kelime.charAt(i)=='c') {
              break;
            }

        }
        System.out.println("Girdiginiz kelimedeki ilk c ye kadar a harflarinin sayisi: "+sayac);





    }
}

         /*ODEV
         Kullanıcıdan sisteme bir sayı girmesini isteyiniz.
         1'den kullanıcının girdigi sayıya kadar yazdırınız


        NOT:
        3'un ve 5'in katı olan sayıların yerine 15k yazdırılacak
        5'in katı olan sayıların yerine 5k yazdırılacak
        3'un katı olan sayıların yerine 3k yazdırılacak




        Ornegin : 1 2 3k 4 5k 3k 7 8 3k 5k 11 3k 13 14 15k...

         */
