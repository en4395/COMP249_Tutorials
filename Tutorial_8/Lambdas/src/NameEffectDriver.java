import java.util.Scanner;

public class NameEffectDriver {
    public static void main(String[] args) {

        /*
         * NameEffect has one abstract method declared as
         * String applyEffectToName(String name);
         * In my lambda expression, I gave the parameter
         * "String name" is a temporary parameter name
         * "myName" that I used in my expression/implementation.
         * The arrow points towards the implementation
         */

        // A statement lambda: the right side of the arrow is a block, which is redundant in this case
        NameEffect uppercase = (myName) -> {return myName.toUpperCase();};
        // An expression lamba: the right side of the arrow is an expression and the return is inferred
        NameEffect lowercase = (myName) -> myName.toLowerCase();
        NameEffect shoutName = (myName) -> myName.toUpperCase() + "!";
        NameEffect fancyName = (myName) -> "~*" + myName + "*~";

        Scanner scin = new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name = scin.nextLine();

        System.out.println(uppercase.applyEffectToName(name));
        System.out.println(lowercase.applyEffectToName(name));
        System.out.println(shoutName.applyEffectToName(name));
        System.out.println(fancyName.applyEffectToName(name));
    }
}