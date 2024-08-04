public class DigitalPet {
    public enum PetType {
        CAT,
        DOG,
        IGUANA,
        RAT
    }

    public DigitalPet(PetType petType, String name) {
        this.petType = petType;
        this.name = name;
        health = 5;
        happiness = 5;
        energy = 5;
    }

    private PetType petType;
    private String name;
    private int health;
    private int happiness;
    private int energy;

    @Override
    public String toString() {
        return "DigitalPet{" +
                "petType=" + petType +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", happiness=" + happiness +
                ", energy=" + energy +
                '}';
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
