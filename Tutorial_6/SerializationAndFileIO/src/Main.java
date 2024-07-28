import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Computer Science", 2028);

        try {
            // Serializing 'student'
            // Create a file output stream
            FileOutputStream fos = new FileOutputStream("src/Students.txt");
            // Wrap that file output stream in an object output stream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);

            // Deserializing 'student'
            // Create a file intput stream
            FileInputStream fis = new FileInputStream("src/Students.txt");
            // Wrap that file input stream in an object input stream
            ObjectInputStream ois = new ObjectInputStream(fis);
            // Read an instance of Student from the file input stream
            Student deserializedStudent = (Student)ois.readObject();

            deserializedStudent.sayHello();

            oos.close();
            ois.close();
        } catch(IOException e) {
            System.out.println("Encountered an IO exception");
        } catch(ClassNotFoundException e) {
            System.out.println("Could not find class");
        }

    }
}