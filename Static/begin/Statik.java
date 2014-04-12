package begin;

public class Statik {

	private static int i;
	private int j;
	
	public Statik(){
		i++;
		j=i;
	}
	
	public void info(){
		System.out.println("j="+j);
		
	}
	
	public int getI(){
		return i;
	}
	
	public int getJ(){
		return j;
	}
}