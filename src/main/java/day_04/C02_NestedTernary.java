package day_04;

import java.util.Scanner;

public class C02_NestedTernary {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir karakter sisteme girmesini isteyin.
            Ternary kullanarak;
            bu karakterin bir harf olup olmadıgını kontrol edin.
            Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
            Harf degilse konsola "Harf Degil" yazdırın.                  */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz..");
        char kark = input.next().charAt(0);

        // ascii tablosundan a-z ile A-Z arasini kontrol ederiz
        // kark>='a' && kark<='z' ile kark>='A' && kark<='Z'

        System.out.println((kark>='a' && kark<='z') || (kark>='A' && kark<='Z') ?
                           (kark>='a' && kark<='z' ? "Kucuk harf" : "Buyuk harf") : ("Harf degildir.."));
















    }
}
