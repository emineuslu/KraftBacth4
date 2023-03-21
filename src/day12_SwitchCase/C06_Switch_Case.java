package day12_SwitchCase;

public class C06_Switch_Case {
    public static void main(String[] args) {
        // byte  short  int  String  char tipindeki karsılastırmak ıcın kullanılır.

       /* System.out.println("giris");
        int sayi = 1;

        switch (sayi) {
            case 1:
                System.out.println("sayı; 1 e esit");
                break;
            case 2:
                System.out.println("sayi 2 ye esit");
            case 3:
                System.out.println("sayi 3 e esit");
                break;
            default:
                System.out.println("sayi eslemedi");

        }
        System.out.println("sayı eslesemedı"); */


        System.out.println("giris");
        String str = "Balon";

        switch (str) {
            case "kalem":
                System.out.println("kalem");
                break;
            case "silgi":
                System.out.println("silgi");
            case "balon":
                System.out.println("balon");
                break;
            default:
                System.out.println("balon buyuk harli olmadindan eşleşemedi");

        }

    }
}
