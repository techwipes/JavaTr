public class ArrayOfStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] exam = new String[3];
        exam[0] = "Lorem";
        exam[1] = "ipsum";
        exam[2] = "Dolor sit amet";
        for (String ex : exam) {
            System.out.println(ex);
        }

        int[] nums = {1, 2, 3};
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        System.out.println(sum);

        int value = 0;
        String s = null;
        System.out.println(s);
    }
}
