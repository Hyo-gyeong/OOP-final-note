import java.util.Random;
public class Movie 
{ 
	Random r = new Random();
	
	private String title, director; 
	private int mid, score, year;

	public Movie() {
		makeID();
		setDirector("��");
		setTitle("��");
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
	
	private String makeID() {
		int r1 = getMid();
		int r2 = getMid();
		return r1+"-"+r2;
	}
	
	public String toString() {
		return "��ȣ: "+makeID()+"\n����: "+title+"\n����: "+director+"\n���۳⵵: "+year+"\n����: "+score;
	}
}