//
import java.util.Scanner;
public class PracticeRe53 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Movie m0 = new Movie();
		Movie m1 = new Movie();
		
		System.out.println("����Ʈ ��ȭ�� �����Դϴ�.");
		System.out.println(m0.toString());
		
		System.out.println("\n��ȭ������ �Է��ϼ���.");
		System.out.print("��ȭ������? ");
		m1.setTitle(sc.next());
		System.out.print("������? ");
		m1.setDirector(sc.next());
		System.out.print("���۳⵵��? ");
		m1.setYear(sc.nextInt());
		System.out.print("������? ");
		m1.setScore(sc.nextInt());
		
		System.out.println("\n�Է��� ��ȭ�� �����Դϴ�.");
		System.out.println(m1.toString());
		
		sc.close();
	}

}
