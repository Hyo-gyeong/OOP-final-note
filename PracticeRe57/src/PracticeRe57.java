//���ڿ� �� - a.equals(b)���
import java.util.Scanner;
public class PracticeRe57 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie m0 = new Movie();
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		
		System.out.println("��ȭ ������ �Է��ϼ���.");
		System.out.print("��ȭ������?");
		m0.setTitle(sc.next());
		System.out.print("������?");
		m0.setDirector(sc.next());
		System.out.print("���ۻ��? ");
		m0.setProduction(sc.next());
		
		System.out.println("\n��ȭ ������ �Է��ϼ���.");
		System.out.print("��ȭ������?");
		m1.setTitle(sc.next());
		System.out.print("������?");
		m1.setDirector(sc.next());
		System.out.print("���ۻ��? ");
		m1.setProduction(sc.next());
		
		System.out.println("\n��ȭ ������ �Է��ϼ���.");
		System.out.print("��ȭ������?");
		m2.setTitle(sc.next());
		System.out.print("������?");
		m2.setDirector(sc.next());
		System.out.print("���ۻ��? ");
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