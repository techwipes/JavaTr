package BasicExamples.polymorphism;

public class Test {

    public static void main(String[] args) {
       Animal animal = new Animal();
       Dog dog = new Dog();
       Cat cat = new Cat();

       testPoly(animal);
       testPoly(dog);
       testPoly(cat);



    }

    public static void testPoly(Animal animal){
        animal.eat();
    }
}
