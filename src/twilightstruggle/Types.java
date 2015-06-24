package twilightstruggle;

/**
 * A class of all of the various types in Twilight Struggle.
 * @author Kevin
 *
 */

public class Types {
	
	/**
	 * The enumeration for the superpowers in the game. Note that neutral is a value of -1.
	 * @author Kevin
	 *
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
	
	/**
	 * Phases of the war in the game
	 * @author Kevin
	 *
	 */
	public enum WarPhase {
		EARLY, MID, LATE;
	}
	
	/**
	 * A list of all of the regions on the world map, INCLUDING sub regions
	 * @author Kevin
	 *
	 */
	public enum Region {
		EUROPE, // used only for the countries in both parts of Europe
		E_EUROPE,
		W_EUROPE,
		ASIA, // if country is in ASIA but not a part of SE_ASIA
		SE_ASIA, // for only countries in SE_ASIA
		C_AMERICA,
		S_AMERICA,
		AFRICA,
		MIDDLE_EAST
	}
	
	/**
	 * A list encoding every single card, in index order, in Twilight Struggle
	 * @author Kevin
	 *
	 */
	public enum Card {
		SCORE_ASIA, // start early war cards
		SCORE_EURO,
		SCORE_MIDEAST,
		DUCK_COVER,
		FIVE_YR_PLAN,
		CHINA_CARD,
		SOCIALIST_GOVTS,
		FIDEL,
		VIET_REVOLTS,
		BLOCKADE,
		WAR_KOREAN,
		ROMANIAN_ABDIC,
		WAR_ARABISRAEL,
		COMECON,
		NASSER,
		WARSAW_PACT,
		DEGAULLE,
		NAZI_SCIENTIST,
		TRUMAN_DOCTRINE,
		OLYMPICS,
		NATO,
		IND_REDS,
		MARSHALL_PLAN,
		WAR_INDOPAK,
		CONTAINMENT,
		CIA,
		USJAPAN_PACT,
		SUEZ_CRISIS,
		EEURO_UNREST,
		DECOLONIZATION,
		RED_SCAREPURGE,
		UN_INTERVENTION,
		DE_STALIN,
		NUCLEAR_TESTBAN,
		FORMOSAN, // end Early war cards
		WAR_BRUSH, // start Mid war cards
		SCORE_CAMERICA,
		SCORE_SEASIA,
		ARMS_RACE,
		CUBAN_MISSILE,
		NUCLEAR_SUBS,
		QUAGMIRE,
		SALT_NEGOTNS,
		BEAR_TRAP,
		SUMMIT,
		STOP_WORRYING,
		JUNTA,
		KITCHEN_DEBATES,
		MISSILE_ENVY,
		WE_BURY_YOU,
		BREZHNEV_DOCTRINE,
		PORTUGUESE_CRUMB,
		SAFRICA_UNREST,
		ALLENDE,
		WILLY_BRANDT,
		MUSLIM_REVOLUTION,
		ABM_TREATY,
		CULTURAL_REV,
		FLOWER_PWR,
		U2_INCIDENT,
		OPEC,
		LONE_GUNMAN,
		COLONIAL_REAR,
		PANAMA_RETURN,
		CAMP_DAVID,
		PUPPET_GOVS,
		GRAIN_TO_SOVS,
		JOHN_PAUL,
		LATIN_DEATHSQUADS,
		OAS_FOUNDED,
		NIXON_CHINA,
		SADAT_EXPELS,
		SHUTTLE_DIPLO,
		VOICE_OF_USA,
		LIBERATION_THEO,
		USSURI_SKIRMISH,
		ASK_NOT,
		ALLIANCE_FOR_PROG,
		SCORE_AFRICA,
		ONE_SMALL_STEP,
		SCORE_SAMERICA, // end Mid war cards
		IRANIAN_HOSTAGE, // start Late war cards
		IRON_LADY,
		REAGAN_LIBYA,
		STAR_WARS,
		NSEA_OIL,
		REFORMER,
		MARINE_BARRACKS,
		SOVIETS_KAL,
		GLASNOST,
		ORTEGA_NICAR,
		TERRORISM,
		IRAN_CONTRA,
		CHERNOBYL,
		LATIN_DEBT,
		TEAR_DOWN_WALL,
		EVIL_EMPIRE,
		ALDRICH_AMES,
		PERSHING_II,
		WARGAMES,
		SOLIDARITY,
		WAR_IRAQIRAN, // end Late war cards
		DEFECTORS, // random early war card in order...
		CAMBRIDGE_FIVE, // optional cards
		SPECIAL_RELTN,
		NORAD,
		CHE,
		MAN_IN_TEHRAN,
		YURI_SAMANTHA,
		AWACS; // end optional cards
	}
	
	
}
