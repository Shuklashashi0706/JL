// 8.Write a java program to read two positive 
// integers and perform the division operation on them and display 
// the result if a user enters a positive integer and non-zero denominator.
//  Else, If the input is negative or the denominator is zero, generate negative
//   number input and divide by zero exception to handle the scenario.

import java.util.Scanner;

public class prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter numerator");
            double num = sc.nextDouble();

            System.out.println("Enter denominator");
            double deno = sc.nextDouble();

            if (num < 0 || deno < 0) {
                throw new IllegalArgumentException("Negative number not allowed");
            }
            if (deno == 0) {
                throw new ArithmeticException("Denominator is zero");
            }
            double result = num / deno;

            System.out.println("The result is " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
