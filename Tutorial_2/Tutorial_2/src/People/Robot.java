package People;

public class Robot {
    public enum RobotType {
        ROBOT_THERAPIST,
        ROBOT_FRIEND,
        ROBOT_LOVER,
        ROBOT_DOG,
        ROBOT_CHEF,
        ROBOT_RECEPTIONIST
    }

    private final RobotType robotType;
    private final String name;

    public Robot(RobotType robotType) {
        this.robotType = robotType;
        this.name = Person.generateName();
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name + " and I will be your " + robotType);
    }
}
