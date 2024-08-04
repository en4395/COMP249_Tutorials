package art;

// Generic class
public class Artwork<T > {
    private T artwork;
    private String artist;
    private double value;
    private int year;

    public Artwork(T artwork, String artist, double value, int year) {
        this.artwork = artwork;
        this.artist = artist;
        this.value = value;
        this.year = year;
    }

    public T getArtwork() {
        return artwork;
    }

    public void getArtworkInfo() {
        System.out.println("\n" + artwork);
        System.out.println("By " + artist + " (" + year + ").");
        System.out.println("$" + value);
    }
}
