package IPAddr;

import java.io.*;
import java.util.BitSet;

import static IPAddr.PerfomanceTest.bytesToMegabytes;


public class IPAddrBitSet {
    public static void main(String[] args) throws IOException {
        // переменная для замера времени
        long startTime = System.currentTimeMillis();

        /**
         * Заводим две битовые карты,  каждая содержит 2147483648 ячеек
         *  В mapPoz будем помещать Ip с положительным значением hashcode
         *  В mapNeg будем помещать Ip с отрицательным значением hashcode
         *  Диапазон int от -2147483648 до 2147483647 , уникальных значений IPv4 2^32 4294967296
         *  Так как конструктор битовой карты принимает int и индексация начинается с нуля, в одну карту не получиться поместить все значения адресов.
         *
         *
         */


        BitSet mapPoz = new BitSet(2 ^ 31);
        BitSet mapNeg = new BitSet(2 ^ 31);

        // Считываем строчку из файла, получаем её hashcode,  и смотрим в какую карту поместить


        String path = "D:\\trrnts\\ip_addresses\\ip_addresses.txt";
        //String path = "./src/IPAddr/IP.txt";
        InputStream input = new FileInputStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));


        while (reader.ready()) {

            int bitMask = 32;
            String s = reader.readLine();
            int value = s.hashCode();

            if (value < 0) {
                value = BitMask.flipBit(value, bitMask);

                if (mapNeg.get(value)) {
                    continue;
                } else {
                    mapNeg.set(value);
                }

            } else {
                if (mapPoz.get(value)) {
                    continue;
                } else {
                    mapPoz.set(value);
                }
            }
        }
            reader.close();

            // выводим  кол-во  уникальных адресов
            System.out.println(mapNeg.cardinality() + mapPoz.cardinality());

            // Get the Java runtime
            Runtime runtime = Runtime.getRuntime();
            // Run the garbage collector
            //runtime.gc();

            // Calculate the used memory
            long memory = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("Used memory is bytes: " + memory);
            System.out.println("Used memory is megabytes: "
                    + bytesToMegabytes(memory));


            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println(elapsedTime / 1000 + "sec");


    }
}