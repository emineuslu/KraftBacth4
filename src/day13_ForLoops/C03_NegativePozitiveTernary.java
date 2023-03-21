package day13_ForLoops;

import java.util.Scanner;

public class C03_NegativePozitiveTernary {
    public static void main(String[] args) {



      Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bır sayı giriniz");
        int n=scan.nextInt();

        if(n>0){
            System.out.println("positive number");

        }else if(n<0){
            System.out.println("negative number");

        }else{
            System.out.println("zero");
        }
        System.out.println("-------------------------------");

        String result= (n>0) ? "positive number" : (n<0) ? "negative number" : "zero";

        // n=-5        (n>0) ? "positive number"
        // n=0          (n>0) ? "positive number"  :"zero





    }
}
