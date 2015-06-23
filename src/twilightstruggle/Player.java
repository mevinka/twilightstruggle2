package twilightstruggle;

import java.util.Stack;

/**
 * A class representing the players in the game of Twilight Struggle.
 */

/**
 * @author Kevin
 *
 */
public class Player {
	private Card[] handArr;
	private Stack<Card> hand;
	private Types.Superpower playerPower;
	private int maxHand;
	
	public Player(Types.Superpower power) {
		this.playerPower = power;
		handArr = new Card[9];
		hand = new Stack<Card>();
		maxHand = 8;
	}
	
	public Types.Superpower getPower() {
		return this.playerPower;
	}
	
	public void addToHand(Card card) {
		if(hand.size() <= maxHand) {
			hand.add(card);
		}
	}
	
	public void setHandSize(int size) {
		maxHand = size;
	}
	
	public Card removeCard(Types.Card card) {
		if(hand.contains(card)) {
			Card removed = hand.remove(hand.indexOf(card));
			return removed;
		}
		
		return null;
	}
}
