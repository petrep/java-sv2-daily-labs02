package day05;

public class Movie {
	private String title;
	private int year;
	private double averageRating;
	private int ratingCount;
	private int ratingSum;

	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public double rateMovie(int rating) {
		ratingCount = getRatingCount();
//		if (ratingCount == 0) return rating;
		ratingSum += rating;
		ratingCount++;
		averageRating = (ratingSum * 1.0) / ratingCount;
		return averageRating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	public int getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(int ratingCount) {
		this.ratingCount = ratingCount;
	}

	public int getRatingSum() {
		return ratingSum;
	}

	public void setRatingSum(int ratingSum) {
		this.ratingSum = ratingSum;
	}
}
