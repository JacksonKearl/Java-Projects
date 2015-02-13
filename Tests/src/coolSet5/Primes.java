package coolSet5;

public class Primes {

	public static void main(String[] args) {
		int amt = 200;
		boolean[] arr = new boolean[amt];
		for (int i = 0; i< amt; i++) { arr[i] = true; };
		for (int i = 2; i< amt; i++) {
			if (arr[i]) {
				for (int iter = 2*i; iter < amt; iter += i) {
					arr[iter] = false;
				}
			}
			
		}
		String retVal = "";
		for (int i = 1; i < amt; i++) {
			if (arr[i]) {
				retVal += i + " ";
			}
		}
		System.out.println(retVal);

	}

}
