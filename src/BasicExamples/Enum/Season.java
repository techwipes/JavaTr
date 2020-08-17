package BasicExamples.Enum;

public enum Season {
    SUMMER (35), WINTER( -25), AUTUMN(4), SPRING(10);
    private int temperature;

    Season (int temperature){
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
