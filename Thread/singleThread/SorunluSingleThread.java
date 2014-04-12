

public class SorunluSingleThread {
	public void fonk1() {
		while(true)
			System.out.println("deneme");
	}

	public void fonk2() {
		for (int i = 1; i <= 10; i++)
			System.out.println("merhaba");
	}

	public void fonk3() {
		for (int i = 1; i <= 10; i++)
			System.out.println("nasilsin");
	}

}
