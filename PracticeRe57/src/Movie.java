import java.util.Random;
public class Movie 
{ 
	Random r = new Random();
	
	private String title, director, production; 
	private int mid, score, year;

	public Movie() {
		makeID();
		setDirector("모름");
		setTitle("모름");
		setYear(-1);
		setScore(-1);
	}

	public void setMid(int mid) {
		this.mid = mid;
	}
	public void setTitle(String a){
		title = a;
	}
	public void setDirector(String b){
		director = b;
	}
	public void setScore(int c){
		score = c;
	}
	public void setYear(int d){
		year = d;
	}
	public void setProduction(String p) {
		this.production = p;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getDirector() {
		return this.director;
	}
	public int getScore() {
		return this.score;
	}
	public int getYear() {
		return this.year;
	}
	public int getMid() {
		setMid(r.nextInt(9000)+1000);
		return this.mid;
	}
	public String getProduction() {
		return this.production;
	}
	
	private String makeID() {
		int r1 = getMid();
		int r2 = getMid();
		return r1+"-"+r2;
	}
	
	public String toString() {
		return "번호: "+makeID()+"\n제목: "+getTitle()+"\n감독: "+getDirector()+"\n제작사: "+getProduction();
	}
	
	private static boolean compareDirector(Movie x, Movie y) {
		if (x.director.equals(y.director) == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private static boolean compareProduction(Movie x, Movie y) {
		if (x.production.contentEquals(y.production) == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String compareMovies(Movie x, Movie y) {
		if (compareDirector(x, y) == true) {
			 if (compareProduction(x, y) == true) {
				 return "감독이 같고 제작사도 같습니다.";
			 }
			 else {
				 return "감독이 같고 제작사가 다릅니다.";
			 }
		}
		else {
			if (compareProduction(x, y) == true) {
				return "감독이 다르고 제작사가 같습니다.";
			}
			else {
				return "감독이 다르고 제작사도 다릅니다.";
			}
		}
	}
}