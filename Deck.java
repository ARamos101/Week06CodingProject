package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<Card>();
	
	Deck () {
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven",
				"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits ) {
			for (int i = 0; i < names.length; i++) {
				deck.add(new Card(i + 2, names[i] + " of " + suit));
			}
		}
	}
	
	public List<Card> getCards() {
		return deck;
	}
	
	public void setCards(List<Card> deck) {
		this.deck = deck;
	}
	
	public void describe() {
		for (Card card : this.deck) {
			card.describe();
		}
	}
	
	public void shuffle () {
		Collections.shuffle(this.deck);
	}
	
	public Card draw () {
		Card card = this.deck.remove(0);
		return card;
	}
}
