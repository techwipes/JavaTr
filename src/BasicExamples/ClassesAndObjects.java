package BasicExamples;

import java.util.Arrays;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Yog";
        p1.age = 1442;
        p1.speak();
        Person p2 = new Person();
        p2.name = "Faruh";
        p2.age = 42;
        p2.speak();




    }
}


class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is " + name + "! I am " + age + " years old!");
    }
}
