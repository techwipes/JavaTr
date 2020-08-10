package BasicExamples.Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Except_2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner((System.in));
        while (true) {
            System.out.println("Enter 0");
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                throw new ScannerException("It s not a zero");

            }
        }
    }
}
