package BasicExamples.ReadingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFileInline {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "./src/BasicExamples/ReadingFiles/exp2.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String var = scanner.nextLine();
        System.out.println(var);

        String[] numbers = var.split(" ");
        System.out.println(Arrays.toString(numbers));
        int counters = 0;

        int[] num = new int[7];
        for(String number : numbers){
            num[counters++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(num));

    }
}
