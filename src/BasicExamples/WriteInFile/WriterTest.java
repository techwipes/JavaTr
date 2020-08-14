package BasicExamples.WriteInFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterTest {
    public static void main(String[] args) {
        File file = new File("./data/test.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("first string");
            pw.println("second string");
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}


