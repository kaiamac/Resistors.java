/*
 * Kaia Mac
 * takes three colours, separated by hyphens, and prints the value of the 
 * resistor. Use a one-dimensional array for the colours.
 * 03/03/2020
 */

package resistors.java;
import javax.swing.*;
/**
 *
 * @author kamac8665
 */
public class ResistorsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String colours[] = new String[10];
        colours[0] = "black";
        colours[1] = "brown";
        colours[2] = "red";
        colours[3] = "orange";
        colours[4] = "yellow";
        colours[5] = "green";
        colours[6] = "blue";
        colours[7] = "violet";
        colours[8] = "grey";
        colours[9] = "white";

        String resistorColours;
        String colour1, colour2, colour3;
        double res1 = 0.0, res2 = 0.0, res3 = 0.0, resVal;
        int i;

        resistorColours = JOptionPane.showInputDialog("What is your resistors colour code? \n"
                + "Separate each colour by hyphens \n" + "Ex: Red-Orange-Black");

        colour1 = resistorColours.substring(0, resistorColours.indexOf("-"));
        colour2 = resistorColours.substring(resistorColours.indexOf("-") + 1, resistorColours.lastIndexOf("-"));
        colour3 = resistorColours.substring(resistorColours.lastIndexOf("-") + 1);

        for (i = 0; i < 10; i++) {
            if (colour1.equalsIgnoreCase(colours[i])) {
                res1 = i;
            }
            if (colour2.equalsIgnoreCase(colours[i])) {
                res2 = i;
            }
            if (colour3.equalsIgnoreCase(colours[i])) {
                res3 = i;
            }
        }

        resVal = (((res1 * 10) + res2) * Math.pow(10, res3));
        System.out.println("You entered " + resistorColours);
        System.out.println("The value of the resistor is " + resVal + " ohms");
    }
}
