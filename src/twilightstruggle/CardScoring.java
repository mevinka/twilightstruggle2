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
		
	}
}
