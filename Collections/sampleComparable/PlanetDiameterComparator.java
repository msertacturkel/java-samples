
public class PlanetDiameterComparator implements Comparable<Planet>{

	public int compareTo(Planet a,Planet b) {
		if(a.getDiameter()<b.getDiameter()) return -1;
		else 
			return 0;
	}

	@Override
	public int compareTo(Planet o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
