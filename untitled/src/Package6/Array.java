package Package6;

public class Array {
    public static void main(String[] args) {
        // * Array = used to store multiple values in a single variable

        String[] cars = { "BMW" , "Alpine" , "Aston Martin" , "Mercedes"};

        // * To create an array by allocating first the amount of element that we will need then storing the values
        String[] colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";

        for(int i = 0 ; i < cars.length ; i++){
            System.out.println(cars[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        // * 2D array = is an array of arrays
        // String[][] array2D = new String[2][2];
        String[][] array2D ={
                                 {"0" ,"1"} ,
                                 {"3" , "4"}
                            };

        for(int i = 0 ; i< array2D.length ; i++){
            System.out.println();
            for(int j = 0 ; j < array2D[i].length ; j++){
                System.out.println(array2D[i][j]);
            }
        }
    }
}
