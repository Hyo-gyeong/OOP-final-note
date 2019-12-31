//문자열 비교 - a.equals(b)사용
import java.util.Scanner;
public class PracticeRe57 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie m0 = new Movie();
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		
		System.out.println("영화 정보를 입력하세요.");
		System.out.print("영화제목은?");
		m0.setTitle(sc.next());
		System.out.print("감독은?");
		m0.setDirector(sc.next());
		System.out.print("제작사는? ");
		m0.setProduction(sc.next());
		
		System.out.println("\n영화 정보를 입력하세요.");
		System.out.print("영화제목은?");
		m1.setTitle(sc.next());
		System.out.print("감독은?");
		m1.setDirector(sc.next());
		System.out.print("제작사는? ");
		m1.setProduction(sc.next());
		
		System.out.println("\n영화 정보를 입력하세요.");
		System.out.print("영화제목은?");
		m2.setTitle(sc.next());
		System.out.print("감독은?");
		m2.setDirector(sc.next());
		System.out.print("제작사는? ");
		m2.setProduction(sc.next());
		
		System.out.println("\n"+m0.toString());
		System.out.println("\n"+m1.toString());
		System.out.println("\n"+m2.toString());
		
		System.out.println("\n"+Movie.compareMovies(m0, m1));
		System.out.println(Movie.compareMovies(m0, m2));
		System.out.println(Movie.compareMovies(m1, m2));
		sc.close();
	}
}