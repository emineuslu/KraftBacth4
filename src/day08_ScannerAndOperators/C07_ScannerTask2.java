package day08_ScannerAndOperators;


import java.util.Scanner;

public class C07_ScannerTask2 {

    public static void main(String[] args) {

   ////      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        //        Isminiz : Himmet
        //        //        Soyisminiz : Abi
        //        //        Yasiniz : 38
        //        //      Dogum Yeriniz: Kayseri
        //        //        Kaydiniz basariyla tamamlanmistir.

            Scanner scanner=new Scanner(System.in);

        System.out.print("Lutfen ısmınızı gırınız:  ");

        String isim= scanner.nextLine();

        System.out.print("Lutfen soyısım gırınız:");

        String soyisim= scanner.nextLine();

        System.out.print("Lutfen yasınızı gırınız:");

        int yas= scanner.nextInt();

        scanner.nextLine();     // nextInt  den sonra nextLine a gecebılmek ıcn bu basluk yazılmalı
        System.out.println("lutfen dogum yerınızı gırınız:");
        String dogumYeri=scanner.nextLine();



        System.out.println("isminiz : "+isim);
        System.out.println("Soyisminiz :"+soyisim);
        System.out.println("Yasiniz: "+yas);
        System.out.println("Dogum Yeriniz:"+dogumYeri);
        System.out.println("Kaydınız Basarıyla Tamamlanmıstır.");

  //kullanıcının ıstedıgımız verı turunde degerr gırısı yapmazsa  */





    }





}
