public class DigitalPetDriver {

    public static void main(String[] args) {

        /*
         * This statement lambda provides an implementation for the perform()
         * method that prints a string and changes the state of the pet object
         * passed.
        */
        PetAction strokePet = (pet) -> {
            System.out.println("Purrr purrr");
            pet.setHappiness(10);
        };

        DigitalPet fluffy = new DigitalPet(DigitalPet.PetType.IGUANA, "Fluffy");

        // Print Fluffy's initial state
        System.out.println(fluffy);
        strokePet.perform(fluffy);
        // Print Fluffy's updated state
        System.out.println(fluffy);

        // Now let's change this instance of PetAction to perform a different action
        strokePet = (pet) -> pet.setEnergy(10); // This time, I went for an expression lambda
        strokePet.perform(fluffy);
        // Print Fluffy's updated state
        System.out.println(fluffy);
    }
}
