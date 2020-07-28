package Games.SeaBattle;


import java.util.ArrayList;

/**
 * Creating objects DotCom, Getting user "turn"
 */

public class DotComBust {

    GameHelper helper = new GameHelper();
    ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // creating and placing ships
        DotCom one = new DotCom();
        one.setName("Hella");
        DotCom two = new DotCom();
        two.setName("BlackBear");
        DotCom three = new DotCom();
        three.setName("SaintJade");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your target - destroy 3 ships");
        System.out.println(one.getName() + " " + two.getName() + " " + three.getName());
        System.out.println("Try to do it fast, Good luck!");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

        private void startPlaying(){
            while (!dotComList.isEmpty()) {
                String userGuess = helper.getUserInput("Make a move!");
                checkUserGuess(userGuess);
            }
            finishGame();
        }


        private void checkUserGuess (String UserGuess){
            numOfGuesses++;
            String result = "Miss";
            for (DotCom DotComToTest : dotComList) {
                result = DotComToTest.checkYourSelf(UserGuess);
                if (result.equals("Hit!")){
                    break;
                }
                if (result.equals("Destroyed!")){
                    dotComList.remove(DotComToTest);
                    break;
                }
            }
            System.out.println(result);

        }

        private void finishGame(){
            System.out.println("You have sunk all the ships!");

            if( numOfGuesses <= 18){
                System.out.println("It took only: " + numOfGuesses + "turns");
                System.out.println("Not bad!");
            }
            else {
                System.out.println("It took : " + numOfGuesses + "turns");
                System.out.println("Train your accuracy!");
            }
        }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }


}
