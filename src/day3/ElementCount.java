package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Problem Description Given an array A of N integers. Count the number of
 * elements that have at least 1 elements greater than itself.
 * 
 * 
 * Problem Constraints 1 <= N <= 105 1 <= A[i] <= 109
 * 
 * 
 * Input Format First and only argument is an array of integers A.
 * 
 * 
 * Output Format Return the count of elements.
 * 
 * 
 * Example Input Input 1: A = [3, 1, 2] Input 2: A = [5, 5, 3]
 * 
 * 
 * Example Output Output 1: 2 Output 2: 1
 * 
 * 
 * Example Explanation Explanation 1: The elements that have at least 1 element
 * greater than itself are 1 and 2 Explanation 2: The elements that have at
 * least 1 element greater than itself is 3
 * 
 * @author durgaprasad
 *
 */
public class ElementCount {
	static int solve(ArrayList<Integer> A) {
		int count = 0;
		int max = Integer.MIN_VALUE;
		int len = A.size();
		for (int i = 0; i < len; i++) {
			int curr = A.get(i);
			max = max < curr ? curr : max;
		}

		for (int i : A) {
			if (i == max)
				count++;
		}

		return len - count;
	}
	
	
	static int solve1(ArrayList<Integer> A) {
		int count = 1;
		Collections.sort(A);
		int len = A.size();
		int max = A.get(len-1);
		for(int i = len-2; i >=0; i--) {
			if(max != A.get(i)) {
				break;
			}else {
				count++;
			}
			
		}
		return len-count ;
	}
	
	
	static int solve3(ArrayList<Integer> A) {
		
		int max = A.stream().max(Comparator.comparing(Integer::intValue)).get();
		int count = (int) A.stream().filter(n -> (n==max)).count();
		return A.size() - count;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> input = new ArrayList<>();
		input.add(3);
		input.add(1);
		input.add(2);
		
		System.out.println(solve(input));
		System.out.println(solve1(input));
		System.out.println(solve3(input));
	}
}
