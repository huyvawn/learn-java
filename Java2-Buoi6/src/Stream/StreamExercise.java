package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class StreamExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,415,24,18,90};
		Stream<Integer> stream = Stream.of(1,415,24,18,90);
		// In ra cac so le
//		stream.filter(n -> n % 2 != 0)
//			.forEach(System.out::println);
		// Tinh tong cac so chan
		int sum = stream.filter(n -> n % 2 == 0)
			.reduce(0, Integer:: sum);
		System.out.println("Sum of even numbers: "+ sum);
		
		//3. Tim so max, min
		int max = Arrays.stream(array)
						.max().getAsInt();
		System.out.println("Max: "+max);
		int min = Arrays.stream(array)
						.min().getAsInt();
		System.out.println("Min: " +min);
	}

}
