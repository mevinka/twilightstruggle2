package twilightstruggle;

/**
 * Enumeration of the two superpowers in the game along with neutral state
 */

/**
 * @author Kevin
 */
public enum Superpower {
	USA(0), USSR(1), NEUTRAL(-1);
	
	private int value;
	
	private Superpower(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}