package BasicExamples.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person( 1 ,"Bob");
        Person person2 = new Person( 2 ,"Mike");
        Person[] people = {new Person( 1 ,"Bob"),new Person( 2 ,"Mike"),new Person( 3 ,"Den")};

        try {
            FileOutputStream fos = new FileOutputStream("./data/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            /*
            Пример сериализации объектов из массива
            oos.writeInt(people.length);
            for(Person person : people){
                oos.writeObject(person);
            }
            */

            // Сериализаци целого массива

            oos.writeObject(people);

            oos.close();

        } catch (FileNotFoundException e) {
            System.out.println("File people.bin not found");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
