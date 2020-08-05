package IPAddr;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static IPAddr.PerfomanceTest.bytesToMegabytes;

public class IPAddrCounterHashMap {

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        Map<String, Integer> result = new HashMap<>();

        InputStream input = new FileInputStream("./src/IPAddr/IP.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        int count = 0;
        while (reader.ready()) {
            String s = reader.readLine();
            result.put(s, 1);

        }
        reader.close();


        System.out.println(result.size());

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

        System.out.println("OnlyHashMap");

    }
}

