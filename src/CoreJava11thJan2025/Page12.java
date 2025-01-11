package CoreJava11thJan2025;
import java.util.Scanner;

public class Page12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any word i will return its Vowel/Consonent");

        char User_Input = sc.next().toCharArray()[0];
        System.out.println("In this 1t Letter is " + User_Input);

        switch (User_Input){
            case 'a':
                System.out.println("Its Vowel");
                break;
            case 'e':
                System.out.println("Its Vowel");
                break;
            case 'i':
                System.out.println("Its Vowel");
                break;
            case 'o':
                System.out.println("Its Vowel");
                break;
            case 'u':
                System.out.println("Its Vowel");
                break;
            default:
                System.out.println("Its Consonent");
                break;


        }
    }
}
