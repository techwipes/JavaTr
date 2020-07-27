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
