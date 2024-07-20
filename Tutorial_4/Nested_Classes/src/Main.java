public class Main {
    public static void main(String[] args) {

        // Create an object of static inner class
        Student.StudentID studentID= new Student.StudentID();
        studentID.displayStudentID();

        String courses[] = {"COMP249", "THEO202", "ELEC342"};
        float grades[] = {100.0f, 67.0f, 90.0f};
        Student student1 = new Student("Petunia", courses, grades);
        student1.printStudentInfo();

        // Now, a quick example of my two anonymous inner classes!
        BagOfDice ex = new BagOfDice();
        ex.showOffMyDice();
    }

}