import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        int numToWrite = 254;

        try {
            // Writing to binary file
            OutputStream Stream = new FileOutputStream("src/myFile.bin");
            Stream.write(numToWrite);
            Stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            /*
             * Writing to a text file:
             * BufferedWriter writes a character stream. To write an integer to a file, we must represent
             * it as a string. This string will be broken into characters--each digit of numToWrite will be
             * represented as a character in the text file.
             * */
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("src/myFile.txt"));
            fileWriter.write(Integer.toString(numToWrite));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}