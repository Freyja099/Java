package Package2;

import javax.swing.*;

// * GUI : Graphical user interface
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name"); // * To right your name in the panel
        JOptionPane.showMessageDialog(null, "Hello "+name);  // * To display your name

        // * To use the showInputDialog with an integer we can't use it directly instead we have to put it inside a method called parseInt()
        // * the parseInt convert what's inside into an integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null , name + " is " + age + " years old");

        // * For a double variable we should be using a parseDouble

        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your salary"));
        JOptionPane.showMessageDialog(null , name + " has " + salary + " $");
    }

}
