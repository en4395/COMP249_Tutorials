import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Diary {
    private DiaryEntry latestEntry;
    private File diaryFile;

    public Diary(String fileName) {
        diaryFile = new File(fileName);
    }

    public void addEntry() {
        latestEntry = new DiaryEntry(diaryFile);
    }

    public void readDiary() {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(diaryFile));
            String fileLine;
            while((fileLine = fileReader.readLine()) != null) {
                System.out.println(fileLine);
            }
            fileReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
