//
import java.util.Scanner;
public class PracticeRe49 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		Date d2 = new Date();
		
		System.out.print("�¾ �⵵�� �Է��ϼ���: ");
		int year = sc.nextInt();
		d.setYear(year);
		d2.setYear(year+20);
		System.out.print("�¾ ���� �Է��ϼ���: ");
		int month = sc.nextInt();
		d.setMonth(month);
		d2.setMonth(month);
		System.out.print("�¾ ��¥�� �Է��ϼ���: ");
		int day = sc.nextInt();
		d.setDay(day);
		d2.setDay(day);
		
		System.out.print("����� ������ "+d.toString());
		System.out.print("����� �������� "+d2.toString());
		
		sc.close();
	}

}