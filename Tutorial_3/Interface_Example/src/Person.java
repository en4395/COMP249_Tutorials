/* Person implements the Human interface. When I entered the "implements" keyword,
* I was immediately warned by my IDE that "Class 'Person' must either be declared abstract
* or implement abstract methods in 'Human'".*/

public class Person implements Human {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void celebrateBirthday() {
        System.out.println(name + " just turned " + ++age);
    }

    @Override
    public void reachMilestone(String milestone) {
        System.out.println(name + " reached a new milestone: " + milestone);
    }

    @Override
    public void feelExistentialDread() {
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
