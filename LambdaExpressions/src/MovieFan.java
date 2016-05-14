
public class MovieFan {

	private String name;
	private String favoriteFilmType;
	private int numberOfFilmsWatched;
	private boolean hollywoodMoviefan;

	public MovieFan(String name, String favoriteFilmType, int numberOfFilmsWatched, boolean hollywoodMoviefan) {
		this.name = name;
		this.favoriteFilmType = favoriteFilmType;
		this.numberOfFilmsWatched = numberOfFilmsWatched;
		this.hollywoodMoviefan = hollywoodMoviefan;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteFilmType() {
		return favoriteFilmType;
	}

	public void setFavoriteFilmType(String favoriteFilmType) {
		this.favoriteFilmType = favoriteFilmType;
	}

	public int getNumberOfFilmsWatched() {
		return numberOfFilmsWatched;
	}

	public void setNumberOfFilmsWatched(int numberOfFilmsWatched) {
		this.numberOfFilmsWatched = numberOfFilmsWatched;
	}

	public boolean isHollywoodMoviefan() {
		return hollywoodMoviefan;
	}

	public void setHollywoodMoviefan(boolean hollywoodMoviefan) {
		this.hollywoodMoviefan = hollywoodMoviefan;
	}

	
	
	
}
