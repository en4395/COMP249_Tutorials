public class RecursionTricks {
    public static int fibonacci(int num) {
        // Base case
        if(num < 2)
            return num;

        // Recursive step
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int factorial(int num) {
        // Base case
        if(num <= 1)
            return 1;

        // Recursive step
        return num * factorial(num - 1);
    }

    public static boolean isPalindrome(String string) {
        /*
         * Base case:
         * The substring will be length 0 if the number of characters is even,
         * or 1 if the number of characters is odd
         */
        if(string.length() == 0 || string.length() == 1)
            return true;

        // Recursive step
        if(string.charAt(0) == string.charAt(string.length() - 1)) {
            return isPalindrome(string.substring(1, string.length() - 1));
        }

        return false;
    }
}
