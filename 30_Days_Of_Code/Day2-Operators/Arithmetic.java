// Verdict : Accepted
// OJ	   : Hackerrank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tempCost = mealCost;
        tempCost += mealCost * (tipPercent / 100.0);
        tempCost += mealCost * (taxPercent / 100.0);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(tempCost);
      
        // Print your result
        System.out.format("The total meal cost is %d dollars.\n", totalCost);
    }
}