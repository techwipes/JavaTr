package IPAddr;

import java.io.*;
import java.util.*;

import static IPAddr.PerfomanceTest.bytesToMegabytes;


public class IPAddrCounterArrayList {


    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        ArrayList<String> result = new ArrayList<String>();
        InputStream input = new FileInputStream("./src/IPAddr/IP.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        while (reader.ready()) {
            String s = reader.readLine();
            result.add(s);
        }
        reader.close();
        Collections.sort(result);
        int count = 1;
        for (int i = 0; i < result.size()-1; i++) {
            if (!result.get(i).equals(result.get(i + 1))){
                count++;

            }
        }
        System.out.println(count);

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

        System.out.println("OnlyArrayList");

    }
}