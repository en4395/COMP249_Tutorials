import java.util.Random;

public class BagOfDice {
    public void showOffMyDice() {
        Random random = new Random();

        /*
            In one statement, DiceRoller is defined and instantiated. An anonymous inner class
            is used to instantiate an object of a class or interface with an immediate implementation.
            The “anonymous” part of the term refers to the specific instance of the class you create,
            not to the abstract class or interface that it extends or implements.
        */

        // Six-sided dice
        DiceRoller d6 = new DiceRoller(DiceRoller.DiceShape.CUBE) {
            @Override
            public void rollDice() {
                System.out.println("You rolled a " + (random.nextInt(numberOfFaces - 1) + 1) + " on the D6.");
            }
        };
        d6.rollDice();

        // Twenty-sided dice!
        DiceRoller icosahedron = new DiceRoller(DiceRoller.DiceShape.ICOSAHEDRON) {
            @Override
            public void rollDice() {
                System.out.println("You rolled a " + (random.nextInt(numberOfFaces - 1) + 1) + " on the icosahedron.");
            }
        };
        icosahedron.rollDice();
    }
}
