package twilightstruggle;

/**
 * The class for the board object, which manages all of the countries, regions, and general
 * point values (i.e. defcon status, victory point counter, and turn marker).
 * @author Kevin
 *
 */
public class Board {
	private int defcon;
	private int victoryPoints;
	private int turn;
	private Types.Superpower phasing;
	
	/**
	 * Creates default board state for starting game
	 */
	public Board() {
		setDefcon(1);
		setVictoryPoints(0);
		setTurn(0);
	}

	
	public int getDefcon() {
		return defcon;
	}

	public void setDefcon(int defcon) {
		defcon = defcon;
	}

	public int getVictoryPoints() {
		return victoryPoints;
	}

	public void setVictoryPoints(int victoryPoints) {
		this.victoryPoints = victoryPoints;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public Types.Superpower getPhasing() {
		return phasing;
	}

	public void setPhasing(Types.Superpower phasing) {
		this.phasing = phasing;
	}
}
