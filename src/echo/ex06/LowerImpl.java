package echo.ex06;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
		for(char lo= 'a'; lo<='z'; lo++) {
			System.out.println(lo);
		
			try {
				Thread.sleep(1000);
			}	 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
