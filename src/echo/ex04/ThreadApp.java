package echo.ex04;

public class ThreadApp {

	public static void main(String[] args) {

		Thread thread01= new DigitThread();
		Thread thread02= new LowerThread();
		Thread thread03= new UpperThread();
		
		thread01.start();
		thread02.start();
		thread03.start();
	}
}


