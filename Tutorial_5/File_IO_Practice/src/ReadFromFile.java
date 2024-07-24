import java.io.*;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {

        // Creating a File object
        File myFile = new File("src/myFile.txt");

        // Trying out some methods from the File class
        System.out.println("myFile can be found here: " + myFile.getAbsolutePath());
        System.out.println(myFile.canRead() ? "myFile can be read" : "myFile cannot be read");

        try {
            // Scanner approach to reading a line of a file
            Scanner fileScanner = new Scanner(myFile);

            while(fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();

            // BufferedReader approach to reading a line of a file
            String nextLine;
            BufferedReader fileReader = new BufferedReader(new FileReader(myFile));

            while ((nextLine = fileReader.readLine()) != null) {
                System.out.println(nextLine);
            }
            fileReader.close();

        } catch(IOException ioException) {
            // Catching an IOException will also catch subclasses of IOException
            // Such as FileNotFoundException, EndOfStreamException, DirectoryNotFoundException,...
            // I opted for this superclass to catch several types of exceptions, but if I'm
            // only concerned with one of those Exception subclasses, then it doesn't make
            // sense to catch a general IOException. To be discussed next week
            ioException.printStackTrace();
        }

        // Another approach: reading within a method that throws an exception
        try {
            readFirstLineOfFile(myFile);
        } catch(FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public static void readFirstLineOfFile(File file) throws FileNotFoundException {
        Scanner myScanner = new Scanner(file);
        if(myScanner.hasNext()) {
            System.out.println(myScanner.nextLine());
        }
        myScanner.close();
    }
}