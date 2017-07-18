//Eric Guan, 1/20/15, 3rd Period
import java.util.*;
public class StandardDeck
{

   ArrayList<Card> deck = new ArrayList<Card>(52);

	/*Pre-condition: none
	 *Post-condition: An ArrayList of objects of type Card will be created
	*/
   public StandardDeck()
   {
      buildDeck();
   }

	/*Pre-condition: none
	 *Post-condition: A new ArrayList of cards will be created with 52 cards.  
	 *There will be 4 suits with 13 cards each.
	*/
   public void buildDeck()
   {
      for(int i =0;i<4;i++)
      {
         for(int j=0;j<=12;j++)
         {
            deck.add(new Card(j, i));
         }
      }
   
   }
   /*Pre-condition: none
	 *Post-condition: The first card in the ArrayList of cards will be removed and
	 *it will also actually be returned
	*/
   public Card removeFirstCard()
   {
      Card c = deck.get(0);
      deck.remove(0);
      return c;
   }
	
	
	/*Pre-condition: None.
	 *Post-condition: The ArrayList of cards will be randomly shuffled.
	*/ 
   public void shuffleDeck()
   {
   
      for(int k = 0;k<deck.size(); k++)
      {
         int first = (int)(Math.random() * (k+1));
         Card temp = deck.get(k);
         deck.set(k, deck.get(first));
         deck.set(first, temp);
      }
   }

	/*Pre-condition: none
	 *Post-condition: The number of cards in the ArrayList deck will be returned.
	*/
   public int numberOfCards()
   {
      return deck.size();
   }

	/*Pre-condition: v >= 0 && v <= 12 AND s >= 0 && s<=3
	 *Post-condition: A new card will be added to the ArrayList deck if the card is
	 *not already present in the deck, but if there is already a similar card in the
	 *deck, nothing will happen.
	*/
   public void addCard(int v, int s)
   {
      Card a = new Card(v, s);
      for(int k=0;k<deck.size();k++)
      {
         if(deck.get(k).equals(a))
         {
            break;
         }
         else
         {
            deck.add(a);
            break;
         }
      }
   }	
	/*Pre-condition: none
	 *Post-condition: The number of cards will be printed on the screen, as well as
	 *the details of each card(including its value and suit).
	*/
   public String toString()
   {
      System.out.println("Elements of deck");
      for(Card c: deck)
      {
         System.out.println(c);
      }
      return "";
   }
	/*Pre-condition: none
	 *Post-condition: The ArrayList of cards will be reset so that there is one card of each
	 *suit and value. This new ArrayList will also be shuffled.
	*/
   public void reset()
   {
      for(int k = deck.size()-1; k>=0;k--)
      {
         deck.remove(k);
      }
      for(int i =0;i<4;i++)
      {
         for(int j=0;j<=12;j++)
         {
            deck.add(new Card(j, i));
         }
      }
   }
	
	
	
   public static void main(String [] args)
   {
   
      StandardDeck s = new StandardDeck();
   
      System.out.println ("Num of cards: " + s.numberOfCards());
   
      System.out.println("******** First card is: " + s.removeFirstCard()); 
   	
      System.out.println ("After removing the first card. Num of cards: " + s.numberOfCards());
      s.addCard(0, 0); 
      System.out.println ("After adding new Card (0,0). Size of deck: " + s.numberOfCards());
    
      System.out.println ("**************************************************************");
      s.shuffleDeck(); 
      System.out.println("After shuffling.  Num of cards: " +  s.numberOfCards()); 
      System.out.println("The shuffled deck:  =======================>");
      System.out.println(s); 
   	
      s.reset(); 
      System.out.println("The reset deck:  =======================>");
      System.out.println(s); 
      System.out.println("Number of cards AFTER reset: " + s.numberOfCards()); 	
   	
   
   	
      Card c = new Card(12, 0);
      Hand h =new Hand();  
      Hand h2 = new Hand(c); 
      h.addCard(12, 3); // adding a card to h
      System.out.println(h);
      System.out.println(h2);
      System.out.println(h.numberOfCards()); // should return 1
      System.out.println(h.getCard(0) + "\n" + h2.getCard(0)); // should return Ace of Spades and Ace of Clubs
      System.out.println(h.ifSameValue(12) + "\n" + h.ifSameSuit(3)); // true true
      System.out.println(h2.ifSameValue(3) + "\n" + h2.ifSameSuit(3)); // false false
      h.removeCard(0); // removes card
      System.out.println(h2); // tests toString method
   
   
   } // end of main
	
} // class


/****
 ----jGRASP exec: java StandardDeck
 
 Num of cards: 52
 ******** First card is: 2 of Clubs
 After removing the first card. Num of cards: 51
 After adding new Card (0,0). Size of deck: 52
 **************************************************************
 After shuffling.  Num of cards: 52
 The shuffled deck:  =======================>
 Elements of deck
 8 of Diamonds
 8 of Clubs
 5 of Diamonds
 4 of Clubs
 King of Spades
 9 of Clubs
 10 of Hearts
 Queen of Hearts
 3 of Hearts
 6 of Spades
 3 of Clubs
 4 of Spades
 King of Hearts
 2 of Hearts
 Jack of Diamonds
 Ace of Diamonds
 2 of Diamonds
 Jack of Spades
 Jack of Clubs
 7 of Diamonds
 9 of Diamonds
 Ace of Hearts
 6 of Diamonds
 Ace of Clubs
 4 of Hearts
 5 of Hearts
 8 of Spades
 5 of Clubs
 3 of Spades
 Queen of Diamonds
 6 of Clubs
 Ace of Spades
 7 of Clubs
 2 of Clubs
 9 of Spades
 King of Diamonds
 7 of Hearts
 8 of Hearts
 5 of Spades
 3 of Diamonds
 9 of Hearts
 Queen of Clubs
 Queen of Spades
 Jack of Hearts
 4 of Diamonds
 10 of Clubs
 6 of Hearts
 King of Clubs
 2 of Spades
 10 of Spades
 10 of Diamonds
 7 of Spades
 
 The reset deck:  =======================>
 Elements of deck
 2 of Clubs
 3 of Clubs
 4 of Clubs
 5 of Clubs
 6 of Clubs
 7 of Clubs
 8 of Clubs
 9 of Clubs
 10 of Clubs
 Jack of Clubs
 Queen of Clubs
 King of Clubs
 Ace of Clubs
 2 of Diamonds
 3 of Diamonds
 4 of Diamonds
 5 of Diamonds
 6 of Diamonds
 7 of Diamonds
 8 of Diamonds
 9 of Diamonds
 10 of Diamonds
 Jack of Diamonds
 Queen of Diamonds
 King of Diamonds
 Ace of Diamonds
 2 of Hearts
 3 of Hearts
 4 of Hearts
 5 of Hearts
 6 of Hearts
 7 of Hearts
 8 of Hearts
 9 of Hearts
 10 of Hearts
 Jack of Hearts
 Queen of Hearts
 King of Hearts
 Ace of Hearts
 2 of Spades
 3 of Spades
 4 of Spades
 5 of Spades
 6 of Spades
 7 of Spades
 8 of Spades
 9 of Spades
 10 of Spades
 Jack of Spades
 Queen of Spades
 King of Spades
 Ace of Spades
 
 Number of cards AFTER reset: 52
 Ace of Spades
 
 Ace of Clubs
 
 1
 Ace of Spades
 Ace of Clubs
 true
 true
 false
 false
 Ace of Clubs
 
 
  ----jGRASP: operation complete.

****/