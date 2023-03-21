package day14_NestedWhileDoWhile;

public class C08_LookPractices {
    public static void main(String[] args) {
        // 1 den 10 kadar sayılar
        for (int i=1; i<=10;  i++){                                     //for loop
            System.out.println(i);
        }

        System.out.println("-----------------------------");

        int j=1;
        while(j<=10){
            System.out.println(j);                                          // while
            j++;
        }
        System.out.println("-----------------------------");

        int k=1;
        do{
            System.out.println(k);                                       // Do while
            k++;
        }while(k<=10);




    }
}
