
public class Program {
	public static void main(String[] args) {
		int[][] matrix = {
				{ 100, 32, 123 },
				{ 55, 471, 263 },
				{ 891, 229, 47 }
		};
		
		for (int i = 0; i < matrix.length; i++) {
			int min = Integer.MAX_VALUE;
			
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
			
			System.out.print("min = " + min + "\t");
			
			for (int j = 0; j < matrix[i].length; j++) {
				if (min != 0) {
					System.out.print(roundAvoid(matrix[i][j] / (double)min, 2) + " ");
				}
				else {
					System.out.print(0 + " ");
				}
			}
			
			System.out.println();
		}
	}
	
	public static double roundAvoid(double value, int places) {
	    double scale = Math.pow(10, places);
	    return Math.round(value * scale) / scale;
	}
}
