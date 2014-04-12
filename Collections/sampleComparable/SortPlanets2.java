import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortPlanets2 {
	public static void main(String[] args) {
		List<Planet> planets=new ArrayList();//new ArrayList<>(15); //diyerek baslangicta 15 elemanli bir dizi ile baslatabiliriz.Immutable zaten
		planets.add(new Planet("Dunya",1000000l,1));
		planets.add(new Planet("MArs",1000200l,1));
		planets.add(new Planet("venus",1000300l,1));
		PlanetDiameterComparator comp=new PlanetDiameterComparator();
		Collections.sort(planets, comp);//reverse,rotate,shuffle gibi metodları da var
		for (Planet planet : planets) {
			System.out.println(planet);
		}
		
	}

}
