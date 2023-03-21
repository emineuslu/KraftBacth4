package day07_Aritmetic_Operators;

public class Aritmetic_Operators_3 {
    public static void main(String[] args) {

     //4500dk kac saattir
   /*  int dk=4500;
     int saat=4500;
     int saat=4500/60;

        System.out.println("saat = " + saat); */


        //31502 saniye kaç saat kaç dakika kaç saniyedir?
        // (1 saat 60 dakika 1 dakika 60 sn)

        int toplamSaniye=31502;
        int saat=toplamSaniye/3600;
        int dakika=(toplamSaniye%3600)/60;
        int saniye=toplamSaniye%60;
        System.out.println("saat = " + saat);
        System.out.println("dakika = " + dakika);
        System.out.println("saniye = " + saniye);




    }


}
