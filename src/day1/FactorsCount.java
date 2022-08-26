package day1;

/**
 * Problem Description Given an integer A, you need to find the count of it's
 * factors.
 * 
 * Factor of a number is the number which divides it perfectly leaving no
 * remainder.
 * 
 * Example : 1, 2, 3, 6 are factors of 6
 * 
 * 
 * Problem Constraints 1 <= A <= 109
 * 
 * 
 * Input Format First and only argument is an integer A.
 * 
 * 
 * Output Format Return the count of factors of A.
 * 
 * @author durgaprasad
 *
 */
public class FactorsCount {

	static int solve(int a) {
		int count = 0;
		for (int i = 1; i * i <= a; i++) {
			if (a % i == 0) {
				if (a / i == i) {
					count++;
				} else {
					count += 2;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(solve(5));
		System.out.println(solve(10));
	}
}
