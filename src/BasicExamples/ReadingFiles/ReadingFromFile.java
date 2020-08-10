package BasicExamples.ReadingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "./src/BasicExamples/ReadingFiles/exp.txt";
        File file = new File(path);
        Scanner scaner = new Scanner(file);
        while(scaner.hasNextLine()){
            System.out.println(scaner.nextLine());
        }
        scaner.close();
    }
}
