public class Main {
    public static void main(String[] args) {

        int result = RecursionTricks.fibonacci(9);
        System.out.println("Result is " + result);

        result = RecursionTricks.factorial(9);
        System.out.println("Result is " + result);

        boolean isPal = RecursionTricks.isPalindrome("wasitacatisaw");
        System.out.println("Word " + (isPal ? "is a palindrome" : "is not a palindrome"));
    }
}