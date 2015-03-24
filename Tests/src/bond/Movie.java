package bond;

public class Movie implements Comparable<Movie>
{
	private final String	myTitle;					// title of Bond film
	private final String	myBondActor;			// name of actor who portrayed James
	// Bond
	private final int			myYear;					// year film was released
	private final double	myFilmRating;		// from all-reviews.com
	private final int			myLengthHours;		// hours (truncated) portion of film
	// length
	private final int			myLengthMinutes;	// minutes beyond truncated hours

	public Movie(final String title, final String name, final int yr,
			final double rating, final int hrs, final int min)
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
	public int compareTo(final Movie other)
	{
		return other.getYearFilmReleased() - this.getYearFilmReleased();
	}

	@Override
	public String toString()
	{
		return String.format("%34s%16s%6s%7s%16s", myTitle, myBondActor, myYear,
				myFilmRating, myLengthHours + " hr " + myLengthMinutes + " min");

	}
}