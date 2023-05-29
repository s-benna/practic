package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
        /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
        public static void main(String[] args) {

            Scanner task2 = new Scanner(System.in);//**Scanner task2 ile task2.nextInt ifadelerinde ki 'task2'ler yerine
                                                   //yazilan IKI IFADE DE AYNI OLMALIDIR.
            System.out.println("Lutfen ilk rakami girniz.");
            int sayi1 = task2.nextInt();

            System.out.println("Lutfen ikinci rakami girniz.");
            int sayi2 = task2.nextInt();

            System.out.println("Swap omcesi sayi-1: " + sayi1);
            System.out.println("Swap oncesi sayi-2: " + sayi2);


            int temp=0;
            temp =sayi1;
            sayi1=sayi2;
            sayi2=temp;

            System.out.println("Swap sonrasi sayi-1: " + sayi1);
            System.out.println("Swap sonrasi sayi-2: " + sayi2);
            swaplaYazdir(sayi1,sayi2);

        }//main

    private static void swaplaYazdir(int sayi1, int sayi2) {
    }
}//class
