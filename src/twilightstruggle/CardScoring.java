package twilightstruggle;
/**
 * A card effect for scoring cards, which score specific regions in the map
 * @author Kevin
 *
 */
public class CardScoring implements CardEffect {
	private Types.Region region;
	
	public CardScoring(Types.Region r) {
		this.region = r;
	}
	
	public void effect() {
		// TODO: need to access the static map of region objects
		// in the board in the main game object
	}
}
