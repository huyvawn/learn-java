
public interface iStudent {
	void exam();
	
	default void play1() {
		System.out.println("Play football.");
	}
}
