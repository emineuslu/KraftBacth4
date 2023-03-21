package day17_Methods;

public class C03_Methods {
    public static void main(String[] args) {
        menü();
        System.out.println("program basladı");
        menü();
        System.out.println("program devam edıyor");
        menü();
        System.out.println("program sonlandı");



        System.out.println("program basladı");
         hello();
        System.out.println("program devam edıyor");
        hello();
        System.out.println("program sonlandı");

    }

    public static void hello(){
        System.out.println("Hello Word");     //bu bır metot
        System.out.println("merhaba");
    }

public static void menü(){
    System.out.println("1-para cekme 2-para yatırma 3-bakiye 4-cıkıs");
}



}
