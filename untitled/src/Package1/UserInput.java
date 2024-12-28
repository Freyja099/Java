package Package1;

import java.util.Scanner;

public class UserInput {
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();     // nextline() is used to read Strings
        System.out.println(" Your name is : " + name);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();         // nextInt() is used to read integer
        System.out.println(" Your age is : " + age);

        // ! using nextLine() after nextInt() might not work properly since it's going to read the \n inside
        // ! the scanner and skip the input process that's why it is better to use an empty nextLine() before using the nexline() we want

        // * the empty nextLine
        scanner.nextLine();

        System.out.println("Please enter your last name : ");
        String lastName = scanner.nextLine();
        System.out.println(" Your last name is : " + lastName);

        System.out.println(name + " " + lastName + " " + age + "years old");
    }
}
