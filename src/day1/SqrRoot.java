package day1;

import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 * 
 * Given a number A. Return square root of the number if it is perfect square
 * otherwise return -1.
 * 
 * Problem Constraints 1 <= A <= 108
 * 
 * Input Format First argument is an integer A.
 * 
 * 
 * Output Format Return an integer which is the square root of A if A is perfect
 * square otherwise return -1.
 * 
 * @author durgaprasad
 *
 */
public class SqrRoot {

	static int solve(int a) {

		for (int i = 1; i < a; i++) {
			if (i * i == a) {
				return i;
			}
		}

		return -1;
	}

	static int solve1(int a) {

		int sqrRoot = (int) Math.sqrt(a);

		return Math.pow(sqrRoot, 2) == a ? sqrRoot : -1;

	}

	static int solve2(int a) {
		Function<Integer, Integer> is = (b) -> {
			int sqrRoot = (int) Math.sqrt(b);
			return Math.pow(sqrRoot, 2) == b ? sqrRoot : -1;
		};

		return is.apply(a);
	}

	public static void main(String[] args) {
		System.out.println(solve(4));
		System.out.println(solve(1001));

		System.out.println(solve1(4));
		System.out.println(solve1(1001));
		
		
		System.out.println(solve2(4));
		System.out.println(solve2(1001));

	}

}
