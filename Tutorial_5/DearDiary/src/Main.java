public class Main {
    public static void main(String[] args) {
        Diary myDiary = new Diary("src/diary.txt");

        // Prompt for 3 entries
        for(int i = 0; i < 3; i++) {
            myDiary.addEntry();
        }

        // Read diary from file and print on console
        myDiary.readDiary();
    }
}