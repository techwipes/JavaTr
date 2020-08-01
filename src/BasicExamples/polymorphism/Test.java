package BasicExamples.polymorphism;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        testPoly(animal);
        testPoly(dog);
        testPoly(cat);

        Dog dog1 = (Dog)getAnimal(dog);
        dog1.bark();
        dog1.eat();


    }

    public static void testPoly(Animal animal) {
        animal.eat();
    }

    public static Animal getAnimal(Animal animal) {
               return animal;
    }
}
