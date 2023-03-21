package day17_Methods;



import java.util.Scanner;

public class C04_Methods_02 {
    public static void main(String[] args) {
      aritmeticOrtalama();
      enBuyuk();
      kiloOkkaCevir();
      kupHesapla();
      isimYaz();
      sayiKaresi();
      ikiSayiOrtalama();
      ortalama3();
      isimYas();
    }
    public static void aritmeticOrtalama(){

        double x=3, y=5 , z=10;
        double result=(x+y+z)/3;
        System.out.println("ortalama: "+result);
    }

   /* public static void buyukSayi(){
       int a=5 , b=7;
       int result=Math.max(a,b);
        System.out.println(result);
    }*/
       public static void enBuyuk(){
           int x=10;
           int y=20;
           int max=;
           if(x>y){
               max=x;
           }else {
               max=y;
           }
           System.out.println("en buyuk sayı: "+max);
       }

      // bır metod yazın kılo yu okka cinsinden versin.  okka=1.282 kg
       public static void kiloOkkaCevir(){
           Scanner scan=new Scanner(System.in);                              //  bu yazdıklarımın hepsı sadece class ıcınde
           System.out.println("Kilogram : ");                               //   main metodun suslusu icinde degıl
           double kilogram=scan.nextDouble();
           double okka=kilogram/1.282;
           System.out.println(kilogram+"kilogram"+okka+"okkadır");
       }


       //f(x)=x*x*x
      public static void kupHesapla(int x){
           int result=x*x*x;
          System.out.println("sonuc: "+result);
      }


          // bır sayının karesini hesaplasın yazan metod
       public static void sayiKaresi(int x) {
           int result = x * x;
           System.out.println(result);
       }


       // parametre olarak ısmınızı alan  ve sonucunu ısminiz ...... yazan programı yazınız

         public static void isimYaz(String name){
             System.out.println("isminiz: "+name);
         }




    public static void max(int x,int y){
        int max;

        if(x>y){
            max=x;
        }else {
            max=y;
        }
        System.out.println("En buyuk sayı: "+max);
    }

    public static void ikiSayiOrtalama(int x, int y){
         double result=((double) x+y)/2;
        System.out.println(result);
    }

    public static void ortalama3(double x, int y, int z){
           double ortalama=(x+y+z)/3;
        System.out.println("ortalama = " + ortalama);
    }


     public static void isimYas(Stringname ,int yas){

         System.out.println(isim+" "+yas+" ındadır" );
     }

}
