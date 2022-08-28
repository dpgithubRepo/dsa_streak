package day3;

import java.util.ArrayList;

/**
 * Problem Description Given an array A and an integer B, find the number of
 * occurrences of B in A.
 * 
 * 
 * Problem Constraints 1 <= B, Ai <= 109 1 <= |A| <= 105
 * 
 * 
 * Input Format Given an integer array A and an integer B.
 * 
 * 
 * Output Format Return an integer, number of occurrences of B in A.
 * 
 * 
 * Example Input Input 1: A = [1, 2, 2], B = 2 Input 2: A = [1, 2, 1], B = 3
 * 
 * 
 * Example Output Output 1: 2 Output 2: 0
 * 
 * 
 * Example Explanation Explanation 1: Element at index 2, 3 is equal to 2 hence
 * count is 2. Explanation 2: There is no element equal to 3 in the array.
 * 
 * @author durgaprasad
 *
 */
public class LinearSearch {
	static int solve(ArrayList<Integer> A, int B) {
		int count = 0;
		for(int i : A) {
			if(i == B) {
				count++;
			}
		}
		return count;
	}
	
	static int solve1(ArrayList<Integer> A, int B) {
		
		return (int) A.stream().filter(n->n==B).count();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(1); input.add(2); input.add(2);
		
		System.out.println(solve(input, 2));
		System.out.println(solve1(input, 2));
		
		
		System.out.println(solve(input, 3));
		System.out.println(solve1(input, 3));
	}
	
	
}
