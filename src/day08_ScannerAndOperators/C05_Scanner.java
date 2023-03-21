package day08_ScannerAndOperators;
 import java.util.Scanner;
public class C05_Scanner {
    public static void main(String[] args) {

        //1. adım Scanner objesı olusturalım

        Scanner scan = new Scanner(System.in);

        //2. kullanıcıyı bılgılendırır. ne ıstedıgımızı soyleyın
        System.out.println("Lutfen isminizi giriniz");

        //3. girilen bilgiyi icine koyabilecegimiz variable olusturuyoruz
        // olusturdugumuz degıskenın ıcersıne, scanner objesı ile uygun methodu cagırarak verıyı alın

        String name=scan.nextLine();

        System.out.println("Girilen isim :"+name);

    scan.close(); // bunu yazıncada sonlandırmıs oluyoruz ve yer kaplamıyor











    }






}
