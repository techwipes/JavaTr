package IPAddr;



public class BitMask {
    public static int flipBit(int value, int bitIndex) {
        return value ^ 1 << bitIndex - 1;
    }
}


class testBitMask{
    public static void main(String[] args) {
        System.out.println(BitMask.flipBit(-1019678402,32));
    }
}