package IPAddr;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import static IPAddr.PerfomanceTest.bytesToMegabytes;

public class IPAddrSortedArrayListToHashSet {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        ArrayList<String> result = new ArrayList<>();
        InputStream input = new FileInputStream("./src/IPAddr/IP.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        while (reader.ready()) {
            String s = reader.readLine();
            result.add(s);
        }
        Collections.sort(result);
        HashSet<String> finishedArray = new HashSet<>();
        for (String res : result) {
            finishedArray.add(res);
        }

        System.out.println(finishedArray.size());
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
        System.out.println("sortedArrayList -> HashSet");

    }
}