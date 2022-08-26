package day1;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Description You are given an integer A. You have to tell whether it
 * is a perfect number or not.
 * 
 * Perfect number is a positive integer which is equal to the sum of its proper
 * positive divisors.
 * 
 * A proper divisor of a natural number is the divisor that is strictly less
 * than the number.
 * 
 * 
 * 
 * Problem Constraints 1 <= A <= 106
 * 
 * 
 * 
 * Input Format First and only argument contains a single positive integer A.
 * 
 * 
 * 
 * Output Format Return 1 if A is a perfect number and 0 otherwise.
 * 
 * @author durgaprasad
 *
 */
public class NumberPerfect {

	static int solve(int a) {

		Set<Integer> factorSet = new HashSet<>();
		for (int i = 1; i * i <= a; i++) {
			if (a % i == 0) {
				factorSet.add(i);
				factorSet.add(a / i);
			}
		}
		
		factorSet.remove(a);

		int sum = factorSet.stream().mapToInt(Integer::intValue).sum();

		return a == sum ? 1 : 0;
	}

	public static void main(String[] args) {
		System.out.println(solve(4));
		System.out.println(solve(6));
	}

}
