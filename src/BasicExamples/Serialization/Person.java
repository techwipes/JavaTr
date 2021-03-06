package BasicExamples.Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 9008233809921088998L;
    private int id;
    private  String name;


    public Person (int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
