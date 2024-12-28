import java.util.Scanner;

public class UserInput {
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String number = scanner.nextLine();
        System.out.println(" Your number is : " + number);
    }
}
