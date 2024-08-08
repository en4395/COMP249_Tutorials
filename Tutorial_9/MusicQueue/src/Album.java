import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artistName;
    private int numberofTracks;
    private LinkedList<Song> songs;
    private int yearReleased;

    public Album(String albumName, int numberofTracks, int yearReleased) {
        this.albumName = albumName;
        this.numberofTracks = numberofTracks;
        this.yearReleased = yearReleased;

        artistName = Song.generateRandomArtistName();

        songs = new LinkedList<>();
        String songName;
        for(int i = 0; i < numberofTracks; i++) {
            songName = Song.generateRandomSongName();
            songs.add(new Song(songName, artistName));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Album: " + albumName + '\n');

        for(int i = 0; i < songs.size(); i++) {
            sb.append((i + 1) + ". " + songs.get(i) + "\n");
        }

        sb.append("\nReleased in " + yearReleased + '\n');

        return sb.toString();
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public String albumDetails() {
        return albumName + " by " + artistName;
    }
}
