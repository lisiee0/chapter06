package echo.ex06;

public class ThreadApp {

	public static void main(String[] args) {
		
		Runnable digit= new DigitImpl();
		Runnable lower= new LowerImpl();
		Runnable upper= new UpperImpl();
		
		Thread thread01= new Thread(digit);
		Thread thread02= new Thread(lower);
		Thread thread03= new Thread(upper);
		
		thread01.start();
		thread02.start();
		thread03.start();
		
	}

}
