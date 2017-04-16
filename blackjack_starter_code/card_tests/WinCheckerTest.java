import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WinCheckerTest {
  WinChecker winChecker;
  Player player1;
  Player player2;
  Card card1;
  Card card2;
  Card card3;
  Card card4;
  Card card5;
  Game game;

  @Before
  public void before(){
    game = new Game();
    winChecker = new WinChecker();
    player1 = new Player("Ian");
    player2 = new Player("Nicola");
    
    card1 = new Card(2, Suit.Hearts);
    card2 = new Card(5, Suit.Hearts);
    card3 = new Card(10, Suit.Clubs);
    card4 = new Card(13, Suit.Diamonds);
    card5 = new Card(3, Suit.Spades);
    game.addPlayer(player1);
    game.addPlayer(player2);
    player1.setHand(card1, card2);
    player2.setHand(card3, card4);
    player1.hit(card5);
    

  }

  @Test
  public void playerHasName(){
    assertEquals("Ian", player1.getName());
    assertEquals("Nicola", player2.getName());
  }

  @Test
  public void playerHasCards(){
    assertEquals("Two of Hearts, Five of Hearts", player1.printHand());
    assertEquals("Ten of Clubs, King of Diamonds", player2.printHand());
  }

  @Test
  public void testSumHand(){
    assertEquals(7, player1.sumHand());
    assertEquals(23, player2.sumHand());
  }

  @Test
  public void testWinningHand(){
    assertEquals("Player2 is Bust! Player1 wins!", winChecker.winningHand(player1, player2));
  }

  @Test 
  public void testPlayerCount(){
    assertEquals(2, game.playerCount());
  }

  @Test
  public void testPlayerTwoIsBust(){
    assertEquals("Player2 is Bust! Player1 wins!", winChecker.winningHand(player1, player2));
  }

  @Test
  public void testPlayerHitACard(){
    
    assertEquals("Two of Hearts, Five of Hearts", player1.printHand());
  }

}

// @Test 
// public void testAllPlayersScores(){
//   assertEquals(3, winChecker.arraySizeOfAllPlayersFinalScore());
// }