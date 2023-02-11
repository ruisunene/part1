package exercise;

import java.util.List;

public class E3_3_1 {

	public static void main(String[] args) {
		var list = List.of(15.1, 8.75, 10.2);
		int total = 0;
		
		for(double n : list) {
			total += n;
	}
		System.out.println("合計= " + total);
		System.out.println(list);
	}
}
