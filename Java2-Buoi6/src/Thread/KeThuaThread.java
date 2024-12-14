package Thread;

public class KeThuaThread extends Thread {
	@Override
	public void run() {
//		System.out.println("Thread " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("A" + i);
		}
	}
}
