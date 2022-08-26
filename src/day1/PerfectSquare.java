package day1;

/**
 * 
 * 
 * Problem Description You are given a function that takes an integer argument
 * A. Return 1 if A is a perfect square otherwise return 0.
 * 
 * Problem Constraints 1 <= A <= 108
 * 
 * Input Format First argument is an integer A.
 * 
 * Output Format Return an integer (0 or 1) based upon the question.
 * 
 * @author durgaprasad
 *
 */
public class PerfectSquare {

	static int solve(int a) {
		for (int i = 1; i * i <= a; i++) {
			if (i * i == a) {
				return 1;
			}
		}

		return 0;
	}

	static int solve1(int a) {
		int sqrt = (int) Math.sqrt(a);

		return Math.pow(sqrt, 2) == a ? 1 : 0;
	}

	public static void main(String[] args) {
		System.out.println(solve(4));
		System.out.println(solve(1001));
		
		
		System.out.println(solve1(9));
		System.out.println(solve1(1001));

	}
}
