package day12_SwitchCase;

public class C01_Summery {
    public static void main(String[] args) {
        System.out.println("A");
        if(true){
            System.out.println("B");
        }
        System.out.println("C");   // ABC

        System.out.println("-----------------");

        System.out.println("X");
        if(false){
            System.out.println("Y");

        }else if(true){
            System.out.println("Z");
        }else if(true){
            System.out.println("T");
        }
        System.out.println("W");                     //  xzw






    }
}
