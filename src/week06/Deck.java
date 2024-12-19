package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//	b.     Deck
//       Fields
//    1.     cards (List of Card)
//    ii.    Methods
//    1.     shuffle (randomizes the order of the cards)
//    2.     draw (removes and returns the top card of the Cards field)
//    3.     In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	
	List<Card> cards = new ArrayList<Card>();
	
	public Deck( ) {
		for(int i = 2; i < 15; i++){
			cards.add(new Card(i, "Hearts"));
			cards.add(new Card(i, "Spades"));
			cards.add(new Card(i, "Diamonds"));
			cards.add(new Card(i, "Clubs"));
		}
		}
		public void shuffle() {
			Collections.shuffle(cards);
		}
		
		public Card draw() {
			return cards.remove(0);
		
	
		
	}
}
