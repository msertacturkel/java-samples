package shadowing;

public class Golgeleme extends GolgelemeTaban{

	int i=10;
	
	public void fonk(int i){
		//GolgelemeTaban gt=(GolgelemeTaban)g;
		//GolgelemeTabanTaban gtt=(GolgelemeTabanTaban)g;
		GolgelemeTabanTaban gtt=(GolgelemeTabanTaban)this;
		System.out.println(i+this.i+super.i+gtt.i);
	}
}
