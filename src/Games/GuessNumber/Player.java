package Games.GuessNumber;

public class Player {
    int number = 0; // keep player's number
    public void  guess(){
        number = (int)(Math.random() * 10);
        System.out.println("I guess this number is " + number);
    }
}
