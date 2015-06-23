package twilightstruggle;


/**
 * An abstract class representing a playable card in Twilight Struggle.
 */

/**
 * @author Kevin
 */

public class Card implements Comparable<Card> {
	public final String name;
	public final String description;
	public final Types.Card cardInt;
	public final int cost;
	public final Types.WarPhase phase;
	public final Types.Superpower powerType;
	public final boolean discardable;
	public final CardEffect[] effects;
	// NEED effect type stack/array/whatever
	
	/**
	 * Constructs a card object, representing one of the many unique cards in TS
	 * @param name The name of the card
	 * @param description Text of the card's body
	 * @param cardInt The number of the card in the TS card index
	 * @param cost The operations point cost value of the card
	 * @param phase The phase of the Cold War the card is part of (early, mid, or late war)
	 * @param power The superpower alignment of the card (can be neutral)
	 * @param discardable If the card is discarded after use, this value is TRUE. Otherwise, it is FALSE.
	 */
	public Card(String name, String description, Types.Card cardInt, int cost, 
			Types.WarPhase phase, Types.Superpower power, boolean discardable, CardEffect[] effects) {
		this.name = name;
		this.description = description;
		this.cardInt = cardInt;
		this.cost = cost;
		this.phase = phase;
		this.powerType = power;
		this.discardable = discardable;
		this.effects = effects;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Card) {
			Card comp = (Card) other;
			return(this.cardInt == comp.cardInt);
		}
		
		return false;
	}
	
	@Override
	public int compareTo(Card other) {
		if(this.cardInt.ordinal() < other.cardInt.ordinal()) {
			return -1;
		} else if(this.cardInt.ordinal() > other.cardInt.ordinal()) {
			return 1;
		}
		
		return 0;
	}
	
	public void effect() {
		for(int i = 0; i < this.effects.length; i++) {
			this.effects[i].effect();
		}
	}
}
