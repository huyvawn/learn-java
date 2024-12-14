package Thread;

public class TrienKhaiRunable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		System.out.println("Thread " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
				System.out.println("B"+i);
		}
	}

}
