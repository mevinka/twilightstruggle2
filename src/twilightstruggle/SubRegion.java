package twilightstruggle;

import java.util.Stack;

public class SubRegion extends Region {

	private Region parentRegion;
	
	public SubRegion(String name, int presence, int domination, int control,
			Stack<Country> countries, Region parent) {
		super(name, presence, domination, control, countries);
		// TODO Auto-generated constructor stub
		
		this.parentRegion = parent;
	}
	
}
