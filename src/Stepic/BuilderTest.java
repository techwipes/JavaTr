package Stepic;

public class BuilderTest {

    String color;
    String engine;

    public BuilderTest(String carColor, String carEngine){
        color = carColor;
        engine = carEngine;
    }
}


class Test{
    public static void main(String[] args) {
        BuilderTest car1 = new BuilderTest("yellow", "v4");
        System.out.println(car1.color + " " + car1.engine);
        BuilderTest car2 = new BuilderTest("red", "v6");
        System.out.println(car1.color + " " + car1.engine);
        
    }
}