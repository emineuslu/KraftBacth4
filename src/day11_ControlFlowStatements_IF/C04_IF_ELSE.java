package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C04_IF_ELSE {
    public static void main(String[] args) {

        //fizik kimya ve matematik notlarını konsoldan alsın
        //ortalama 80 üzerinde ise geçti yazsın
        // 80 ve altında ise kaldınız yazsın


        Scanner scan=new Scanner(System.in);
        System.out.println("FİZİK :");
        double f= scan.nextDouble();
        System.out.println("KİMYA :");
        double k=scan.nextDouble();
        System.out.println("MATEMATİK :");
        double m=scan.nextDouble();

        double ort= (f+k+m)/3;

        if (ort > 80) {
            System.out.println("gectınız");


        } else{
            System.out.println("kaldınız");




}

    }
}
