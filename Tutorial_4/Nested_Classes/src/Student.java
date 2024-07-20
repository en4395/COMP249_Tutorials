public class Student {
    private String name;
    private String completedCourses[];
    private float courseGrades[];

    public Student(String name, String[] completedCourses, float[] courseGrades) {
        this.name = name;
        this.completedCourses = completedCourses;
        this.courseGrades = courseGrades;
    }

    // Static inner class
    public static class StudentID
    {
        private String idPhoto;
        private int idNumber;
        private static int ID = 40000000;

        public StudentID()
        {
            idPhoto = "( ͡° ͜ʖ ͡°)";
            idNumber = ID++;
        }
        public void displayStudentID()
        {
            System.out.println("STUDENT PHOTO: " + idPhoto +
                                "\nSTUDENT ID: " + idNumber);
        }
    }

    // Non-Static Inner Class
    public class Course {
        private String courseName;
        private String courseCode;

        public Course(String courseName, String courseCode) {
            this.courseName = courseName;
            this.courseCode = courseCode;
        }

        public void displayCourseDetails() {
            System.out.println(name + " is enrolled in the course: " + courseName);
        }
    }

    // Method containing a local inner class
    public void printStudentGrades() {

        /*
            GradeReport is a local inner class that serves as a temporary structure for grouping and
            printing grades and their corresponding course name. In this example, GradeReport is just
            making this method more difficult to read -_- But in some situations, creating
            a temporary class will allow you to encapsulate a small bit of functionality that you don't
            want floating around elsewhere
        */

        class GradeReport {
            private String course;
            private float grade;

            public GradeReport(String course, float grade) {
                this.course = course;
                this.grade = grade;
            }

            public void displayGradeReport() {
                System.out.println(course + ": Grade: " + grade);
            }
        }

        System.out.println("\nPrinting " + name + "'s Grades:");

        for (int i = 0; i < completedCourses.length; i++) {
            GradeReport report = new GradeReport(completedCourses[i], courseGrades[i]);
            report.displayGradeReport();
        }
    }

    public void printStudentInfo() {
        for(int i = 0; i < 30; i++) {
            System.out.print("*");
        }
        System.out.println("\nNAME: " + name);

        StudentID id = new StudentID();

        id.displayStudentID();

        for(int i = 0; i < 30; i++) {
            System.out.print("*");
        }

        printStudentGrades();
        System.out.println();
    }
}
