package day_04;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {
         /*
       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */

    Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz..");
        int yil = input.nextInt();

        System.out.println("lutfen 1-12 arasi ay numarasi giriniz..");
        int ay = input.nextInt();

        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiginiz ay 31 gun ceker.."); break;// Ayni veri oldugu icin sout tek satira yazilabilir
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiginiz ay 30 gun ceker.."); break;
            case 2:
                if (yil%4==0){
                    System.out.println("Girdiginiz ay 29 gun ceker..");
                }else {
                    System.out.println("Girdiginiz ay 28 gun ceker..");
                }

            default:
                System.out.println("Lutfen gecerli ay numarasi giriniz..");
        }


    }

}
