/* This interface, Human, declares a set of behaviours and attributes that will
* apply to all humans. These methods are declared but not implemented, they are
* abstract.
*
* All the methods in this interface example are abstract. But I can also declare and
* implement concrete "default" methods. These are public methods that can be inherited
* by implementing classes. Interfaces can also declare and implement static methods.
*
* So, when should I use an interface? (I discussed this with ChatGPT!)
* - When defining contracts that multiple classes can implement.
* - When you want to define a common set of methods that can be implemented by any class,
*   regardless of where it sits in the class hierarchy.
* - When implementing for “can-do” relationships (e.g., Dog can be a Pet).
* - If you need multiple inheritance (e.g., a class implementing multiple interfaces). */

public interface Human {
    String SPECIES = "Homo Sapien";  // This field is implicitly static and final!

    /* Notice that I'm not using access specifiers for these methods. In an interface,
    * abstract methods are implicitly public. */
    void celebrateBirthday();
    void reachMilestone(String milestone);
    void feelExistentialDread();
    void seekWisdom();
    void reflectOnLife();
}
