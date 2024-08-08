import java.util.LinkedList;

public class MusicQueue {
    private LinkedList<Song> songQueue;

    public MusicQueue() {
        songQueue = new LinkedList<>();
    }

    private void playNext(Song song) {
        songQueue.add(song);
        System.out.println("Added " + song + " to queue");
    }

    /*
     * addAll(Collection<? extends E> c):
     * Inserts all of the elements in the specified collection into this list,
     * starting at the specified position.
     */
    private void playAlbumNext(Album album) {
        songQueue.addAll(album.getSongs());
        System.out.println("Added " + album.albumDetails() + " to queue");
    }

    private void playSong() {
        if(!songQueue.isEmpty()) {
            Song currentSong = songQueue.removeFirst();
            System.out.println("\u266APlaying " + currentSong + '\u266A');
        }
        else {
            System.out.println("Song queue is empty.");
        }
    }

    private void playNow(Song song) {
        songQueue.clear();
        System.out.println("\nCleared the song queue.\n" +
                "\u266APlaying " + song + '\u266A');
    }

    private void playAlbumNow(Album album) {
        songQueue.clear();
        songQueue.addAll(album.getSongs());
        System.out.println("\nCleared the song queue and added " + album.albumDetails());
        playSong();
    }

    private void printQueue() {
        if(!songQueue.isEmpty()) {
            System.out.println("\nPrinting song queue: ");
            for(Song song : songQueue) {
                System.out.println(song);
            }
        }
        else {
            System.out.println("Song queue is empty");
        }
    }

    public static void main(String[] args) {
        MusicQueue musicQueue = new MusicQueue();

        /*
         * Add 5 songs to the queue. Song's default constructor
         * generates a random song and artist name
         */
        for(int i = 0; i < 5; i++) {
            musicQueue.playNext(new Song());
        }

        // Print the state of the queue
        musicQueue.printQueue();

        // Play some songs
        musicQueue.playSong();
        musicQueue.playSong();
        musicQueue.playSong();

        // Print the state of the queue
        musicQueue.printQueue();

        Album myAlbum = new Album("Demos", 10, 2001);

        musicQueue.playAlbumNext(myAlbum);

        // Print the state of the queue
        musicQueue.printQueue();

        // Play some songs
        musicQueue.playSong();
        musicQueue.playSong();
        musicQueue.playSong();

        // Play a song now (clears the rest of the queue)
        musicQueue.playNow(new Song());
        musicQueue.printQueue();
    }
}