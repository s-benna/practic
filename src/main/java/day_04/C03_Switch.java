package day_04;

import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {
        // Kullanıcıdan uc basamaklı bir sayı sisteme girmesini isteyiniz
        // Bu sayıyı okunuşuna çeviren bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli sayi giriniz..");
        int sayi = input.nextInt();

        if (sayi < 100 || sayi > 999) {
            System.out.println("3 basamakli sayi giriniz..");
        }else {
            int birler = sayi%10;
            int onlar  = (sayi/10)%10;
            int yuzler = sayi/100;

            switch (yuzler){
                case 1:
                    System.out.print("Yuz");
                    break;
                case 2:
                    System.out.print("Ikiyuz"+"-");
                    break;
                case 3:
                    System.out.print("Ucyuz"+"-");
                    break;
                case 4:
                    System.out.print("Dortyuz"+"-");
                    break;
                case 5:
                    System.out.print("Besyuz"+"-");
                    break;
                case 6:
                    System.out.print("Altiyuz"+"-");
                    break;
                case 7:
                    System.out.print("Yediyuz"+"-");
                    break;
                case 8:
                    System.out.print("Sekizyuz"+"-");
                    break;
                case 9:
                    System.out.print("Dokuzyuz"+"-");
                    break;
            }
            switch (onlar) {
                case 1:
                    System.out.print("On"+"-");
                    break;
                case 2:
                    System.out.print("Yirmi"+"-");
                    break;
                case 3:
                    System.out.print("Otuz"+"-");
                    break;
                case 4:
                    System.out.print("Kirk"+"-");
                    break;
                case 5:
                    System.out.print("Elli"+"-");
                    break;
                case 6:
                    System.out.print("Altmis"+"-");
                    break;
                case 7:
                    System.out.print("Yetmis"+"-");
                    break;
                case 8:
                    System.out.print("Seksen"+"-");
                    break;
                case 9:
                    System.out.print("Doksan"+"-");
                    break;}
            switch (birler){
                case 1:
                    System.out.print("Bir");
                    break;
                case 2:
                    System.out.print("Iki");
                    break;
                case 3:
                    System.out.print("Uc");
                    break;
                case 4:
                    System.out.print("Dort");
                    break;
                case 5:
                    System.out.print("Bes");
                    break;
                case 6:
                    System.out.print("Alti");
                    break;
                case 7:
                    System.out.print("Yedi");
                    break;
                case 8:
                    System.out.print("Sekiz");
                    break;
                case 9:
                    System.out.print("Dokuz");
                    break;}
        }














    }




}

