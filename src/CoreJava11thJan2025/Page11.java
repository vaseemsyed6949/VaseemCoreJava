package CoreJava11thJan2025;
import java.util.Scanner;


public class Page11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Browser name as Chrome,Firefox,Opera so that i can execute the relevant code");
        String Browser_Input = sc.nextLine();

        switch(Browser_Input.toLowerCase()){
            case "chrome":
                System.out.println("Execute Chrome");
                break;
            case "firefox":
                System.out.println("Execute Firefox");
                break;
            case "opera":
                System.out.println("Execute oper");
                break;
            default:
                System.out.println("enter the valid browser name");


        }

    }
}
