package card_game;

import card_game.*;
import java.util.*;

public class WinChecker {

  public String winningHand(Player hand1, Player hand2){
    if(hand1.sumHand() > hand2.sumHand()){
      return "Player1";
    }
    return "Player2";
  }

  // public String winner(){
  // return "The Winner is " + winningHand();
  // }
}