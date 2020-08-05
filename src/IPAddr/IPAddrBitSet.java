package IPAddr;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

import static IPAddr.PerfomanceTest.bytesToMegabytes;

public class IPAddrBitSet {
    BitSet map = new BitSet(2 ^ 32);
    String[] data = {"1", "2", "3", "4", "5", "1", "3", "4", "6"};
    int[] data2 = {1, 2, 3};

}


class IPAddrBitSetTest {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        BitSet bMap = new BitSet((2 ^ 32));

        InputStream input = new FileInputStream("D:\\trrnts\\ip_addresses\\ip_addresses.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        try {


        while (reader.ready()) {
            String s = reader.readLine();
            if (bMap.get(Math.abs(s.hashCode())))
            {
                continue;
            }
            else{

                bMap.set(Math.abs(s.hashCode()));
            }
        }
        reader.close();
        }
        catch (IndexOutOfBoundsException i){
            System.out.println(bMap.cardinality());

        }


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
        System.out.println(elapsedTime/1000 + "sec");

        System.out.println(bMap.cardinality());
    }
}