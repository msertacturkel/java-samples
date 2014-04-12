
public class Planet implements Comparable<Planet> {
	private final String name;
	private final long orbit;
	private final int diameter;
	public Planet(String name, long orbit, int diameter) {
		this.diameter=diameter;
		this.name = name;
		this.orbit = orbit;
	}
	@Override
	public int compareTo(Planet other) {
		if(this.orbit<other.orbit)
			return -1;
		else if(this.orbit>other.orbit)
			return 1;
		else
			return 0;
	}


}
