package BasicExamples.Enum;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal){
            case CAT:
                System.out.println("It s a cat");
                break;
            case DOG:
                System.out.println("It s a dog");
                break;
            case FROG:
                System.out.println("It s a frog");
                break;
        }
    }
}
