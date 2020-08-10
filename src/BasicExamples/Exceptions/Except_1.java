package BasicExamples.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Except_1 {
    public static void main(String[] args) {
        File file = new File("adad");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println("After Scanner");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        System.out.println("After try/catch");
    }
}
