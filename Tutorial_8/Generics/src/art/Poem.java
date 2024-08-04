package art;

public class Poem {
    private String poemTitle;
    private String poem;

    public Poem(String poemTitle, String poem) {
        this.poemTitle = poemTitle;
        this.poem = poem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 50; i++) {
            sb.append("*");
        }

        sb.append("\n\t\t\t" + poemTitle + "\n");

        for(int i = 0; i < 50; i++) {
            sb.append("*");
        }

        sb.append("\n" + poem + "\n");

        for(int i = 0; i < 50; i++) {
            sb.append("*");
        }

        return sb.toString();
    }
}
