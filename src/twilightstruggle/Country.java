package twilightstruggle;

/**
 * A class representing an individual country in Twilight Struggle. The only
 * basic operation provided is the manipulation of a country's influence.
 */

/**
 * @author Kevin
 */
public class Country {
	private boolean battleground;
	private String name;
	private int stability;
	private int[] influence;
	
	/**
	 * Country constructor. Defaults influence in the country to zero.
	 * @param name The name of the country
	 * @param stability The country's stability number (used in most operations)
	 * @param battleground The battleground status of the country
	 */
	public Country(String name, int stability, boolean battleground) {
		this.battleground = battleground;
		this.name = name;
		this.stability = stability;
		this.influence = new int[2];
		influence[0] = influence[1] = 0; // Index 0 represents USA, 1 USSR
	}
	
	/**
	 * Gets the controlled status of the country
	 * @return Returns the integer representation of the controlling country, with
	 * -1 representing a neutral country.
	 */
	public Superpower hasControl() {
		int diff = influence[0] - influence[1];
		if(diff >= this.stability) {
			return Superpower.USA;					// USA has control
		} else if(-1*diff >= this.stability) {
			return Superpower.USSR;					// USSR has control
		}
		
		return Superpower.NEUTRAL;					// Neutral; no controller
	}
	
	/**
	 * Increases a superpower's influence in the country. If the country is
	 * controlled by the opposing superpower, then each increase in influence
	 * costs an extra point until control is lost.
	 * @param player representation of the superpower increasing influence
	 * @param value number of points being spent.
	 */
	public void increaseInfluence(Superpower player, int value) {
		int diff = influence[0] - influence[1];
		
		/* if the opponent does not control the country */
		if(this.hasControl() == player || this.hasControl() == Superpower.NEUTRAL) {
			this.changeInfluence(player, value);
		} else {
			int spent = 0;
			while(this.hasControl() != player && this.hasControl() != Superpower.NEUTRAL 
					&& spent < value) {
				this.changeInfluence(player, 1);
				spent += 2;
			}
			/* Spend remaining points normally */
			if(spent < value) {
				this.changeInfluence(player, value - spent);
			}	
		}		
	}
	
	/**
	 * Increases a superpower's influence in the country.
	 * @param player representation of which superpower is adding influence
	 * @param value number of points being spent to increase influence
	 */
	public void changeInfluence(Superpower player, int value) {
		int side = player.getValue();
		this.influence[side] += value;
	}
	
	
}