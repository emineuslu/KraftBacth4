package day10_unaryLogicalOperAndReview;

public class C04_UnaryOperators {
    public static void main(String[] args) {
       //+,-,++,--
        int num1=+3;

        int num2=-2;

        System.out.println(num1>0);  //true
        System.out.println(num2>0);  //false

        System.out.println("------------------");
        int a=10;
        ++a;  //    a= a+1   pre increment : sayının degerını bır arttırır  // a=11
        System.out.println(a);    //11

        --a;  //   a= a-1  pre decrement : sayının degerını bır azaltır  //  a=10
        System.out.println(a);     //10
       //-------------------------------------
        int b =99;
        System.out.println(++b);  //100
        System.out.println(b);

     int c =99;
        System.out.println(c++);   // c yı konsola 99 yazdırır   c=100
        System.out.println(c);     //100






        int x=201;


        System.out.println(--x);   // pre  200

        int y =201;

        System.out.println(y--); //post decrement consola=> 201 y=200
        System.out.println(y);  // 200


        int z=44;

        System.out.println(++z);    //45
        System.out.println(z++);      //45 ama konsola ıkıncı asamada 46 yazıcak
        System.out.println(z);        //46



        int i= 42;
        System.out.println(--i);   //41  i=41  pre decrement
        System.out.println(i--);  // 41  i=40 post decrement















    }
}
