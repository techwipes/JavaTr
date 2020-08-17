package BasicExamples.Enum;

public enum Animal {
    DOG("dog"), CAT("cat"), FROG("frog");

    private String translation;

    Animal(String translation){
        this.translation = translation;

    }

    public String getTranslation(){
        System.out.println(translation);
        return translation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
