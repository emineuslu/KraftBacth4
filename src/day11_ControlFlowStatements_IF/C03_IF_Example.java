package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C03_IF_Example {
    public static void main(String[] args) {


        //alinın fızık notu 50
        //kımys 30 ortalaması 50 uzerınde ıse ekrana gectı yazsın
        //50 ve altında ıse herhamgı bır sey yazdırmasın

      /*  double fiz=50;
        double kim=30;
        double ort=(fiz+kim)/2;
        if(ort>50){           //boolean result=(ort>50)  seklındede yazabılırsınız
                             // double gecmenotu =50 if(gecmenotu)
            System.out.println("ali gecer");  */

        Scanner scan=new Scanner(System.in);
        System.out.println("ders notlarınız gırınız ");
        System.out.println("fızık=");
        double f=scan.nextDouble();

        System.out.println("kımya");
        double k=scan.nextDouble();
        System.out.println("gecme notu: ");
        double gecmeNotu=scan.nextDouble();

        double ort=(f+k)/2;

        if(ort>=gecmeNotu){

        System.out.println("Sınıfı gectiniz");}
        System.out.println("Harika");






    }


    }








