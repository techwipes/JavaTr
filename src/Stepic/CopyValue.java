package Stepic;

public class CopyValue {


    public static void valIncr(int a, int b){
        a += 5;
        b += 7;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        int x = 4;
        int z = 10;
        valIncr(x,z);
        System.out.println(x);
        System.out.println(z);
    }
}
