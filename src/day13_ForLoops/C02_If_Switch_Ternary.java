package day13_ForLoops;

import java.util.Scanner;

public class C02_If_Switch_Ternary {
    public static void main(String[] args) {

/* Kullanicidan bir harf isteyin
         o harfle baslayan gun ismi varsa yazdirin
         yoksa "gecersiz harf" yazdirin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bır harf alınız");
        char harf = scan.next().charAt(0); // scanner sınıfı ıle harf alamıyoruz, scan.next() String aldıl
        //charAt(0) bu aldıgımız kelimenın ılk harfını almıs olduk

        if (harf == 'p' || harf == 'P') {
            System.out.println("Pazar , Pazartesi, Persembe");
        } else if (harf == 's' || harf== 'S'){
            System.out.println("salı");

        }else if (harf == 'c' || harf== 'C'){
            System.out.println("carsamba,cuma,cumartesı");

        }else{
        System.out.println("Gecersız harf");
    }
        System.out.println("---------------------------------");

        // ternary
        // (condition) ? (return if true) : (return if false);
        //  (condition) ? (return if true) : (new ternary);



    }
}