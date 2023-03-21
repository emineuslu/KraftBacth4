package day10_unaryLogicalOperAndReview;


import java.util.Scanner;

public class C02_EvenlyDivisible {
    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);

        System.out.println("Enter an İnteger number :");
        int number =scan.nextInt();

        boolean isDivisibleBy2= number%2==0;     // bu sayı 2 ye bolununce kalan sıfırsa 2ye bolunuyor demektır
        boolean isDivisibleBy3= number%3==0;     // bu sayı 3 ye bolununce kalan sıfırsa 3ye bolunuyor demektır
        boolean isDivisibleBy5= number%5==0;     // bu sayı 5 ye bolununce kalan sıfırsa 5ye bolunuyor demektır
        System.out.println(number+" is divisible by 2: "+isDivisibleBy2);
        System.out.println(number+" is divisible by 3: "+isDivisibleBy3);
        System.out.println(number+" is divisible by 5: "+isDivisibleBy5);





    }
}
