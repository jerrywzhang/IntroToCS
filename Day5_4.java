class Day5_4 {
	public static void main(String[] args) {
		int[] intArray = {9, 8, 7, 6, 5};
		int[][] matrix = {intArray, intArray, intArray};
		
		int[][] mat = {{9, 8, 7, 6, 5},
					   {9, 8, 7, 6, 5},
					   {9, 8, 7, 6, 5}}; // difference between matrix and mat
		System.out.println(mat.length);
		System.out.println(mat[0].length);
		
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[row].length; col++) {
				System.out.println(mat[row][col]);
			}
		}
		
		for (int[] row : mat) { //for each row array in mat
			for (int element : row) {//for each element in this row
				System.out.println(element);
			}
		}
		
		for (int row = 0; row < mat.length; row++) {
			addTen(mat[row]);
			printArr(mat[row]);
		}
		
	}
	
	public static void addTen(int[] arr) { // uses pass as object
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 10;
		}
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}