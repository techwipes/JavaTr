package MathBasic;

public class BubbleSorting {
    public static void main(String[] args) {
        double[] example = {1, 3, 4, 7, 9, 33, 77, 21, 52, 89};
        for (int i = 0; i < example.length; i++) {
            for (int j = 0; j < example.length - i - 1; j++){
                if(example[j]> example[j+1]){
                    double temp = example[j];
                    example[j] = example [j+1];
                    example[j+1] = temp;
                }
            }
        }
    for ( int i = 0; i < example.length; i++) {
        System.out.println(example[i]);
    }

    }
}
