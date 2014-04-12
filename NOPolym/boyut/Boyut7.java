package boyut;

public class Boyut7 {
	private Object obj;

	public Boyut7(Object obj) {
		this.obj = obj;
	}
	
	public double alan3k()  {
		if(obj instanceof Daire){
			Daire da=(Daire)obj;
			return 3*da.alan();
		}
		if(obj instanceof Dikdortgen){
			Dikdortgen di=(Dikdortgen)obj;
			return 3*di.alan();
		}
			
		throw new AlaniHesaplanamayanSinifHatasiRuntime("Daire veya Dikdortgen olmali");
	}
}
