package week06;

import java.util.List;
import java.util.ArrayList;

public class Player {
	List<Card> hand = new ArrayList<>();
	int score = 0;
	String name;
	
	public Player(String name) {
	    this.name = name;
	}
	public String getName() {return name;}
	
	public int getScore() {return score;}
	
	public void describe() {
		System.out.println(name + "'s hand:");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		if (hand.isEmpty()) {
	        return null;
	    } else {
	        return hand.remove(0);
	    }
	}
	
	public void draw(Deck deck) {hand.add(deck.draw());}
	
	public void incrementScore() {score++;}
}
