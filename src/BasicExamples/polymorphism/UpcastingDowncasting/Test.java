package BasicExamples.polymorphism.UpcastingDowncasting;

public class Test {

    public static void main(String[] args) {


        Dog dog = new Dog();
        //Upcasting
        Animal animal = dog;
        animal.eat();


        //Downcasting
        Dog dog2 = (Dog) animal;
        dog2.bark();
        dog.eat();



    }

}
