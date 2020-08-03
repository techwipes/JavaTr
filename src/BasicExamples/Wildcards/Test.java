package BasicExamples.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> lisoOfAnimals = new ArrayList<>();
        lisoOfAnimals.add(new Animal(4));
        lisoOfAnimals.add(new Animal(7));
        test(lisoOfAnimals);

        List <Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
            animal.eat();
        }
    }

    /*            sample of Wildcard
    < ? extends Animal>             <? super Animal>
    Object -                             Object +
    Animal +                             Animal +
     Dog   +                              Dog   -

     */


}
