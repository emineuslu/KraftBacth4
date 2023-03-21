package day09_OperatorsCont;

import java.util.Scanner;

public class C02_BedenKitleİndelsi {
    public static void main(String[] args) {


       /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.

        Beden Kitle İndeksi(bki) : Kilo / (Boy(m) * Boy(m))

        */

    Scanner scan=new Scanner(System.in);

        System.out.print("Kilonuzu giriniz (80) : ");
        int kilo =scan.nextInt();

        System.out.print("Boyunuzu giriniz (or:1,80: ");
        int boy =scan.nextInt();

        double bki=kilo/(boy*boy);


        System.out.println("Kilonuz . ");
        System.out.println("Boyunuz : ");
        System.out.println("Beden Kitle İndeksi");


















    }
}
