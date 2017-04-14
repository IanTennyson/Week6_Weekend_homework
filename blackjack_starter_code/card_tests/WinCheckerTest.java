import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WinCheckerTest {

  Player player1;
  Player player2;
  Card card1;
  Card card2;
  Card card3;
  Card card4;


  @Before
  public void before(){
    player1 = new Player("Ian");
    player2 = new Player("Nicola");
    card1 = new Card(2, Suit.Hearts);
    card2 = new Card(5, Suit.Hearts);
    card3 = new Card(10, Suit.Clubs);
    card4 = new Card(10, Suit.Diamonds);
    player1.setHand(card1, card2);
    player2.setHand(card3, card4);
  }

  @Test
  public void playerHasName(){
    assertEquals("Ian", player1.getName());
  }

  @Test
  public void playerHasCards(){
    assertEquals("Two of Hearts, Five of Hearts", player1.printHand());
    assertEquals("Ten of Clubs, Ten of Diamonds", player2.printHand());
  }

  @Test
  public void testSumHand(){
    assertEquals(7, player1.sumHand());
    assertEquals(20, player2.sumHand());
  }

  @Test
  public void testWinningHand(){
    
  }


  

}