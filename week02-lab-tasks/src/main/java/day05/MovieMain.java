package day05;

public class MovieMain {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Sharks", 1980);
//		Movie movie2 = new Movie("It", 1980);

//		System.out.println(movie.rateMovie(5));
//		System.out.println(movie.rateMovie(3));

		Viewer viewer = new Viewer();
		viewer.watchMovie(movie1, 4);
		viewer.watchMovie(movie1, 5);

		System.out.println(movie1.getAverageRating());
	}
}
