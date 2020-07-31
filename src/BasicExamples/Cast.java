package BasicExamples;

public class Cast {

    public static void main(String[] args) {
        int x = 24; // 32 bits or 4 bytes
        short z = 123; // 16 bits or 2 bytes
        long y = 14423123123123L; //64 bits or 8 bytes
        float f = 123.2f; // 32 bits or 4 bytes
        x = (int) y;

        
        //  incorrect  - boolean b = (boolean) 1;
        //  incorrect  - byte b1 = (byte) false;


        System.out.println(x);
        System.out.println(y);


    }
}
