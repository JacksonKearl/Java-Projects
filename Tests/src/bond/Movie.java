package bond;

public class Movie implements Comparable<Movie>
{
	private String	myTitle;					// title of Bond film
	private String	myBondActor;			// name of actor who portrayed James Bond
	private int			myYear;					// year film was released
	private double	myFilmRating;		// from all-reviews.com
	private int			myLengthHours;		// hours (truncated) portion of film length
	private int			myLengthMinutes;	// minutes beyond truncated hours

	public Movie(String title, String name, int yr, double rating, int hrs,
			int min)
	{
		myTitle = title;
		myBondActor = name;
		myYear = yr;
		myFilmRating = rating;
		myLengthHours = hrs;
		myLengthMinutes = min;
	}

	public String getTitle()
	{
		return myTitle;
	}

	public String getBondActor()
	{
		return myBondActor;
	}

	public int getYearFilmReleased()
	{
		return myYear;
	}

	public double getFilmRating()
	{
		return myFilmRating;
	}

	public int getFilmHrs()
	{
		return myLengthHours;
	}

	public int getFilmMin()
	{
		return myLengthMinutes;
	}

	@Override
	public int compareTo(Movie other)
	{
		return (int) (myFilmRating * 10) - (int) (((other).myFilmRating) * 10);
	}

	@Override
	public String toString()
	{
		return String
				.format("%34s%16s%6s%7s%16s\n\n", myTitle, myBondActor, myYear,
						myFilmRating, myLengthHours + " hr " + myLengthMinutes + " min");

	}
}