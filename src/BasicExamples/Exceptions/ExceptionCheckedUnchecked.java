package BasicExamples.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionCheckedUnchecked {
    //Checked exception (Compile time exception) - исключительные случаи в работе программы
    //Unchecked exception (Runtime exception) - ошибка в работе программы
    // (деление на ноль, NullPointerException, OutOfBoundException)

    // Checked

    File file = new File("test");
    Scanner scanner;

    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            ;
        }
    }

    // Unchecked

    int a = 1 / 0;
    String s = null; //   (sout(s))
    int[] b = new int[4];  // sout(b[4])
}
