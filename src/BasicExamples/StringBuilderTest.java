package BasicExamples;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1.toString());
       // sb1.append(" my");
       // sb1.append(" friend");
        sb1.append(" my").append(" friend");
        System.out.println(sb1);

    }
}
