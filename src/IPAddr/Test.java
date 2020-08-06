package IPAddr;

import java.io.*;
import java.util.*;


public class Test {


    public static void main(String[] args) throws IOException {

        BitSet mapPoz = new BitSet(2 ^ 31);
        BitSet mapNeg = new BitSet(2 ^ 31);

        String path = "D:\\trrnts\\ip_addresses\\ip_addresses.txt";
        //String path = "./src/IPAddr/IP.txt";
        InputStream input = new FileInputStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        int bitIndexMask = 32;
        while (reader.ready()) {
            String s = reader.readLine();
            int value = s.hashCode();
            if (value < 0) {
                value = BitMask.flipBit(value, bitIndexMask);

                if (mapNeg.get(value)) {
                    continue;
                } else {
                    mapNeg.set(value);
                }
            }
            else if (mapPoz.get(s.hashCode())) {
                continue;
            } else {
                mapPoz.set(s.hashCode());
            }
        }

        reader.close();
        System.out.println(mapNeg.cardinality() + mapPoz.cardinality());
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