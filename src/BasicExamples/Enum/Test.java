package BasicExamples.Enum;

public class Test {
    public static void main(String[] args) {

      // Methods
        Season season = Season.AUTUMN;
        System.out.println(season.name());   // return name of enum constant
        Animal animal = Animal.CAT;
        System.out.println(animal.name());   //  return name of enum constant

        Animal frog = Animal.valueOf("FROG");  // String => Object enum
        System.out.println(frog.getTranslation());

        System.out.println(frog.ordinal());   // get index of object in enum


    /*

     Basic

        Animal animal = Animal.CAT;
        animal.getTranslation();
        System.out.println(animal);

        Season season = Season.WINTER;
        System.out.println(season.getTemperature());


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


        switch (season){
            case SUMMER:
                System.out.println("It s warm outside");
                break;
            case WINTER:
                System.out.println("It s cold outside");
                break;
        }

     */
    }


}
