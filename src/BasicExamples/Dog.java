package BasicExamples;

public class Dog extends Animal {
    public void bark(){
        System.out.println("I am barking");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void showName(){
        System.out.println(name);
    }
}
