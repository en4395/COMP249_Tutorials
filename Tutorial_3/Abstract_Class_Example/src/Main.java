import Humans.Human;
import Humans.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bruno", 36);

        Human person2 = new Person("Agnes", 11);

        /* Try instantiating a Human object, you can't! Abstract classes
        cannot be instantiated. This makes sense: they have abstract methods
        so are missing necessary implementation */
        // Human person3 = new Human(34);

        person.celebrateBirthday();
        person.reflectOnLife();
        person.reachMilestone("first grey hair");
        person.seekWisdom();

        person2.celebrateBirthday();
    }
}