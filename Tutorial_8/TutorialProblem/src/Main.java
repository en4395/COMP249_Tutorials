public class Main {
    public static void main(String[] args) {

        IntOperation<Boolean> isPrime = (num) -> {
            if(num < 2) {
                return false;
            }

            for(int i = 2; i < num; i++) {
                if(num % i == 0)
                    return false;
            }
            return true;
        };

        IntOperation<String> toBinary = (num) -> {
            if(num == 0) {
                return "0";
            }

            StringBuilder sb = new StringBuilder();

            int currentNum = num;
            while(currentNum > 0) {
                if(currentNum % 2 == 1) {
                    sb.append("1");
                }
                else {
                    sb.append("0");
                }
                currentNum /= 2;
            }

            sb.reverse();
            return sb.toString();
        };

        IntOperation<Integer> factorial = (num) -> {
            if(num < 0) {
                System.out.println("Factorial of a negative integer does not exist. Returning -1");
                return -1;
            }

            if(num > 16) {
                System.out.println("This number is too large! Factorial cannot be stored as an Integer.");
                return -1;
            }

            int result = 1;

            for(int i = 1; i <= num; i++) {
                result *= i;
            }

            return result;
        };

        // Print all prime numbers from 1 to 49
        for(int i = 1; i < 50; i ++) {
            if(isPrime.apply(i))
                System.out.println(i + " is a prime number");
        }

        // Print binary conversion of numbers 1 to 49
        for(int i = 1; i < 50; i ++) {
            System.out.println(i + " in binary is: " + toBinary.apply(i));
        }

        // Print factorials for numbers 1 to 15
        for(int i = 1; i < 16; i ++) {
            System.out.println(i + "! is: " + factorial.apply(i));
        }
    }
}