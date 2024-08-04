import art.Artwork;
import art.Painting;
import art.Poem;

public class Main {
    public static void main(String[] args) {
        Painting myCatPainting = new Painting(Painting.PaintingType.CAT_PAINTING);
        Painting myApplePainting = new Painting(Painting.PaintingType.APPLE_PAINTING);

        Poem myPoem = new Poem(
                "Whispers of the Twilight",
                "In twilight’s tender, golden gleam,  \n" +
                "Where shadows blend and daylight dreams,  \n" +
                "The sky adorns a soft embrace,  \n" +
                "And stars unveil their secret grace.\n" +
                "\n" +
                "The breeze whispers through ancient trees,  \n" +
                "In melodies that tease the leaves,  \n" +
                "A symphony of dusk’s delight,  \n" +
                "As day surrenders to the night.\n" +
                "\n" +
                "The moon ascends, a silver sail,  \n" +
                "On whispered winds, on gentle trails,  \n" +
                "Its light a brush of tranquil hues,  \n" +
                "To paint the world in midnight blues.\n" +
                "\n" +
                "In this serene and fleeting hour,  \n" +
                "Where dreams take flight and moments flower,  \n" +
                "The heart finds solace in the deep,  \n" +
                "In twilight’s calm, where secrets sleep.");

        Artwork<Painting> painting = new Artwork<>(myCatPainting, "Unknown", 1050, 2022);
        painting.getArtworkInfo();

        /*
         * Note that I can't now change the type that I've specified for this artwork. If I enter:
         * painting = new Artwork<Poem>(myPoem, "ChatGPT", 3.99, 2024);
         * then I'll get an error, because the type of paiting is Artwork<Painting>. But I can reassign it
         * a new object of type Artwork<Painting>
         */
        painting = new Artwork<>(myApplePainting, "Unknown", 3000, 2018);
        painting.getArtworkInfo();

        Artwork<Poem> poem = new Artwork<>(myPoem, "ChatGPT", 3.99, 2024);
        poem.getArtworkInfo();

       printArray(new String[] {"Hello", "Hello"});
       printArray(new Integer[] {1, 3, 7, 11});
       printArray(new Character[] {'e', 'a', 'd', 'g', 'b', 'e'});
    }

    // Generic method, this one isn't a very creative example
    public static <T> void printArray(T[] arr) {
        System.out.println("Printing your array...");

        // For each element of type T in array arr, print that element
        for(T element : arr) {
            System.out.println(element);
        }
    }
}