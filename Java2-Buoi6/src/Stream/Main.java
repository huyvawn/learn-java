package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		Arrays.stream(array)
				.forEach(System.out::println);
		//In ra cac phan tu chan trong mang
		//Mang thuan tuy
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				result.add(array[i]);
			}
		}
		System.out.println(result);
		//Stream
		Arrays.stream(array)
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
		// IN ra mang co gia tri la gap doi cac gia tri trong mang array
		System.out.println("--------");
		Arrays.stream(array)
			.map(n -> n*2)
			.forEach(System.out::println);
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		//Tinh tong
		int tong = Arrays.stream(array)
						.reduce(0, Integer::sum);
						System.out.println(tong);
						System.out.println("--------");
		//Xu ly song song
		Arrays.stream(array)
		.parallel()
		.map(n -> n*2)
		.forEach(System.out::println);
	}
}
