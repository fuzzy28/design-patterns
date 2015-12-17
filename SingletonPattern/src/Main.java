import org.jrue.singleton.pattern.Singleton;


public class Main {

	public static void main(String[] args) {
		runMultiThreadedSingleton();
	}
	
	public static void runSingleThreadedSingleton() {
		Singleton singleTon1 = Singleton.getInstance();
		Singleton singleTon2 = Singleton.getInstance();
		System.out.println(singleTon1.equals(singleTon2));
	}
	
	public static void runMultiThreadedSingleton() {

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton s = Singleton.getInstance();
				System.out.println(s.toString());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton s = Singleton.getInstance();
				System.out.println(s.toString());
			}
		});
		
		t1.start();
		t2.start();
		
	}
}
