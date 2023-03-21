package day14_NestedWhileDoWhile;

public class C06_WhileLoopIntro {
    public static void main(String[] args) {

        if(true){                                           //  sonuc true ıse bır defa  calısıp yazıyor if de
            System.out.println("hello world");              //  fakat while de true yazınca kodu sonsuza kadar yazdırabılır
        }                                                   // bu yuzden i++ badi {} icine yazıyoruz kı kod
                                                           // sonsuza kadar yazmasın

        System.out.println("---------------------------");

        while(true){
            System.out.println("hello world");   // boyle sonsuza kadar yazıyor hello world
        }

    }
}
