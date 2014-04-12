import java.util.Set;
import java.util.TreeSet;


public class SortPlanets {

	public static void main(String[] args) {
		Set<Planet> planets=new TreeSet<Planet>();
		planets.add(new Planet("Dunya",1000000l,1));
		planets.add(new Planet("MArs",1000200l,1));
		planets.add(new Planet("venus",1000300l,1));
		
		for (Planet planet : planets) {
			System.out.println(planet);
		}
	
		
	}

}
