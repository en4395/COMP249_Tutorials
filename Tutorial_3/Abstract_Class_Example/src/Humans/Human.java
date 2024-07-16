package Humans;
/* Unlike the Humans interface example, the Human abstract class can have a constructor,
* can include protected abstract methods, can have fields (whereas an interface may only have
* static final fields) */

public abstract class Human {
    /* I have moved this age variable into the Human class to demonstrate that an abstract class,
    unlike an interface, can have constructors and private fields. */
    protected int age;

    public Human(int age) {
        this.age = age;
    }

    public abstract void celebrateBirthday();
    public abstract void reachMilestone(String milestone);
    protected abstract void feelExistentialDread(); // I set this to protected for demonstration purposes!
    public abstract void seekWisdom();
    public abstract void reflectOnLife();
}
