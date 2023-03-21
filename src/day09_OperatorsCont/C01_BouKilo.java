package day09_OperatorsCont;
import java.util.Scanner;
public class C01_BouKilo {
    public static void main(String[] args) {

      //kullanıcıdan boy (ondalıklı) ve kilosunu (ondalıklı) bılgısını alıp ekrana tek satırda yazdırınız

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu girinız : ");
        double boy = input.nextDouble();

        System.out.println("Kilonuzu girinız :");

        double kilo=input.nextDouble();

        input.nextLine();

        System.out.println("lutfen isminizi giriniz :");

        String isim=input.next();  // sadece ılk kelımeyı alır yanı Ali Osman ı sadece "Ali" ısmını alır


        System.out.println("lutfen soyisminizi giriniz :");
        String soyisim=input.nextLine();



        System.out.println(isim+" "+soyisim+"boyunuz :" +boy+" Kilonuz : "+kilo+ " kg");





        //Scanner.next()   ilk bosluga kadar olan degerlerı alır
        //Scanner.nextLine() ilk enter a kadar olan degerlerı alır




    }





}
