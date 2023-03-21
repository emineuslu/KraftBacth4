package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C06_If_İfElse {
    public static void main(String[] args) {
     /*   //A  ve B 2 adet int sayıyı karsılastırın
        // A buyuktur B  den
        // B buyuktur  A  dan
        // A  ve  B  esıttır
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("A buyuktur B den ");

        } else if (a == b) {
            System.out.println("A  ve  B  esıttır");

        } else {
            System.out.println("B  buyktur A  dan");
        } */


      /*  System.out.println("A");
        if(true){
            System.out.println("B");

        }else if(false){
            System.out.println("c");
        }else if(false){
            System.out.println("d");

        }else{
            System.out.println("e");
        }
        System.out.println("f");               //ABF                   */


        //bır program yazın
        ////Bir program yazın eğer x in değeri 10 ise y ye 20 atansın,.

       /* int x=10,y;
        if(x==10){
            y=20;
        }else{
            y=0;
        }
        System.out.println("y = " + y);    // y=20


        //x in değeri 20 ise y ye 30 atansın,
        //x in değeri 30 ise y ye 40 atansın,.
        // değil ise y ye 0 atansın


      /*  int x=25,y=0;
        if(x==10){
            y=20;
        }else if(x==20){
            y=30;
        }else if(x==30){
            y=40;
        }
        System.out.println("y = " + y);
        else{
            System.out.println("x  bulunamadı");
        }*/

        // bır program yazın sıcaklık 20 derece ve ustu ıse  string message;
        // degiskenıne butterfly flies(kelebekler ucar) assing edılsın

     /*   String str;
          int degree=19;
        if(degree>=20){
            str="butterfly flies";
        }else{
              str="";

        }
        System.out.println(str); */

        // wrıte a program Ayse's pocket money lower than 5 liras ,
        // her dad give 10 money

        //aysenın cep harclıgı 5 lıradan az ıse
        //babası ona 10 lıra versın

     /*   int aysePara=3;

        if(aysePara<5){
            aysePara=aysePara+10;

        }
        System.out.println("aysePara = " + aysePara);*/


        //2 numara kabul etsın numaraların esıt olup olmadıgını dondursun

      /*  int x=10;
        int y=10;
        if(x==y){
            System.out.println("sayı esıt");

        }else{
            System.out.println("sayılar esıt degıl");*/



            //buyuk olan olan sayıyı gorsun

          /*  int x=20;
            int y=15;
            if(x>y){
                System.out.println(x);

            }else if(x==y){
                System.out.println("sayılar esıt");
            }else{

                System.out.println(y);*/

        // Write a program a,b,c olmak uzere 3 int degişken declare edelim
        // sırasıyla degerler atayalım.
        // a ve b
        // degişkenın toplamı c den fazla ıse
        // a ve b nın farkını c ye atasın

   /*    int a,b,c;
        a=20;
        b=20;
        c=30;
        if((a+b)>c){
            c=a-b;       //c=Math.abs((a-b));     veya c=Math.max(a,b)-Math.min(a,b);  veya if((a-b)>=0){ c=a-b;
        }       if((a-b)>=0){
            c=a-b;
        }else{
            c=b-a;
            System.out.println(c);

      */
            // 3 addet iç açı  alsın ve bunun ücgen olup olmadıgını kontrol etsın

         /*    int x,y,z;
               x=60;
               y=60;
               z=60;
               if((x+y+z)==180{
            System.out.println("ücgendir");


        }else{
            System.out.println("ücgen degildır");
        }*/
         //bır program yazın 3 acı kabul edın
        // açılardan bırı 90 ise bu bir dik ücgendir mesajı döndürsün

     /*   int a,b,c;
        a=90;
        b=30;
        c=60;
       // if(a+b+c==180 && ((b+c==90)&&a==90)){  veya

        if(x==90||y==90||z==90){
            System.out.println("bu bır ucgendır");
        }else{
            System.out.println("bu bır ucgen degıldır");
        }

        // System.out.println("dık ücgendır");  bu en usttekı ısleme aıt*/

                       // VEYA
       //if((x+y+z==180)  &&  (x==90 || y==90 || z==90)){

            //Ödev

         //Bir program yazın
         // 3 tane numara kabul etsin ve büyük olanı versin.(homework)
         // 2 veya 3 farklı yol ile çözmeye çalışın
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 3 numara giriniz :");
        int num1= scan.nextInt();
        System.out.println("num1 = " + num1);
        int num2= scan.nextInt();
        System.out.println("num2 = " + num2);
        int num3= scan.nextInt();
        System.out.println("num3 = " + num3);

      /*  System.out.println("        1.YOL        " );

        if(num1>num2 && num1>num3){
            System.out.println("En buyuk sayı num1 dir. ");
        }else if(num2>num1 && num2>num3){
            System.out.println("En buyuk sayı num2 dir. ");
        }else if(num3<num1 && num3>num2){
            System.out.println("En buyuk sayı num3 dir. ");*/



      /*  System.out.println("         2.YOL        ");

        int kontrolSayisi =1450;

        if(kontrolSayisi<=num1){
            System.out.println("En buyuk sayı num1 dir. ");

        } else if(kontrolSayisi<=num2){
            System.out.println("En buyuk sayı num2 dir. ");

        }else if(kontrolSayisi<=num3){
            System.out.println("En buyuk sayı num3 dir. ");*/

        System.out.println("        4.YOL       ");

        int n1=num1%1000;
        int n2=num2%1000;
        int n3=num3%1000;
        if(n1 > n2  &&  n1 > n3){
            System.out.println("En buyuk sayı num1 dir. ");
        }
        else if(n2>n1  && n2>n3){
            System.out.println("En buyuk sayı num2 dir. ");
        }
        else if(n3>n1 &&  n3>n2){
            System.out.println("En buyuk sayı num3 dir. ");
        }
       /* System.out.println("       3.YOL       ");

        if(Math.max(num1,num2)==num1 && Math.max(num1,num3)==num1){
            System.out.println("En buyuk sayı num1  dir");

        }else if(Math.max(num2,num1)==num2  &&  Math.max(num2,num3)==num2){

            System.out.println("En buyuk sayı num2  dir");

        }else if(Math.max(num3,num1)==num3  &&  Math.max(num3,num2)==num3){

            System.out.println("En buyuk sayı num3  dir");*/
        }













    }








