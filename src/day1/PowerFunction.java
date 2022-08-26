package day1;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * Problem Description
 * 
 * You are given two integers A and B.
 * 
 * You have to find the value of AB.
 * 
 * NOTE: The value of answer is always less than or equal to 109.
 * 
 * Problem Constraints 1 <= A, B <= 1000
 * 
 * Input Format
 * 
 * First parameter is an integer A.
 * 
 * Second parameter is an integer B.
 * 
 * Output Format Return an integer.
 * 
 * 
 * @author durgaprasad
 * 
 */
public class PowerFunction {

	static int solve(final int a, final int b) {

		if (a == 0)
			return 0;
		if (b == 0)
			return 1;

		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}

		return result;
	}

	static int solve2(final int a, final int b) {

		BiFunction<Integer, Integer, Integer> powerFunction = (x, y) -> {
			if (x == 0)
				return 0;
			if (y == 0)
				return 1;

			int result = 1;
			for (int i = 1; i <= y; i++) {
				result *= a;
			}

			return result;
		};

		return powerFunction.apply(a, b);
	}

	public static void main(String[] args) {
		System.out.println(solve(2, 3));
		System.out.println(solve2(2,3));
	}
}
