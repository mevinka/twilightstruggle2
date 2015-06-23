package twilightstruggle;

import java.util.Stack;

public class Region {
	public final String name;
	public final int presence;
	public final int domination;
	public final int control;
	public final Country[] countries;
	public final int battlegrounds;
	// need interface for scoring function
	
	public Region(String name, int presence, int domination, int control, Stack<Country> countries) {
		this.name = name;
		this.presence = presence;
		this.domination = domination;
		this.control = control;
		this.countries = new Country[countries.size()];
		int bcounter = 0;
		for(int i = 0; i < this.countries.length; i++) {
			this.countries[i] = countries.elementAt(i);
			if(this.countries[i].battleground) {
				bcounter++;
			}
		}
		
		this.battlegrounds = bcounter;
	}
	
	/**
	 * Scores the region, using standard rules. Positive numbers are for USA, negative for USSR.
	 * @return an integer number of points to move the VP slider
	 */
	public int score() {
		PrelimScore usaScore = getScore(Types.Superpower.USA);
		PrelimScore ussrScore = getScore(Types.Superpower.USSR);
		
		int total = 0;
		
		if(usaScore.control > 0) {
			total += this.presence;
			if(usaScore.hasNonBg) {
				if(usaScore.control > ussrScore.control) {
					if(usaScore.battleground == this.battlegrounds) {
						total += this.control;
					} else if(usaScore.battleground > ussrScore.battleground) {
						total += this.domination;
					}
				}
			}
		}
		
		if(ussrScore.control > 0) {
			total -= this.presence;
			if(ussrScore.hasNonBg) {
				if(ussrScore.control > usaScore.control) {
					if(ussrScore.battleground == this.battlegrounds) {
						total -= this.control;
					} else if(ussrScore.battleground > usaScore.battleground) {
						total -= this.domination;
					}
				}
			}
		}
		
		return total;
	}
	
	private PrelimScore getScore(Types.Superpower power) {
		int control = 0;
		int battleground = 0;
		boolean hasNonBg = false;
		
		for(int i = 0; i < this.countries.length; i++) {
			if(this.countries[i].hasControl() == power) {
				control++;
				if(this.countries[i].battleground) {
					battleground++;
				} else {
					hasNonBg = true;
				}
			}
		}
		

		PrelimScore result = new PrelimScore(control, battleground, hasNonBg);
		return result;
		
	}
	
}
