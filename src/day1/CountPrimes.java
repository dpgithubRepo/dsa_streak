package day1;

/**
 * 
 * Problem Description You will be given an integer n. You need to return the
 * count of prime numbers less than or equal to n.
 * 
 * Problem Constraints 0 <= n <= 10^3
 * 
 * Input Format Single input parameter n in function.
 * 
 * Output Format Return the count of prime numbers less than or equal to n.
 * 
 * @author durgaprasad
 *
 */
public class CountPrimes {

	static int solve(int a) {
		int count = 0;
		for (int i = 2; i <= a; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	static boolean isPrime(int a) {
		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(solve(19));
		System.out.println(solve(100));
		System.out.println(solve(1000));
	}
}
