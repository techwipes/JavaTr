package MathBasic;

import java.io.*;


/**
 * Серия Фибоначчи - это серия элементов, в которой используются два предыдущих элемента,
 * чтобы получить следующий элемент, начиная с 0 и 1. В этой задаче необходимо написать функцию
 * которая будет генерировать ряд Фибоначчи. Способ реализации любой, главный принцип - чем быстрее тем лучше.
 * Функция которую необходимо написать должна принимать два значения:
 *
 * начальная позиция пооследовательности;
 * конечная позиция пооследовательности. Возвращать функция должна строку с числами последовательности разделенными пробелами.
 */

public class Fibonacci {

    static String fibonacci(int start, int end) {
        String result = "";
        int mainBuffer = 0;
        int buffer1 = 1;
        int buffer2 = 0;

        if (start <= 1 & end >= 1) {
            return "0";
        }

        for (int i = 2; i < end; i++) {
            mainBuffer = (buffer1 + buffer2);
            buffer2 = buffer1;
            buffer1 = mainBuffer;
            if (i >= start) {
                result = result + " " + mainBuffer + " ";
            }

        }


        return result;
    }

    public static void main(String[] args) throws IOException {

        int a = 10;
        int b = 15;
        /*
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter(System.getenv("./src/TxtFiles/output.txt")));
        Scanner scanner = new Scanner(new FileReader(System.getenv("./src/TxtFiles/input.txt")));

        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());


         */

        String result = fibonacci(a, b);
        System.out.println(result);
        //outputWriter.write(result);

        //outputWriter.close();
        //scanner.close();
    }
}