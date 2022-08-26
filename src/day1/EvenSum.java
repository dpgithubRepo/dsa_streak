package day1;

import java.util.stream.IntStream;

/**
 * You are given an integer A, you need to find and return the sum of all the
 * even numbers between 1 and A.
 * 
 * Problem Constraints 1 <= N <= 500
 * 
 * Input Format  First and only argument is an integer A.
 * 
 * Output Format: Return an integer denoting the sum of even numbers between [1, A] (both inclusive).
 * 
 * 
 *  @author durgaprasad
 *
 */
public class EvenSum {

	static int solve1(int a) {
		int evenSum = IntStream.range(1, a + 1).filter(n -> n % 2 == 0).sum();
		return evenSum;
	}

	static int solve(int a) {
		int evenSum = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
		}

		return evenSum;
	}
	
	public static void main(String[] args) {
		System.out.println(solve(5));
		System.out.println(solve(2));
		
		System.out.println(solve1(5));
		System.out.println(solve1(2));
		
	}

}
