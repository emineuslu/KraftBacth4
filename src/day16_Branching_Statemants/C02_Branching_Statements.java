package day16_Branching_Statemants;

import java.util.Scanner;

public class C02_Branching_Statements {
    public static void main(String[] args) {

        /*// break kodu sonlandırır
        // return metodu sonlandırır
        // continue asagı ınmeden döngüye devam eder
        System.out.println("program basladı");
        int x=1;
        for (int i = 0; i < 100; i++) {
          x++;
          if(x==5){
              break;
          }
            System.out.print(x+" ");
        }
        System.out.println("program sonlandı");

        for(int i = 0; i < 10; i++) {
            if(i%2==0){

                continue;
            }
            System.out.println(i);
        }
        System.out.println("program sonlandı");*/


        //0 ve 20 dajıl aradakı cıft sayıları yazdıran programı yazın
       /*   int sum=0;
        for (int i = 0; i <=20 ; i++) {
            if (i % 2 == 0) {

        */    /* continue;
               sum += i;
            }

        }
            System.out.print("çift sayılar toplamı: " + sum);

         //veya

        for (int i = 0; i <=20; i++) {
            if(i%2==1){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);
                         veya*/

        //  System.out.println("---------------------------");

      /*  for (int i = 1; i <=100 ; i++) {
            if(!(i%5==0)){
                continue;
            }
            System.out.println(i+" ");
        }  */

//   // Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.


     /*   Scanner scan=new Scanner(System.in);
        String sifre="Harun123";
        int i=0;
        System.out.println("5 hakkın var ");

        while (i<5){
            System.out.print(i+1+".Tahmin: ");
            String tahmin=scan.next();
            if(tahmin.equals(sifre)){
                System.out.println("tebrikler");
                break;
            }
            i++;
            if(i==5){
                System.out.println("hatalı güle güle");
                break;
            }
            System.out.println("tekrar deneyiniz");

        } */


//Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
// istediğini sorun. 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
// kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
// 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.
        // 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
        // çıkarma menüsüne hoş geldiniz
        // x:
        // y:
        // result;
        // menüden çıkmak için 0 işlemlere devam etmek için 1 giriniz

     /*   Scanner scan = new Scanner(System.in);
        System.out.println("1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış");
        int tercih = scan.nextInt();
        if (tercih == 1) {
            while (true) {
                System.out.println("sayi1 : ");
                int x = scan.nextInt();
                System.out.println("sayi2 : ");
                int y = scan.nextInt();
                System.out.println("işlem sonucu: " + (x + y));
                System.out.print("çıkış için 0 işlem devam etmek icin 1 e tuslayınız ");
                int tercih2 = scan.nextInt();
                if (tercih2 == 0) {
                    break;
                } else if (tercih2 == 1) {
                    continue;
                } else {
                    System.out.println("hatalı işlem nedeniyle çıkış yaptınız");
                }

            }
        } else if (tercih == 2) {
            while (true) {
                System.out.println("sayi1 : ");
                int x = scan.nextInt();
                System.out.println("sayi2 : ");
                int y = scan.nextInt();
                System.out.println("işlem sonucu: " + (x - y));
                System.out.print("çıkış için 0 işlem devam etmek icin 1 e tuslayınız ");
                int tercih2 = scan.nextInt();
                if (tercih2 == 0) {
                    break;
                } else if (tercih2 == 1) {
                    continue;
                } else {
                    System.out.println("hatalı işlem nedeniyle çıkış yaptınız");
                }
            }
        }else if(tercih == 3) {
                         while (true) {
            System.out.println("sayi1 : ");
            int x = scan.nextInt();
            System.out.println("sayi2 : ");
            int y = scan.nextInt();
            System.out.println("işlem sonucu: " + (x * y));
            System.out.print("çıkış için 0 işlem devam etmek icin 1 e tuslayınız ");
            int tercih2 = scan.nextInt();
            if (tercih2 == 0) {
                break;
            }else if (tercih2 == 1) {
                    continue;
                } else {
                    System.out.println("hatalı işlem nedeniyle çıkış yaptınız");
                }
            }

        }*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.println("i= "+i+"       j= "+j);
            }
        }
    }


    }
