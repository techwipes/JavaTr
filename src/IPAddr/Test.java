package IPAddr;

import java.io.*;
import java.util.*;

import static IPAddr.PerfomanceTest.bytesToMegabytes;

public class Test {


    public static void main(String[] args) throws IOException {
        String s = "192.168.140.111";
        System.out.println(s.hashCode());

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