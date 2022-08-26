package day2;

import java.util.ArrayList;

/**
 * 
 * 
 * Problem Description Given an integer A, generate a square matrix filled with
 * elements from 1 to A2 in spiral order and return the generated square matrix.
 * 
 * Problem Constraints 1 <= A <= 1000
 * 
 * Input Format First and only argument is integer A Output Format Return a 2-D
 * matrix which consists of the elements added in spiral order.
 * 
 * Example Input Input 1:
 * 
 * 1 Input 2:
 * 
 * 2 Input 3:
 * 
 * 5
 * 
 * 
 * Example Output Output 1:
 * 
 * [ [1] ] Output 2:
 * 
 * [ [1, 2], [4, 3] ] Output 2:
 * 
 * [ [1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21,
 * 8], [13, 12, 11, 10, 9] ]
 * 
 * 
 * for input int a = 5 refer the following explanation
 * 
 * 
 * @author durgaprasad
 *
 */

public class SpiralMatrix {
	
	
	static ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

		int count = 0;
		int maxR = a - 1;
		int minR = 0;
		int minC = 0;
		int maxC = a - 1;
		int[][] arr = new int[a][a];
		int total = a * a;

		while (count < total) {

			for (int i = minC; i <= maxC; i++) {
				arr[minR][i] = ++count;
			}
			minR += 1;

			for (int i = minR; i <= maxR; i++) {
				arr[i][maxC] = ++count;
			}
			maxC -= 1;

			for (int i = maxC; i >= minC; i--) {
				arr[maxR][i] = ++count;
			}
			maxR -= 1;
			
			for(int i = maxR; i >=minR ; i--) {
				arr[i][minC] = ++count;
			}
			minC += 1;
		}

		
		
		for(int i = 0; i < a; i++) {
			ArrayList<Integer> r = new ArrayList<Integer>();
			for(int j = 0 ; j < a; j++) {
				r.add(arr[i][j]);
			}
			
			matrix.add(r);
		}
		
		return matrix;
	}

	public static void main(String[] args) {
		System.out.println(generateMatrix(5));
	}
}
