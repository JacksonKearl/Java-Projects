package coolSet7;

public class Triangle
{
	public static final int HEIGHT = 10;
	public static void main(String[] args)
	{
		int[][] arr = new int[HEIGHT][];
		arr[0] = new int[1];
		arr[0][0] = 1;
		for (int i = 1; i < HEIGHT; i++) {
			arr[i] = new int[i+1];
			arr[i][0] = 1;
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
			arr[i][i] = 1;
		}
		
		for (int i = 0 ; i < HEIGHT; i++) {
			String str = "";
			for (int j = 0; j <= i; j++) {
				str += arr[i][j] + " ";
			}
			String formatString = "%" + (40-str.length()/2) + "s%s";
			System.out.printf(formatString, "", str);
			System.out.println();
		}
		
	}

}
