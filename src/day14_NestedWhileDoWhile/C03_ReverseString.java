package day14_NestedWhileDoWhile;

public class C03_ReverseString {
    public static void main(String[] args) {
    /*    String name ="Ali";
       // name.length() kelimenın harflerını sayar Ali--> o12  gibi    0-->A     1--->l    2--->i   gibi

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));


          String str ="teneke";
          //           012345
        System.out.println("str.length()="+str.length());
                                          //  System.out.println(str.charAt(0));
                                         //System.out.println(str.charAt(5));

        for(int i=0;  i<str.length(); i++){
            System.out.println(str.charAt(i));



            //Strıng ı ters cevırıp yazdırcaz

        }

        String str ="teneke";
        //           102345

        String reserved="";
        System.out.println("str.length()="+str.length());
        //  System.out.println(str.charAt(0));
        //System.out.println(str.charAt(5));

        for(int i=0;  i<str.length(); i++){
            System.out.println(str.charAt(i));



            reserved+=str.charAt(5);
            reserved+=str.charAt(4);
            reserved+=str.charAt(3);
            reserved+=str.charAt(2);
            reserved+=str.charAt(1);
            reserved+=str.charAt(0);
            System.out.println(reserved);

            // kısaca for dongusuyle yspıyoruz


                reserved="";
            for(int i=str.length()-1; 0<=i; i--){          //  str.length()-1 demek sebebi  0 ın yerını cıkarmak
                reserved+=str.charAt(i);
            }
            System.out.println(reserved);

        }*/

       // System.out.println("-------------------------");

     /*  for(int i=0; i<=6; i++){
            for(int j=1; j<=6; j++){
                System.out.println("1");        //(i)  koysak  1 12 123 1234 yatay yaza yaza ıner
                System.out.println("12");
                System.out.println("123");
                System.out.println(1234);
                System.out.println(12345);
                System.out.println(123456);
            }
            System.out.println();
        }*/

        System.out.println("----------------------------");

        for(int i=6; 0<=i ; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }





}
    }