package card_game;
import card_game.*;
import java.util.*;

public class Player {

  private String name;
  private ArrayList<Card>hand = new ArrayList<Card>();

  public Player(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setHand(Card card1, Card card2){
    hand.add(card1);
    hand.add(card2);
  }

  public ArrayList getHand(){
    return hand;
  }

  public String printHand(){
    return hand.toString();
  }

  public boolean isHandBust(){
    if(this.hand.get(0).getNumber() + this.hand.get(1).getNumber() > 21){
      return true;
    }
    return false;
  }

  public int sumHand(){
    return this.hand.get(0).getNumber() + this.hand.get(1).getNumber();
  }

  public void hit(Card card3){
    hand.add(card3);
  }

}