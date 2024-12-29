package Package1;

public class Introduction {
    public static void main(String[] args) {
        // To print a text we can use System.out.println or System.out.print
        System.out.println("Hello, World!");
        System.out.print("Hii\n");

        int x ; // declaration
        x = 12; // assignement
        int y = 3; // initialization

        System.out.println(x);
        System.out.println(x + y);

        System.out.println("x = " +x);
        System.out.println("x = " +x+ "\t y = " +y);

        char c = '@';
        boolean b=true;
        double d = 3.14;
        float f = 2.1f;
        System.out.println(c + " \t" + b + " \t" + d + " \t" + f);

        // For stringss we should write it with capital letter S because it's a reference, every ref start with capital letter

        String s = "Aya";
        System.out.println(s);

        // Package1.Swap file
        Swap.swap();

        UserInput.userInput();

    }
}

