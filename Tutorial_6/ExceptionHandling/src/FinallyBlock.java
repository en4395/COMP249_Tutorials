import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int divisor, dividend, quotient, remainder;

        System.out.println("Input a dividend followed by a divisor: ");
        dividend = input.nextInt();
        divisor = input.nextInt();

        try {
            quotient = dividend / divisor;
            remainder = dividend % divisor;
            System.out.println("The quotient is: " + quotient + "\nThe remainder is: " + remainder);
        } catch(ArithmeticException e){
            System.out.println("An arithmetic exception was caught!");
        } finally {
            System.out.println("Finally block executes");
        }
    }
}