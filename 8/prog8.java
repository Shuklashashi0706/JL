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
