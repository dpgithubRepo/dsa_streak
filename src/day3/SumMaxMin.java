package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Problem Description Given an array A of size N. You need to find the sum of
 * Maximum and Minimum element in the given array.
 * 
 * 
 * Problem Constraints 1 <= N <= 105 -109 <= A[i] <= 109
 * 
 * 
 * Input Format First argument A is an integer array.
 * 
 * 
 * Output Format Return the sum of maximum and minimum element of the array
 * 
 * 
 * Example Input Input 1:
 * 
 * A = [-2, 1, -4, 5, 3] Input 2:
 * 
 * A = [1, 3, 4, 1]
 * 
 * 
 * Example Output Output 1:
 * 
 * 1 Output 2:
 * 
 * 5
 * 
 * @author durgaprasad
 *
 */
public class SumMaxMin {
	
	static int solve(ArrayList<Integer> A) {
		 Collections.sort(A);
		 return A.get(0) + A.get(A.size()-1);
	}
	
	
	static int solve1(ArrayList<Integer> A) {
		
		return A.stream().max(Comparator.comparing(Integer::intValue)).get() + A.stream().min(Comparator.comparing(Integer::intValue)).get();
	}

	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-2); list.add(1);list.add(-4);list.add(5);list.add(3);
		System.out.println(solve(list));
		System.out.println(solve1(list));
	}
}
