package day1;

/**
 * 
 * Given two integers A and B. A represents the count of mangoes and B represent
 * the count of slices of mangoes. Mango can be cut into three slices of
 * mangoes. A glass of mango shake can be formed by two slices of mangoes.
 * 
 * Find the maximum number of glasses of mango shakes you can make with A
 * mangoes and B slices of mangoes initially.
 * 
 * 
 * Input Format
 * 
 * The First argument is an integer A. The Second argument is an integer B.
 * Output Format
 * 
 * Return the maximum number of glasses of mango shakes you can make.
 * Constraints
 * 
 * 0 <= A, B <= 10^8
 * 
 * 
 * @author durgaprasad
 *
 */
public class MakeIt {

	static int solve(int a, int b) {
	
		int totalSlices = a * 3 + b;

		return totalSlices / 2;
	}
	
	public static void main(String[] args) {
		System.out.println(solve(19,0));
		System.out.println(solve(7,1));
		System.out.println(solve(19,1));
	}
}
