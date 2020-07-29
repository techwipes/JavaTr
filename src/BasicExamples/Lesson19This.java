package BasicExamples;

public class Lesson19This {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(18);
        h1.setName("Ivan");
        h1.getInfo();
        Human h2 = new Human("Jake");

        Human.description = "some info";
        Human.getDescription();

        h1.getDescription();

    }
}


class Human {
    private String name;
    private int age;
    public static String description;

    public Human() {
        System.out.println("This is the first constructor");
        this.age = 0;
        this.name = "default";
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

    public static void getDescription() {
        System.out.println(description);
    }

    public static void printAllFields(){
        System.out.println(description);
        System.out.println();
    }
}