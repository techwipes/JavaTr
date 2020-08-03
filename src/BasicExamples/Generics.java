package BasicExamples;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //before java 5
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        Animals an = new Animals();
        animals.add(an);

        String animal = (String) animals.get(0);
        System.out.println(animal);

        // Generics after Java 5
        List<String> str = new ArrayList<String>();
        str.add("dog");
        str.add("cat");
        str.add("grog");
        // error str.add(an);
        String str2 = str.get(2);

        //Java 7

        List<String> str3 = new ArrayList<>();
    }
}


class Animals {

}