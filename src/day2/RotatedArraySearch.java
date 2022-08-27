package day2;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Problem Constraints 1 <= N <= 1000000 1 <= A[i] <= 10^9 all elements in A are
 * distinct.
 * 
 * Input Format The first argument given is the integer array A. The second
 * argument given is the integer B.
 * 
 * Output Format Return index of B in array A, otherwise return -1
 * 
 * Example Input Input 1:
 * 
 * A = [4, 5, 6, 7, 0, 1, 2, 3] B = 4 Input 2:
 * 
 * A = [1] B = 1
 * 
 * 
 * Example Output Output 1:
 * 
 * 0
 * 
 * Output 2:
 * 
 * 0
 * 
 * @author durgaprasad
 *
 */
public class RotatedArraySearch {

	static int search(final List<Integer> a, int b) {
		int rotatedIndex = 0;
		int len = a.size();
		for (int i = 1; i < len; i++) {
			int prev = a.get(i - 1);
			if (prev > a.get(i)) {
				rotatedIndex = i;  // find the index where the list/array is rotated
				break;
			}
		}

		
		
		int rotatedElement = a.get(rotatedIndex);
		int start = 0;
		int end = 0;
		
		//based on the element to be searched fix the start & end indexes
		
		if (rotatedIndex > 0) {
			if(b == rotatedElement) {
				return rotatedIndex;
			}
			if(b < a.get(0) && b <= a.get(len-1)) {  // if element to be searched is in second part of the rotated array
				start = rotatedIndex + 1;
				end = len-1;
			}else if(b < a.get(0) && b >= a.get(len-1)) {  // if element to be searched is not in both parts return -1
				return -1;
			}
			
			else {  //  if element to be searched is in first part of the rotated array
				start = 0; 
				end = rotatedIndex;
			}
			
			
		}
		return binarySearch(a, start, end, b);
	}
	
	static int binarySearch(List<Integer> a, int start, int end, int v) {
		
		while(start <= end) {
			int mid = (start + end)/2;
			int current = a.get(mid);
			if(current == v) {
				return mid;
			}else if(current > v) {
				end = mid -1;
			}else {
				start = mid + 1;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,7,67,133,178};
		System.out.println(search(Arrays.asList(arr), 1));
	}
}
