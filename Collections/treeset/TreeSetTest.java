package treeset;
import java.awt.Color;
import java.util.Date;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {		
		TreeSet<Otomobil> t=new TreeSet<Otomobil>();
		Otomobil oto=new Otomobil("audi","A1","kirmizi",1000,1400,2011);
		//oto.compareTo(new Elma());
		t.add(oto);

	}

}