import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class DiaryEntry implements Serializable {
    private Date date;
    private int moodScore;
    private String diaryEntry;

    public DiaryEntry(File diaryFile) {
        date = new Date();
        moodScore = getUserMoodScore();
        diaryEntry = getUserDiaryEntry();

        try {
            writeToDiary(diaryFile);
        } catch(IOException e) {
            System.out.println("File could not be opened");
            e.printStackTrace();
        }
    }

    private String getUserDiaryEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a diary entry for today: ");
        diaryEntry = scanner.nextLine();
        return diaryEntry;
    }

    private int getUserMoodScore() {
        int moodScore;
        Scanner consoleReader = new Scanner(System.in);

        System.out.println("Enter a mood score for today (on a scale of 0-10): ");
        moodScore = consoleReader.nextInt();
        while(moodScore < 0 || moodScore > 10) {
            System.out.println("Your mood score should be on a scale of 0-10. Enter a mood score for today (on a scale of 0-10): ");
            moodScore = consoleReader.nextInt();
        }

        return moodScore;
    }

    private void writeToDiary(File diary) throws IOException {
        File myFile = new File("src/");
        myFile.createNewFile();

        FileWriter fileWriter = new FileWriter(diary, true);
        fileWriter.write("DATE: " + date.toString() +
                "\nMOOD SCORE: " + moodScore  + "/10" +
                "\nDIARY ENTRY: " + diaryEntry + "\n");
        fileWriter.close();
    }
}
