package twilightstruggle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Stack;

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
	public static Stack<Country> countries;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		Player usa = new Player(Types.Superpower.USA);
		Player ussr = new Player(Types.Superpower.USSR);
		
		
		
		countries = initializeCountries();
		initializeRegions();
		// initialize cards
		initializeCards();
	}

	private static Stack<Country> initializeCountries() {
		// TODO: initialize each of the countries with all of its neighbors.
		Stack<Country> result = new Stack<Country>();
		
		// TODO: read from text file, for each line, build stack of Type.Country codes of neighbors
		
		Path path = FileSystems.getDefault().getPath("txt", "countryprops.txt");		
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        String[] parts = line.split(",");
		        Types.Country key = Types.Country.valueOf(parts[0]);
		        String name = parts[1];
		        int stability = Integer.parseInt(parts[2]);
		        boolean battleground = false;
		        if(parts[3].equals("T")) {
		        	battleground = true;
		        }
		        Stack<Types.Country> neighbors = new Stack<Types.Country>();
		        for(int i = 4; i < parts.length; i++) {
		        	neighbors.add(Types.Country.valueOf(parts[i]));
		        }
		        
		        Country c = new Country(key,name,stability,battleground,neighbors);
		        //System.out.println(c.toString());
		        result.add(c);
		        
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		return result;
	}
	
	private static void initializeRegions() {
		
	}
	
	private static void initializeCards() {
		
	}
}
