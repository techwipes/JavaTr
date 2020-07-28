package Games.SeaBattle;

import java.util.ArrayList;

/**
 * contains the names and locations of ships, checks the user's move for hitting

*/


public class DotCom {

    private ArrayList <String> locationCells;
    private String name;

    public  void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void setName(String n){
        name = n;
    }

    public String getName() {
        return name;
    }

    public String checkYourSelf(String userInput){
        String result = "Miss!";
        int index = locationCells.indexOf(userInput);
        if ( index >=0){
            locationCells.remove(index);

            if ( locationCells.isEmpty()){
                result = "Destroyed!";
                System.out.println("Wow! You sunk the ship: "  + name);
            }
            else{
                result = "Hit!";
            }
        }
        return result;
    }


}
