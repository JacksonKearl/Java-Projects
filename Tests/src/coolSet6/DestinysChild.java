package coolSet6;

import java.util.ArrayList;

public class DestinysChild {
	public static void main(String[] args) {
		String teenIdol = "Mr. Dominguez";
		String sucks = "Kelly";
		ArrayList<String> band = new ArrayList<String>();
		band.add("Michelle");
		band.add("Kelly");
		band.add("Beyonce");
		band.add("Farrah");
		System.out.println("Destiny's Child: " + "\t" + band);
		// on the section below (the section you have to write) I used
		// the following ArrayList methods: get, indexOf, remove, add.
		// You’ll definitely have to use some of these methods but you decide
		// which and how you use them.

		// Able to use indexOf because in Java strings with same content are
		// stored in same location
		String sackedMember = band.remove((band.indexOf(sucks)));
		band.add(teenIdol);

		System.out.println("\nThe fans have decided that " + sackedMember
				+ " is not cutting it and " + "\n"
				+ "have sacked her in favor of up-and-coming new teen idol, "
				+ band.get(band.indexOf(teenIdol)) + "." + "\n\n"
				+ "The new Destiny's Child is:");
		for (int k = 0; k < band.size(); k++)
			System.out.println("\t\t\t\t" + band.get(k));
		// System.out.println("Size of the band: " + band.size());
	}
}