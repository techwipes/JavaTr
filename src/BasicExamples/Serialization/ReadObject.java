package BasicExamples.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./data/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            /*
            Считывание объектов из массива
            int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }
            */

            // Десериализация массива
            Person [] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

            ois.close();


        } catch (FileNotFoundException e) {
            System.out.println("File person.bin not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class Person not found");
        }
    }
}
