import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("You are born");
                break;
            case 7:
                System.out.println("You are going to school");
                break;
            case 18:
                System.out.println("You are student");
                break;
            default:
                System.out.println("I have no idea");
        }
    }
}
