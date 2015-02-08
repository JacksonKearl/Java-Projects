package Tests;

public class tests {
	public static void main(String[] args){
		int[][] arr = new int [9][9];

		for (int i = 0; i < 9; i++) {
			arr[i][0] = 1;
			arr[0][i] = 1;
		}
		
		for (int i = 1; i< 9; i++) {
			for (int j = 1; j < 9; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		System.out.println(arr[4][4]);
		
	}
}
