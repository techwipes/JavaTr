package BasicExamples.Interfaces;

public class Test {
    public static void main(String[] args) {

        Animal animal1 = new Animal(4);
        Person one = new Person("Jack");
        animal1.sleep();
        one.sayHello();
        animal1.showInfo();
        one.showInfo();


        Info info1 = new Animal(1);
        Info info2 = new Person("Rocky");
        info1.showInfo();
        info2.showInfo();
        outpootInfo(one);
                }

        public static void outpootInfo(Info info){
        info.showInfo();
        }
    }

