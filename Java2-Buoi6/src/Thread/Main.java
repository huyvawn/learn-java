package Thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread
		// MultiThreading
		KeThuaThread thread1 = new KeThuaThread();
		
		TrienKhaiRunable runnable = new TrienKhaiRunable();
		Thread thread2 = new Thread(runnable);
		
		thread1.start();
		thread2.start();
	}

}
