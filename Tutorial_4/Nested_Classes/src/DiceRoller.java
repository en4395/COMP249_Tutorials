public abstract class DiceRoller {
    public enum DiceShape {
        TETRAHEDRON,
        CUBE,
        OCTAHEDRON,
        PENTAGONAL_TRAPEZOHEDRON,
        DODECAHEDRON,
        ICOSAHEDRON
    };
    public final int numberOfFaces;
    public final DiceShape diceShape;
    // Constructor takes a DiceShape and assigns its corresponding value to numberOfFaces
    public DiceRoller(DiceShape diceShape) {
        this.diceShape = diceShape;
        switch(diceShape) {
            case TETRAHEDRON:
                numberOfFaces = 4;
                break;
            case CUBE:
                numberOfFaces = 6;
                break;
            case OCTAHEDRON:
                numberOfFaces = 8;
                break;
            case PENTAGONAL_TRAPEZOHEDRON:
                numberOfFaces = 10;
                break;
            case DODECAHEDRON:
                numberOfFaces = 12;
                break;
            case ICOSAHEDRON:
                numberOfFaces = 20;
                break;
            default:
                numberOfFaces = 25;
        }
    }

    /*
        rollDice() is an abstract method. I'll instantiate DiceRoller as an anonymous inner
        class in BagOfDice; in doing so, I'll have to provide an immediate implementation
        for this abstract method
    */
    public abstract void rollDice();
}
