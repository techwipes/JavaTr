package BasicExamples;

public class Lesson19This {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(18);
        h1.setName("Ivan");
        h1.getInfo();
        Human h2 = new Human("Jake");
    }
}


class Human {
    private String name;
    private int age;

    public Human() {
        System.out.println("This is the first constructor");
    }

    public Human(String name) {
        this.name = name;
        System.out.println("This is the second constructor");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is the third constructor");
    }


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

    public void getInfo() {
        System.out.println(name + " : " + age);
    }
}