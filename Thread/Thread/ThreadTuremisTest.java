
public class ThreadTuremisTest {

	public static void main(String[] args) {
		ThreadTuremis th1=new ThreadTuremis("merhaba");
		ThreadTuremis th2=new ThreadTuremis("nasilsin");
		th1.start();
		th2.start();

	}

}
