package Generic;

public class GenericMethod {
	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.print(element + " ");
		}
		System.out.println("");
	}
}
