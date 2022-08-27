package day2;

/**
 * 
 * Problem Description
 * 
 * Given a string A consisting of lowercase characters.
 * 
 * We need to tell minimum characters to be appended (insertion at end) to make
 * the string A a palindrome.
 * 
 * 
 * Problem Constraints
 * 
 * 1 <= |A| <= 105
 * 
 * A consists only of lower-case characters.
 * 
 * Input Format
 * 
 * First argument is an string A.
 * 
 * Output Format
 * 
 * Return a integer denoting the minimum characters to be appended (insertion at
 * end) to make the string A a palindrome.
 * 
 * @author durgaprasad
 *
 */
public class MinAmendPalindrome {

	static int solve(String a) {
		int count = 0;
		for(int i = 0; i < a.length(); i++) {
			if(isPalindrome(a.substring(i))) {
				return i;
			}
		}
		return count;
	}

	static boolean isPalindrome(String a) {
		
		for(int i = 0, j =a.length()-1; i < j; i++,j-- ) {
			if(a.charAt(i) != a.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(solve("abede"));
		System.out.println(solve("aabb"));
		System.out.println(solve("madam"));
		System.out.println(solve("mada"));
		System.out.println(solve("malaya"));
	}

}
