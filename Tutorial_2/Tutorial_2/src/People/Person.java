package People;

import java.util.Random;

public class Person {

    private String name;

    private static final String[] listOfNames = {"Liam", "Sophia", "Raj", "Mia", "Dmitri", "Aisha", "Nia", "Carlos", "Ananya", "Hassan", "Yara", "Zhen", "Ivy", "Omar", "Elsa", "Kai", "Freya", "Amir", "Leila", "Luca", "Zara", "Ethan", "Nina", "Bastian", "Sofia", "Ravi", "Aya", "Ishaan", "Sakura", "David", "Elena", "Niko", "Ines", "Aiden", "Maya", "Jakub", "Mariam", "Oleg", "Hana", "Mateo", "Lina", "Theo", "Rina", "Yusuf", "Clara", "Arjun", "Lia", "Sebastian", "Elena", "Yuki", "Sara", "Dario", "Hannah", "Marek", "Alina", "Hugo", "Laila", "Nico", "Elif", "Lorenzo", "Amara", "Aiden", "Zoe", "Leo", "Kira", "Sami", "Anya", "Rafael", "Leila", "Oscar", "Dalia", "Mateusz", "Svetlana", "Jaxon", "Zoya", "Tomás", "Ona", "Asher", "Eve", "Jia", "Khalid", "Sienna", "Harper", "Kira", "Boris", "Naomi", "Finn", "Maya", "Nadia", "Isaac", "Mira", "Jasper", "Zara", "Giselle", "Yosef", "Sofia", "Roman", "Lena", "Max", "Fiona", "Ezra", "Vera", "Luca", "Holly", "Tariq", "Esra", "Mason", "Lara", "Carmen", "Sage", "Arthur", "Rosa", "Enzo", "Ava", "Rina", "Miles", "Alisa", "Kieran", "Riya", "Derek", "Oriana", "Jules", "Leila", "Silas", "Kali", "Hassan", "Eva", "Maxim", "Alicia", "Sam", "Violet", "Aisha", "Nico", "Naomi", "Elliot", "Luna", "Reza", "Amelia", "Vladimir", "Leah", "Oscar", "Jenna", "Roman", "Harriet", "Aiden", "Kaitlyn", "Briana", "Darius", "Vivian", "Nina", "Oscar", "Serena", "Quinn", "Elisa", "Jaxon", "Kira", "Lena", "Eli", "Layla", "Theo", "Aurelia", "Dante", "Mae", "Nadia", "Seth", "Rhea", "Luis", "Evelyn", "Jace", "Imani", "Paul", "Greta", "Talia", "Marc", "Kiran", "Jasmine", "Ari", "Lillian", "Hugo", "Marina", "Sasha", "Willa", "Andre", "Esme", "Omar", "Roxana", "Derek", "Mabel", "Giovanni", "Leila", "Tariq", "Ada", "Ravi", "Stella", "Axel", "Eve", "Yara", "Graham", "Naya", "Dalia", "Miles", "Ivy", "Emilia", "Sylas", "Claudia", "Quinn", "Oscar", "Jade", "Caleb", "Maya", "Rina", "Felix", "Soraya", "Brenna", "Gustavo", "Maia", "Zane", "Jasmine", "Rafael", "Ariana", "Jasper", "Leah", "Eli", "Lina", "Milo", "Elena", "Derek", "Rina", "Aria", "Luca", "Iman", "Ada", "Nina", "Zane", "Gwen", "Ruben", "Stella", "Mila", "Yusuf", "Anna", "Mateo", "Lila", "Vera", "Maggie", "Simon", "Hera", "Julian", "Eleanor", "Soren", "Nina", "Max", "Rosa", "Leo", "Hannah", "Nadia", "Amira", "Tom", "Lia", "Gwen", "Isla", "Raj", "Bella", "Kiran", "Mariana", "Damon", "Celeste", "Riley", "Evelyn", "Hugo", "Leila", "Elliot", "Ruth", "David", "Ada", "Naomi", "Emilia", "Oscar", "Mara", "Gideon", "Kelsey", "Ali", "Maya", "Kai", "Vivian", "Ralph", "Keira", "Ravi", "Anya", "Eliana", "Fiona", "Hassan", "Blythe", "Rory", "Olivia", "Samir", "Greta", "Diana", "Marek", "Nadia", "Liam", "Jade", "Luka", "Sofia", "Derek", "Lina", "Klaus", "Ruby", "Tariq", "Layla", "Renee", "Holly", "Nico", "Esra", "Finn", "Hannah", "Yara", "Luca", "Aurora", "Kai", "Elena", "Anisa", "Emmet", "Lena", "Felix", "Talia", "Rafael", "Mara", "Elise", "Iris", "Jaxon", "Nina", "Amaya", "Nico", "Mira", "Zach", "Leah", "Tariq", "Elise", "Jasper", "Mira", "Ryan", "Sienna", "Elif", "Noah", "Sasha", "Eva", "Luca", "Sage", "Oscar", "Maya", "Evelyn", "Hana", "Bastian", "Fiona", "Ariana", "Reza", "Lena", "Giselle", "Nadia", "Oscar", "Isabella", "Leo", "Serena", "Kai", "Hannah", "Kiran", "Rina", "Hugo", "Talia", "Elena", "Rina", "Miles", "Jade", "Rina", "Elena", "Jaxon", "Greta", "Riley", "Sofia", "Mateo", "Eli", "Brenna", "Felix", "Carmen", "Yusuf", "Laila", "Asha", "Max", "Aria", "Klaus", "Mae", "Sofia", "Sasha", "Ravi", "Carmen", "Aiden", "Violet", "Brianna", "Kai", "Talia", "Luca", "Aria", "Leah", "Amira", "Jonas", "Riley", "Elena", "Freya", "Nadia", "Aiden", "Ivy", "Miles", "Maya", "Daria", "Tariq", "Clara", "Hugo", "Nina", "Anya", "Gwen", "Harper", "Oscar", "Mila", "Giselle", "Ravi", "Dalia", "Eli", "Daria", "Mila", "Liam", "Zara", "Emilia", "Elias", "Leah", "Gwen", "Finn", "Renee", "Noah", "Amaya", "Zane", "Lina", "Mia", "Jasper", "Nina", "Eve", "Lena", "Roman", "Vivian", "Reza", "Layla", "Hugo", "Amira", "Rosa", "Theo", "Hana", "Rina", "Kiran", "Jade", "Sofia", "Talia", "Luca", "Amaya", "Lila", "Tariq", "Gwen", "Aiden", "Omar", "Ruby", "Eva", "Leah", "Nadia", "Renee", "Kai", "Mia", "Elena", "Aria", "Miles", "Derek", "Hannah", "Mila", "Kira", "Isla", "Riley", "Maya", "Oscar", "Gwen", "Elise", "Theo", "Yara", "Mia", "Ravi", "Elena", "Lena", "Greta", "Nadia", "Oscar", "Yara", "Aidan", "Sage", "Dalia", "Lina", "Mira", "Eli", "Zara", "Kai", "Emilia", "Harper", "Jasper", "Leila", "Sienna", "Renee", "Rina", "Kiran", "Maya", "Oscar"};

    protected static String generateName() {
        Random indexGenerator = new Random();
        return listOfNames[indexGenerator.nextInt(listOfNames.length)];
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this.name = generateName();
    }

    // TODO: Demo how to generate setters and getters in IntelliJ
    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.print("Hello my name is " + name);
    }
}
