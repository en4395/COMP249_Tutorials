package Humans;

public class Person extends Human {
    private String name;

    public Person(String name, int age) {
        super(age); // Call superclass' constructor
        this.name = name;
    }
    @Override
    public void celebrateBirthday() {
        System.out.println(name + " just turned " + ++age);
        feelExistentialDread();
    }

    @Override
    public void reachMilestone(String milestone) {
        System.out.println(name + " reached a new milestone: " + milestone);
    }

    @Override
    protected void feelExistentialDread() {
        System.out.println(name + " is experiencing existential dread...");
    }

    @Override
    public void seekWisdom() {
        System.out.println(name + " is seeking wisdom");
    }

    @Override
    public void reflectOnLife() {
        System.out.println(name + " is reflecting on " + age + " years of life");
    }
}
