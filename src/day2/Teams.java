package day2;

/**
 * Given a string A, A is made up of 0's and 1's. Break A into substrings such
 * that , all broken substrings have equal number of 1's and 0's.
 * 
 * Find and return maximum number of substrings in which A can be broken.
 * 
 * 
 * Input Format
 * 
 * The only argument given is string A. Output Format
 * 
 * Find and return maximum number of substrings in which A can be broken.
 * Constraints
 * 
 * 1 <= length of A <= 10^5 A will always have equal number of 0's and 1's For
 * Example
 * 
 * Input 1: A = "011100" Output 1: 2 Explanation 1: "01" + "1100"
 * 
 * Input 2: A = "00011011" Output 2: 1 Explanation 2: "00011011"
 * 
 * @author durgaprasad.
 *
 */
public class Teams {
	static  int solve(String a) {
		int count = 0;
		int count0 = 0;
		int count1 = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '0') {
				count0++;
			}else {
				count1++;
			}
			
			if(count0 == count1) {
				count++;
			}
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(solve("011100"));
		System.out.println(solve("00011011"));
		System.out.println(solve("01"));
		System.out.println(solve("00"));
		System.out.println(solve("1"));
	}
}
