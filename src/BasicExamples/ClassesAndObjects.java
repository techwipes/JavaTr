package BasicExamples;

import java.util.Arrays;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Yog");
        p1.setAge(1442);
        p1.speak();
        Person p2 = new Person();
        p2.setName("Faruh");
        p2.setAge(42);
        p2.speak();

    }
}


class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    void speak(){
        System.out.println("My name is " + name + "! I am " + age + " years old!");
    }
}
