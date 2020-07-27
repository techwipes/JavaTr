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
        one.SetName("Hella");
        DotCom two = new DotCom();
        two.SetName("BlackBear");
        DotCom three = new DotCom();
        three.SetName("SaintJade");

        System.out.println("Your target - destroy 3 ships");
        System.out.println(one.name + " " two.name + " " + three.name );
        System.out.println("Try to do it fast, Good luck!");

        for (DotCom dotComToSet : dotComList){
            ArrayList <String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
    }

    ;

    public void startPlaying() {
        while (dotComList.isEmpty() != true) {
            checkUserGuess("UserGuess");
        }
    }

    ;

    public String checkUserGuess(String UserGuess) {
        numOfGuesses++;
        String result = "Miss";
        for (DotCom:
             dotComList) {
             DotCom.checkYourself();

            return result;
        }
    }

    ;


}







}
