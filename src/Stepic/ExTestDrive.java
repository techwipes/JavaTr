package Stepic;


public class ExTestDrive {

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if("yes".equals(t)){
            throw new MyEx();
        }
    }


    public static void main(String[] args) {
        String test = args[0];
        System.out.print("t");
        try {
            doRisky(test);
            System.out.print("r");
            System.out.print("o");
            System.out.print("w");

        } catch (MyEx myEx) {
            System.out.print("a");
            System.out.print("w");
        }finally {
            System.out.println("s");
        }

    }
}


class MyEx extends Exception{}