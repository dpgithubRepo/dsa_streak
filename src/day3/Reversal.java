package day3;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Description You are given a constant array A.
 * 
 * You are required to return another array which is the reversed form of the
 * input array.
 * 
 * 
 * 
 * Problem Constraints 1 <= A.size() <= 10000
 * 
 * 1 <= A[i] <= 10000
 * 
 * 
 * 
 * Input Format First argument is a constant array A.
 * 
 * 
 * 
 * Output Format Return an integer array.
 * 
 * 
 * 
 * Example Input Input 1:
 * 
 * A = [1,2,3,2,1] Input 2:
 * 
 * A = [1,1,10]
 * 
 * 
 * Example Output Output 1:
 * 
 * [1,2,3,2,1] Output 2:
 * 
 * [10,1,1]
 * 
 * 
 * Example Explanation Explanation 1:
 * 
 * Reversed form of input array is same as original array Explanation 2:
 * 
 * Clearly, Reverse of [1,1,10] is [10,1,1]
 * 
 * @author durgaprasad
 *
 */
public class Reversal {
	static ArrayList<Integer>solve(final List<Integer> a) {

		ArrayList<Integer> reverse = new ArrayList<>();
		reverse.addAll(a);
		int len = a.size();
		for (int i = 0; i < (len / 2); i++) {

			int temp = a.get(i);
			reverse.set(i, a.get(len - i - 1));
			reverse.set(len - i - 1, temp);
		}
		return reverse;
	}

	static ArrayList<Integer>solve1(final List<Integer> A) {
		ArrayList<Integer> reverse = new ArrayList<>();
		reverse.addAll(A);
		int len = A.size();
		int i = 0;
		int j = len-1;
		while(i < j) {
			int temp = A.get(i);
			reverse.set(i, A.get(j));
			reverse.set(j, temp);
			i++;
			j--;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(10);input.add(1); input.add(1);
		System.out.println(solve(input));
		System.out.println(solve1(input));
	}
}
