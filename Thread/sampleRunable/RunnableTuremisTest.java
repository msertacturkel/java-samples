public class RunnableTuremisTest {

	public static void main(String[] args) {
		RunnableTuremis rt1 = new RunnableTuremis("deneme");
		RunnableTuremis rt2 = new RunnableTuremis("nasilsin");
		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);
		//t1.setPriority(10);
		//t2.setPriority(1);
		t1.start();
		t2.start();		
	}
}
