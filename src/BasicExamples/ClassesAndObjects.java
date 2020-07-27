package BasicExamples;

import java.util.Arrays;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Yog";
        p1.age = 1442;
        Person p2 = new Person();
        p2.name = "Faruh";
        p2.age = 42;

        System.out.println("My name is " + p1.name);
        System.out.println("I am too old");

        int [] loc = {1,2,3};
        for (int l : loc){
            if ( l == 2){
                l += 5;
            }
            System.out.println(l);
        };
        System.out.println(Arrays.toString(loc));
    }
}


class Person{
    String name;
    int age;
}
