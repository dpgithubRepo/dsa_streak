package day3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Problem Description You are given an integer array A. You have to find the
 * second largest element/value in the array or report that no such element
 * exists.
 * 
 * Problem Constraints 1 <= |A| <= 105
 * 
 * 0 <= A[i] <= 109
 * 
 * Input Format The first argument is an integer array A.
 * 
 * Output Format Return the second largest element. If no such element exist
 * then return -1.
 * 
 * 
 * Example Input Input 1:
 * 
 * A = [2, 1, 2] Input 2:
 * 
 * A = [2]
 * 
 * 
 * Example Output Output 1:
 * 
 * 2 Output 2:
 * 
 * -1
 * 
 * @author durgaprasad
 *
 */
public class SecondLargest {
	
	static int solve(ArrayList<Integer>A) {
		
		if(A.size() < 2) return -1;
		Collections.sort(A);
		int len = A.size();
		int max = A.get(len-1);
		
		for(int j = len-2; j >=0; j--) {
			if(A.get(j) != max) {
				return A.get(j);
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(2); input.add(1); input.add(3);
		System.out.println(solve(input));
		
		input = new ArrayList<>();
		input.add(2); input.add(2); input.add(2);
		System.out.println(solve(input));
		
		
		input = new ArrayList<>();
		input.add(2);
		System.out.println(solve(input));
		
	}

}
