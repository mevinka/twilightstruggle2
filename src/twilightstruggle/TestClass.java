package twilightstruggle;

public class TestClass {
	public static Region sAmerica;
	public static Region cAmerica;
	public static Region africa;
	public static Region europe;
	public static Region asia;
	public static Region middleEast;
	public static SubRegion seAsia;
	public static SubRegion eEurope;
	public static SubRegion wEurope;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		Player usa = new Player(Types.Superpower.USA);
		Player ussr = new Player(Types.Superpower.USSR);
		
		
		
		initializeCountries();
		initializeRegions();
		// initialize cards
		initializeCards();
	}

	private static void initializeCountries() {
		// TODO: initialize each of the countries with all of its neighbors.
	}
	
	private static void initializeRegions() {
		
	}
	
	private static void initializeCards() {
		
	}
}
