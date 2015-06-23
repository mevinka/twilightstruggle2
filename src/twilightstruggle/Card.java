package twilightstruggle;


/**
 * An abstract class representing a playable card in Twilight Struggle.
 */

/**
 * @author Kevin
 */

public abstract class Card implements Comparable<Card> {
	public final String name;
	public final String description;
	public final Types.Card cardInt;
	public final int cost;
	public final Types.WarPhase phase;
	public final Types.Superpower powerType;
	public final boolean discardable;
	
	public Card(String name, String description, Types.Card cardInt, int cost, 
			Types.WarPhase phase, Types.Superpower power, boolean discardable) {
		this.name = name;
		this.description = description;
		this.cardInt = cardInt;
		this.cost = cost;
		this.phase = phase;
		this.powerType = power;
		this.discardable = discardable;
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
	
	abstract void effect();
}
