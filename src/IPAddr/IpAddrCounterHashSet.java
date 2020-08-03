package IPAddr;

import java.io.*;
import java.util.HashSet;
import static IPAddr.PerfomanceTest.bytesToMegabytes;



public class IpAddrCounterHashSet {


    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        HashSet<String> result = new HashSet<>();
        BufferedReader reader = new BufferedReader(new FileReader("./src/IPAddr/IP.txt"));
        while (reader.ready()) {
            String s = reader.readLine();
            result.add(s);
        }
        System.out.println(result.size());
        reader.close();

        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();

        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: "
                + bytesToMegabytes(memory));


        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);

        }
    }


