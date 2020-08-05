package IPAddr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public class IPAddrBitSet {
    BitSet map = new BitSet(2^32);
    String[] data = {"1","2","3","4","5","1","3","4","6"};
    int[] data2 = {1,2,3};

}


class IPAddrBitSetTest{
    public static void main(String[] args) {
        BitSet map = new BitSet(2^32);
        String[] data = {"192.168.140.1","255.255.255.254","33.3.3.3","4","5","1","3","4","6"};
        int[] data2 = {1,2,3};

        map.set(Math.abs(data[1].hashCode()));
        System.out.println(Math.abs(data[1].hashCode()));
        System.out.println(map.get(910498947));



    }
}