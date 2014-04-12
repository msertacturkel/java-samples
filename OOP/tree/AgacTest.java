package tree;

public class AgacTest {

	public static void main(String[] args) {
		Agac a1=new Agac();
		Agac a2=new Agac("elma");
		Agac a3=new Agac(3);
		Agac a4=new Agac("elma",3);
		Agac a5=new Agac(3,"elma");
		a1.info();//Herhangi bir agac
		a2.info();//elma agaci
		a3.info();//3 m. yuksekliginde bir agac
		a4.info();//3 m yuksekliginde bir elma agaci
		a5.info();//3 m yuksekliginde bir elma agaci
	}

}
