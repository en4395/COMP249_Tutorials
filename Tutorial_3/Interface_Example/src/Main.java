public class Main {
    public static void main(String[] args) {
        System.out.println("Printing the Human interface's static field: " + Human.SPECIES);

        Person person = new Person("Bruno", 36);
        person.celebrateBirthday();
        person.reflectOnLife();
        person.feelExistentialDread();
        person.reachMilestone("first grey hair");
        person.seekWisdom();
    }
}