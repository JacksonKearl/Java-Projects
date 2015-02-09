package perm;

import java.io.*;

public class Permutations {

	public static int factorial(int n) { return (n==1) ? n : n * factorial(n-1); }
	
	public static void main(String[] args) {
		try {
			File file = new File("U:\\git\\Java-Projects\\Tests\\src\\perm\\Output.txt");
			
			FileReader in = new FileReader(file);			
			char[] target = new char[10];
			int size = in.read(target);
			in.close();
			
			FileWriter out = new FileWriter(file);
			
			int numPerms = factorial(size);
			
			//int[][] perms = new int[numPerms][size];
			String[] sPerms = new String[numPerms];
			
			for (int i = 0; i < numPerms; i++) {
				sPerms[i] = "";
				for (int j = 0; j< size; j++) {
					sPerms[i] += target[j];
				}
				out.write(sPerms[i]);
			}
			
			
			
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}