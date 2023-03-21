package day10_unaryLogicalOperAndReview;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[] args) {

      /*  1. write a program that can swipe two variables' value by using a temporary variable

        Ex:
        if a= 10, b=15

        output:
        a = 15
        b = 10    */
      Scanner scan =new Scanner(System.in);


        System.out.println("a sayısı ıcın bır tam sayı gırın :");
    int a= scan.nextInt();  //30


        System.out.println("b sayısı ıcn bır tam sayı gırınız :");
    int b = scan.nextInt();   //15

        System.out.println("a = " + a);              //30
        System.out.println("b = " + b);              //15

        int temp=a;      // temp=10
        a=b;               //a=15
        b=temp;            //b=10

        System.out.println("a = " + a);    //a=15
        System.out.println("b = " + b);     //b=30

    }
}
