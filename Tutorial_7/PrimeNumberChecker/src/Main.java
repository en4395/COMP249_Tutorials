import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        generateRandomNumbers("src/numbers.dat", 200, 1, 1000);
        findPrimesAndWriteToFile("src/numbers.dat", "src/prime.txt");
    }

    // Generate some random numbers and write them into a file
    public static void generateRandomNumbers(String fileName, int count, int min, int max) {
        Random randomNumbers = new Random();
        int numToWrite;

        try {
            // I went with DataOutputStream for its writeInt() method
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));

            for(int i = 0; i < count; i++) {
                // nextInt(arg) returns an integer between 0 and (arg - 1).
                numToWrite = randomNumbers.nextInt(max - min + 1) + min;
                dos.writeInt(numToWrite);
            }

            dos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    // A wrapper method for isPrime
    public static boolean isPrime(int num) {
        if(num > 1)
            return isPrime(num, 2);
        return false;
    }

    public static boolean isPrime(int num, int divisor) {
        /*
         * Base case 1: Dividing the num by itself. The integer passed
         * is only divisible by 1 and itself: it is prime.
         */
        if(divisor == num)
            return true;

        /*
         * Base case 2: The remainder of num / divisor is 0, i.e., num is divisible
         * by "divisor"; it is not prime.
         */
        if(num % divisor == 0)
            return false;

        // Recursive call
        return isPrime(num, divisor + 1);
    }

    public static void findPrimesAndWriteToFile(String inputFile, String outputFile) {
        int currentNum;
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(inputFile));
            // I wanted a human-readable output file, so I opted for FileWriter (a character stream)
            FileWriter fos = new FileWriter(outputFile);

            fos.write("The prime numbers in " + inputFile + " are:\n");
            //  While number of available bytes is greater than 0
            while(dis.available() > 0) {
                currentNum = dis.readInt();
                if(isPrime(currentNum)) {
                    fos.write(currentNum + "\n");
                }
            }

            dis.close();
            fos.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}