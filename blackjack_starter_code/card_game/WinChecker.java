package card_game;

import card_game.*;
import java.util.*;

public class WinChecker {

  private ArrayList<Integer> allScores = new ArrayList<Integer>();
  private ArrayList<Player> players = new ArrayList<Player>();

  public String winningHand(Player hand1, Player hand2){
    if(hand1.isHandBust() == true)
      return "Player1 is Bust! Player2 wins!";
    if(hand2.isHandBust() == true)
      return "Player2 is Bust! Player1 wins!";
    if(hand1.sumHand() > hand2.sumHand()){
      return "Player1 Wins!";
    }
    return "Player2 Wins!";
  }

}

// public void arrayOfAllPlayersFinalScore(){
//   for (Player player : players){
//     allScores.add(player.sumHand());
//   }
// }

// public int arraySizeOfAllPlayersFinalScore(){
//   arrayOfAllPlayersFinalScore();
//   return allScores.size();
// }

