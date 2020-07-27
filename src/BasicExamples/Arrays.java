public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int[] number2 = {1, 23, 33};
        System.out.println(java.util.Arrays.toString(number2));
    }
}
