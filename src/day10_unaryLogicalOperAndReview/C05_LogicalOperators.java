package day10_unaryLogicalOperAndReview;

public class C05_LogicalOperators {

    public static void main(String[] args) {

      /*  String name ="Ayse";
        int age =34;
        String citizen= "turkey";  // stringlerin esıtliginı == opreratoru ıle kontrol etmeyız!!!!!!!

        //18+ , turkish

        boolean isEligibleVote = age>=18 && citizen == "turkey";

                                  34>18= && "turkey=="turkey"
                                   true         true
        System.out.println(name+" is eligible to vote :" +isEligibleVote);  */

      String name2= "Umit";
      int findexScore =800;
      int age2=43;
      int income =40000;

      boolean isEligibleForLoan= findexScore>=1500 &&  age2>=18  &&   income>30000;

        System.out.println(name2+ " is eligible for  loan :  "+isEligibleForLoan);
        System.out.println("---------------------------------");

        String name3 = "Hatıce";
        int age3 = 21;
        char gender ='F';  // Female Male

        boolean isEligible =age3 >=18 && (gender =='M'  ||  gender== 'F');

 //                               true     &&        (false ||  true)

   //                                   true   &&     true
   //                                          true


       System.out.println(name3+ " isEligible to be selected as MP:  " +isEligible);

        System.out.println("-----------------");

        String student = "Ali";
        int familyIncome=15000;
        double gpa = 2.5;
        boolean isEligibleForScholarship = gpa >=3.5 ||  familyIncome <=20000;
 //                                              2.5>=3.5 || 15000<==20000
   //                                              false      ||      true
     //                                                    true

            boolean result =true;
        System.out.println("result = " + result);

        boolean result1=!result;    //false

        System.out.println("result1 = " + result1);







        int score= 55;
        boolean passed =score>=60;      //false

        boolean failed =!passed;         //true

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
