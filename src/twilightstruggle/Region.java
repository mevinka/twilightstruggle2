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
		int usaControl = 0;
		int ussrControl = 0;
		int usaBattleground = 0;
		int ussrBattleground = 0;
		int usaTotal = 0; int ussrTotal = 0;
		
		for(int i = 0; i < this.countries.length; i++) {
			if(this.countries[i].hasControl() == Types.Superpower.USA) {
				usaControl++;
				if(this.countries[i].battleground) {
					usaBattleground++;
				}
			} else if(this.countries[i].hasControl() == Types.Superpower.USSR) {
				ussrControl++;
				if(this.countries[i].battleground) {
					ussrBattleground++;
				}
			}
		}
		
		// Define presence as having any controlled countries
		if(usaControl > 0) {
			usaTotal = this.presence;
		}
		if(ussrControl > 0) {
			ussrTotal = this.presence;
		}
		
		if(usaControl > 0 || ussrControl > 0) {
			if(usaBattleground > ussrBattleground) {
				usaTotal = this.domination;
			} else if(ussrBattleground > usaBattleground) {
				ussrTotal = this.domination;
			}
		}
		
		
	}
	
	private int getScore(Types.Superpower power) {
		int control = 0;
		int battleground = 0;
		boolean hasNonBg = false;
		int finalTotal = 0;
		
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
		
		if(control > 0) {
			finalTotal = this.presence;
			if(hasNonBg) {
				
			}
		}
	}
	
}
