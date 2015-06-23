package twilightstruggle;

/**
 * A small class that stores all the score data when scoring a region.
 * 
 * @author Kevin
 */

public class PrelimScore {
	public int control;
	public int battleground;
	public boolean hasNonBg;
	
	public PrelimScore(int control, int battleground, boolean hasNonBg) {
		this.control = control; this.battleground = battleground; this.hasNonBg = hasNonBg;
	}
}
