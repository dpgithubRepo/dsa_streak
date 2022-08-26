package day1;

import java.util.ArrayList;

/**
 * 
 * 
 * Problem Description You are given an integer A. You need to print all the
 * Armstrong Numbers between 1 to A.
 * 
 * If sum of cubes of each digit of the number is equal to the number itself,
 * then the number is called an Armstrong number.
 * 
 * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
 * 
 * Problem Constraints 1 <= N <= 500
 * 
 * Input Format First and only argument is an integer A.
 * 
 * Output Format Return an integer array of all the Armstrong numbers in range
 * [1,A].
 * 
 * @author durgaprasad
 *
 */
public class Armstrong {

	static ArrayList<Integer> solve(int a) {
		
		ArrayList<Integer> armstrongs = new ArrayList<>();
		
		for (int i = 1; i <= a; i++) {
			int sum = 0;
			int num = i;
			while (num > 0) {
				int r = num % 10;
				num = num / 10;
				sum += (r * r * r);
			}
			if (sum == i) {
				armstrongs.add(i);
			}
		}
		return armstrongs;
	}

	public static void main(String[] args) {
		System.out.println(solve(5));
		System.out.println(solve(200));
	}
}
