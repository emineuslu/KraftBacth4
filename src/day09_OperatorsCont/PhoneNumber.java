package day09_OperatorsCont;
import java.util.Scanner;
public class PhoneNumber {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country code : ");
        int countryCode = scan.nextInt();
        System.out.println("Please enter your area code ");
        int areaCode = scan.nextInt();
        System.out.println("Please enter your local number ");
        int localNumber = scan.nextInt();


        System.out.println("Your Phone Number İs +"+"(" +countryCode+")"+areaCode+"-"+localNumber);







    }
}
