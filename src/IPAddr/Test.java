package IPAddr;

import java.io.*;
import java.util.*;

import static IPAddr.PerfomanceTest.bytesToMegabytes;

public class Test {


    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        //ArrayList<String> result = new ArrayList<String>();
        InputStream input = new FileInputStream("./src/IPAddr/IP.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        Map<String, Integer> duplicateCount = new HashMap<>();
        int value = 0;
        while (reader.ready()) {
            String s = reader.readLine();
            if (duplicateCount.containsKey(s)) {
                continue;
            } else
                duplicateCount.put(s, duplicateCount.get(s));
        }

        System.out.println(duplicateCount.size());



    // Get the Java runtime
    Runtime runtime = Runtime.getRuntime();
    // Run the garbage collector
        runtime.gc();

    // Calculate the used memory
    long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: "+memory);
        System.out.println("Used memory is megabytes: "
                +

    bytesToMegabytes(memory));

    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);


}
}

/*
class LinearCounter1 {
    BitSet mask = new BitSet(m) // m is a design parameter

    void add(value) {
        int position = hash(value) // map the value to the range 0..m
        mask.set(position) // sets a bit in the mask to 1
    }
}

class LogLogCounter1 {
    int H;           // H is a design parameter
    int m = 2^32;         // k is a design parameter
    etype[] estimators = new etype[m] // etype is a design parameter

    void add(String value) {
         int hashedValue = hash(value)
        int bucket = getBits(hashedValue, 0, k)
        estimators[bucket] = max(
                estimators[bucket],
                rank( getBits(hashedValue, k, H) )
        )
    }

    getBits(value, int start, int end)
    rank(value)
}


 */