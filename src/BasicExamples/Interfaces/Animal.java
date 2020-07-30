package BasicExamples.Interfaces;

public class Animal implements Info{
    public int id;

    public void showInfo(){
        System.out.println("Id = " + this.id);
    }

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }
}
