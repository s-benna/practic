package day_01;

public class C03_Ortalama {
    public static void main(String[] args) {

         /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */


        double num1=23.4;
        double num2=24.0;
        double num3=12;
        double num4=450.3;
        double num5=100;

        //ortalama nasil hesaplanir ==> tum sayilari topla, sayi adedine bol


        double toplam= num1 + num2 + num3 + num4 + num5;
        //ifadenin onunde String varsa + isareti yan yana yazdirma islemi yapar
        //+ isaretinin onunde string yoksa ve numreic data varsa + isareti matemetiksel islem yapar
        System.out.println("toplam = " + toplam);//609.7
        double ortalama= toplam/5;
        System.out.println("ortalama = " + ortalama);

        System.out.println("ortalama: " +(num1+num2+num3+num4+num5)/5);






















    }//main
}//class
