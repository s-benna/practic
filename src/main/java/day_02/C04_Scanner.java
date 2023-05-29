package day_02;

import java.util.Scanner;

public class C04_Scanner {
    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A ==> 2 bosluk +task3+ 2 bosluk
                 A A==> 1 bosluk +task3+ 1bosluk +task3+ 1bosluk
                A A A=> task3+ 1bosluk +task3+ 1bosluk +task3

         */
        public static void main(String[] args) {

            Scanner ucgen = new Scanner(System.in);
            System.out.println("Lutfen bir harf giriniz.");

            char task3 = ucgen.next().charAt(0);// 0 burada 0. index demektir.
            System.out.println("Karekter: " + task3);

            System.out.println("=====================");

            System.out.println("  "+ task3 +"  ");
            System.out.println(" "+ task3 + " "+ task3 +" ");
            System.out.println(task3+ " "+task3+" "+task3);

            System.out.println("Tek sout ile yazdirma");
            //Tek sout ile yazdirmak icin "\n"
            System.out.println("  "+task3+"  \n"+" "+task3+" "+task3+" \n"+task3+" "+task3+" "+task3);
        }
}
