package MathBasic;

//simple class that prints prime numbers between [n,m] to the console

public class FindPrime {
    public static void main(String[] args) {
        int n = 2;
        int m = 150;
        outer:
        for (int i = n; i < m; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
