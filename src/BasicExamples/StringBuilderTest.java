package BasicExamples;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1.toString());
        // sb1.append(" my");
        // sb1.append(" friend");
        sb1.append(" my").append(" friend");
        System.out.println(sb1);

        String test1 = "123";
        System.out.printf("String %15s \n", test1);
        // %s -string  %d - digit  %f - floating point number
        // \n - next line

        System.out.printf("String %15f \n", 1423.523);
        System.out.printf("String %-15d \n", 10000);
        System.out.printf("String %15d \n", 10000);

        System.out.printf("String %.2f \n", 1423.523);
        System.out.printf("String %.1f \n", 1423.523);

        // % [10]-width  [.2]- n numbers after .


    }
}
