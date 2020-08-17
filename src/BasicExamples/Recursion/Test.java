package BasicExamples.Recursion;

public class Test {
    public static void main(String[] args) {
        //counter(3);
        System.out.println(Factorial.factorial(4));
        //factorial(4)
        // 4 * factorial(3)
        // 3 * factorial(2)
        // 2 * factorial(1)




        System.out.println(Factorial.factorial(0));

    }

    // counter(3) => sout(3) => counter(2) => sout(2) => counter(1) => sout(1) => counter(0) => return

    private  static void counter(int n){
        if ( n == 0)
            return;

        System.out.println(n);
        counter(n - 1);
    }

}
