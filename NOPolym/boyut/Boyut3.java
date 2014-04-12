package boyut;

public class Boyut3 {
	private double alan;
	public Boyut3(Object obj) {
		if(obj instanceof Daire){
			Daire da=(Daire)obj;
			alan=da.alan();
		}
		
		if(obj instanceof Dikdortgen){
			Dikdortgen di=(Dikdortgen)obj;
			alan=di.alan();
		}
			
		
	}
	
	public double alan3k() {
		return 3*alan;
	}
}
