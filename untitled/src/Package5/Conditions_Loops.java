package Package5;

import java.util.Scanner;

public class Conditions_Loops {
    public static void main(String[] args){
        // * if statement = performs a block of code if it's condition evaluates to be true

        int age = 18;
        if(age >= 18)
            System.out.println(" You are an adult");

        else
            System.out.println(" You are not an adult");

        // * Switches = Statement  that allows a variable to be tested for equality against  a list of value

        int month = 3;
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("another month");
        }

        // * Logical operators = used to connect two or more expressions
        // * && and ; || or ; ! not

        // * While loop = executes a block of code as long as it's conditions remains true

        int k = 0;
        Scanner scanner = new Scanner(System.in);
        while (k >= 0)
        {
            System.out.println("Enter a negative integer");
            k = scanner.nextInt();
        }

        // * The difference between do while and while is that while loop always check the condition first
        // * and then proceed to the block of code inside, the do loop always executes the block of code once
        // * then check the condition


        // * for loop = executes a block of code a limited amount of time
        for(int i = 0 ; i <= 10 ; i++)
        {
            System.out.println(i);
        }

        // * Nested loops = a loop inside of a loop

        int rows , columns ;
        String symbol = " * ";

        System.out.println("Enter the number of rows and columns ");
        rows = scanner.nextInt();
        columns = scanner.nextInt();

        // * the outer loop will be in charge of the rows and the inner loop for the columns

        for (int i = 1 ; i <= rows ; i++){
            System.out.println();
            for (int j = 1 ; j <= columns ; j++){
                System.out.print(symbol); // ! use here print not println
            }
        }

    }
}
