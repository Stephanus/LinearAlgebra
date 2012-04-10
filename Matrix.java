/**
 * 
 */

import java.io.*;

/**
 * @author Stephanus
 *
 */

public class Matrix {

	/**
	 * Main Class for Matrix Program
	 * @param args Do not worry about it
	 * @return Nothing
	 */
	public static void main(String[] args) throws Exception{


		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the Matrix Program");
		System.out.println("Please enter the size of the matrix");
		String size = key.readLine();
		int[][] ar = build(Integer.parseInt(size));
		printMatrix(ar);


	}

	/**
	 * This method creates the whole array and fills it with 0 values
	 * to avoid a null pointer error
	 * @param x The Size of the Array (Length of the Array)
	 * @return The Array filled with 0 values
	 */
	private static int[][] build(int x){

		int[][] ray = new int[x][x];
		for (int z = 0; z <= x-1; z++){
			for (int y = 0; y <= x-1; y++){
				ray[z][y] = 0;
			}
		}
		return ray;

	}

	/**
	 * This method prints out the Matrix to the screen
	 * @param x The Array of the Matrix
	 */
	private static void printMatrix (int[][] x){
		for (int a = 0; a <= x.length-1; a++){

			for (int z = 0; z <= x.length-1; z ++){
				System.out.print(x[a][z] + " ");
			}
			
			System.out.println("");
		}

	}
	
	/**
	 * This method will calculate the determinate of a given Matrix
	 * @param a The Matrix in Array Form
	 * @return The int value of the determinate
	 */
	private static int det(int[][] a){
		
		int d = 0;
		int sign = 1;
		
		if (a.length == 2){
			
			d = a[0][0] * a[1][1] - a[0][1] * a[1][0];
			
		}
		else{
			
			for (int x = 0; x <= a.length-1; x++){
				
				
				
			}
			
		}
		
		return d;
	}

}
