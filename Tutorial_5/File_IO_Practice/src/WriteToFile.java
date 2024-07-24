import java.io.*;

public class WriteToFile {

    public static void main(String[] args) {
        // Let's try reading from one file and writing its contents
        // into another file.
        File myFile = new File("src/myFile.txt");
        File myOtherFile = new File("src/myOtherFile.txt");

        try {
            // "input" will read a stream of data (one byte at a time) from myFile
            // and "output" will write that stream of data into myOtherFile
            FileInputStream input = new FileInputStream(myFile);
            FileOutputStream output = new FileOutputStream(myOtherFile);

            int next;
            // input.read() will return -1 when it reaches the end of the file
            while((next = input.read()) != -1) {
                output.write(next);
            }
 
            input.close();
            output.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
