package People;

import java.time.Year;

public class Student extends Person{
    private String major;
    private int graduationYear;

    public Student(String name, String major, int graduationYear) {
        super(name);
        this.major = major;
        this.graduationYear = graduationYear;
    }

    public Student(String major, int graduationYear) {
        super(Person.generateName());
        this.major = major;
        this.graduationYear = graduationYear;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(", I'm a " + major + " student, and I graduate in " + (graduationYear - Year.now().getValue()) + " years.");
    }
}
