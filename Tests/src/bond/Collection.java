package bond;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection
{
	private Movie[]	movieList;

	public Collection(final String fileName)
	{
		loadData(fileName);
	}

	private void loadData(final String fileName)
	{
		String movieTitle;
		String bondName;
		int yearReleased;
		double movieRating;
		int lengthHours;
		int lengthMinutes;

		try {
			final Scanner inFile = new Scanner(new File(fileName));
			// inFile.useDelimiter(" ");
			final int numReleases = inFile.nextInt();
			movieList = new Movie[numReleases];
			for (int i = 0; i < numReleases; i++) {
				movieTitle = inFile.next();
				bondName = inFile.next();
				yearReleased = inFile.nextInt();
				movieRating = inFile.nextDouble();
				lengthHours = inFile.nextInt();
				lengthMinutes = inFile.nextInt();
				movieList[i] = new Movie(movieTitle, bondName, yearReleased,
						movieRating, lengthHours, lengthMinutes);

			}
			inFile.close();

		} catch (final Throwable t) {
			t.printStackTrace();
		}
	}

	public void displayInfo()
	{
		System.out.printf("%34s%16s%6s%7s%16s\n\n", "Film Title", "Bond Actor",
				"Year", "Rating", "Film Length");

		for (int i = movieList.length - 1; i >= 0; i--) {
			final String output = movieList[i].toString();
			System.out.println(output);
		}
	}

	public void sort()
	{
		sortList(movieList, 0, movieList.length - 1);
	}

	private static void sortList(final Movie[] list, final int first,
			final int last)
	{
		final ArrayList<Movie> arrList = new ArrayList<Movie>();
		for (final Movie aMovie : list) {
			arrList.add(aMovie);
		}
		Collections.sort(arrList);
		for (int i = 0; i < list.length; i++) {
			list[i] = arrList.get(i);
		}

	}

	public static void main(final String[] args)
	{
		final Collection seriesData = new Collection("src/bond/data.dat");
		seriesData.sort();
		seriesData.displayInfo();
	}
}
