package twilightstruggle;

import java.util.HashMap;
import java.util.Stack;

import twilightstruggle.Types.Country;

/**
 * A class representing the players in the game of Twilight Struggle. It includes
 * counters for all superpower specific point values (i.e. hand size, military operations points,
 * and space race advancement). It also keeps track of the cards in hand.
 */

/**
 * @author Kevin
 *
 */
public class Player {
	// private Types.Card[] handArr;
	private Stack<Types.Card> hand;
	private Types.Superpower playerPower;
	private int handSize;
	private int militaryOps;
	private int spaceRace;
	private Stack<Types.Country> influenceList;
	
	/**
	 * The basic player constructor. Defaults to starting game limitations (8 cards in hand, 0 military ops and space race)
	 * @param power The superpower this player object represents (either USA or USSR)
	 */
	public Player(Types.Superpower power) {
		this.playerPower = power;
		// handArr = new Types.Card[9];
		hand = new Stack<Types.Card>();
		setHandSize(8);
		setMilitaryOps(0);
		setSpaceRace(0);
		influenceList = new Stack<Types.Country>();
	}
	
	/**
	 * Gets the superpower represented by this player
	 * @return returns the Types.Superpower of this player
	 */
	public Types.Superpower getPower() {
		return this.playerPower;
	}
	
	/**
	 * Sets the hand size, to be used in transition from early war to mid and late war phases
	 * @param size The size of the new hand
	 */
	public void setHandSize(int size) {
		handSize = size;
	}
	
	/**
	 * Adds a card to the hand, if it can fit more cards
	 * @param card The card to be added to the hand
	 */
	public void addToHand(Types.Card card) {
		if(hand.size() <= handSize) {
			hand.add(card);
		}
	}
	
	/**
	 * Removes a card from the player hand, and returns it
	 * @param card Types.Card to remove. The method will check to ensure this card exists before removing
	 * @return returns the removed card, or NULL if the card doesn't exist.
	 */
	public Types.Card removeCard(Types.Card card) {
		if(hand.contains(card)) {
			Types.Card removed = hand.remove(hand.indexOf(card));
			return removed;
		}
		
		return null;
	}
	
	public void addCountry(Types.Country country) {
		if(!influenceList.contains(country)) {
			influenceList.add(country);
		}
	}
	
	public void removeCountry(Types.Country country) {
		if(influenceList.contains(country)) {
			influenceList.remove(country);
		}
	}

	/**
	 * Space race getter method
	 * @return Returns the integer value of the player's advancement on the space race.
	 */
	public int getSpaceRace() {
		return spaceRace;
	}

	/**
	 * Sets the space race value
	 * @param spaceRace The integer to set the space race value
	 */
	public void setSpaceRace(int spaceRace) {
		this.spaceRace = spaceRace;
	}

	/**
	 * Military ops points getter method
	 * @return Returns the integer value of the number of required military ops player has undertaken
	 */
	public int getMilitaryOps() {
		return militaryOps;
	}

	/**
	 * Military ops points setter method
	 * @param militaryOps The integer to set the required military ops points to.
	 */
	public void setMilitaryOps(int militaryOps) {
		this.militaryOps = militaryOps;
	}
	
	/**
	 * Returns the cards in hand
	 * @return Returns a stack of cards of type Types.Card, representing the player hand
	 */
	public Stack<Types.Card> cardsInHand() {
		return hand;
	}

	public Stack<Types.Country> getInfluenceList() {
		return influenceList;
	}

	public void setInfluenceList(Stack<Types.Country> influenceList) {
		this.influenceList = influenceList;
	}
}
