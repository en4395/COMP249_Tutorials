import People.Baby;
import People.Person;
import People.Robot;
import People.Student;

public class Main {
    public static void main(String[] args) {

        // generateName() is a protected static method in People.Person. What happens if we call it
        // from Main?
        // String generatedName = Person.generateName();

        // Create and initialise two students. One is stored as a Person, the other is stored as a Student
        Person studentPerson = new Student("Ella", "Computer Engineering", 2026);
        Student otherStudent = new Student("Fibre Arts", 2028);

        // Create and initialise an array of robots
        Robot[] myRobots = new Robot[3];
        myRobots[0] = new Robot(Robot.RobotType.ROBOT_FRIEND);
        myRobots[1] = new Robot(Robot.RobotType.ROBOT_LOVER);
        myRobots[2] = new Robot(Robot.RobotType.ROBOT_THERAPIST);

        // Create and initialise a Baby, store it as a Person object
        Person babyPerson = new Baby(8.5f);

        // Everyone introduces themselves

        // studentPerson is stored as a Person... Will they use the sayHello() method defined in
        // Person, or will they introduce themself as a Student?
        studentPerson.sayHello();

        otherStudent.sayHello();

        for(Robot robot : myRobots) {
            robot.sayHello();
        }

        babyPerson.sayHello();
        ((Baby) babyPerson).cry();  // Because babyPerson is stored as a Person, we need
                                    // to specify that we want to treat that Person as a
                                    // Baby object and allow them to cry

        // Polymorphism! Our babyPerson grows up at runtime
        babyPerson = new Student(babyPerson.getName(), "Political Science", 2040);
        babyPerson.sayHello();

        // Now that babyPerson is all grown up, can they still cry like a Baby?
        //((Baby) babyPerson).cry();
    }
}