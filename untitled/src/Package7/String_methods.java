package Package7;

public class String_methods {
    public static void main(String[] args) {
        // * String = a reference data type that can store one or more characters
        // *            reference date types have access to useful methods

        String name = "AA";
        // NOTE : boolean method
        // NOTE : equals(" ... ") or equalsIgnoreCase(" ... ")
        boolean result = name.equals("AA");
        System.out.println(result);
        result = name.equalsIgnoreCase("aa");
        System.out.println(result);
        // NOTE : isEmpty()
        result = name.isEmpty();
        System.out.println(result);
        // ***************************
        // NOTE : int method
        // NOTE : length
        int l = name.length();
        System.out.println(l);
        // NOTE : indexOf(index);
        l = name.indexOf("a");
        System.out.println(l);
        // ***************************
        // NOTE : Char method
        // NOTE : charAt(index)
        char c = name.charAt(0);
        System.out.println(c);
        // ***************************
        // NOTE : String method
        // NOTE : toUpperCase() or toLowerCase()
        String s = name.toLowerCase();
        System.out.println(s);
        // NOTE : trim() to remove all the empty space before and after the character
        // NOTE : replace(Oldchar , NewChar)
    }
}
