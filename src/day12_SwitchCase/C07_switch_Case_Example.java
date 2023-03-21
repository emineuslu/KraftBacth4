package day12_SwitchCase;


import java.util.Scanner;

public class C07_switch_Case_Example {
    public static void main(String[] args) {

        //+,-,*,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,*,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.


       /* Scanner scan=new Scanner(System.in);
        System.out.println("Sayı 1:");
        double x= scan.nextDouble();
        System.out.println("Sayı 2:");
        double y= scan.nextDouble();
        System.out.println("lütfen işlem seciniz (+,-,*,/): ");

        String islem=scan.next();

        switch (islem){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
            break;
            case "*":
                System.out.println(x*y);
            break;
            case "/":
                System.out.println(x/y);
                break;
                default:
                System.out.println("Hatalı giris");
        }*/

        //haftanın gununu kullanıcıdan alın ve ekrana o günün ismini yazdırın
        //1  pazartesi
        //3 carsamba
        // 7 pazar


        Scanner scan = new Scanner(System.in);

     /*   System.out.println("lütfen bır gun gırınız");

        int carsamba=3;

        switch (carsamba){
            case 1:
                System.out.println("pazartesı");
                break;
            case 2:
                System.out.println("salı");
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("persembe");
                case 5:
                System.out.println("cuma");
                case 6:
                System.out.println("cumartesi");
                case 7:
                    System.out.println("pazar");
            default:
                System.out.println("hatalı gırıs 1 ıle 7 arasında bır gun gırınız.");
        }*/

        // bir program yazın swich yapısını kullanın
        // şu beden numaralarını : small(38-40-42)
        // medium(44-46-48),  large(50-52-54) yakalasın. asagıdakı sekılde cıktı alın
        // Example output: 50 numara bır large bedendır

        int beden = 50;
        switch (beden) {
            case 38, 40, 42:
                System.out.println("small");
                break;
            case 44, 46, 48:
                System.out.println("medium");
                break;
            case 50, 52, 54:
                System.out.println("large");
                break;
            default:
                System.out.println("Beden elimizde yok");


        }


    }

}