//
import java.util.Scanner;
public class PracticeRe56 {

	public static void main(String[] args) {

		Date d1 = new Date();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ��¥�� �Է��ϼ���");
		System.out.print("�⵵ : ");
		d1.setYear(sc.nextInt());
		System.out.print("�� : ");
		d1.setMonth(sc.nextInt());
		System.out.print("�� : ");
		d1.setDay(sc.nextInt());
		
		System.out.println("\n�� ��° ��¥�� �Է��ϼ���");
		System.out.print("�⵵ : ");
		int year = sc.nextInt();
		System.out.print("�� : ");
		int month = sc.nextInt();
		System.out.print("�� : ");
		int day = sc.nextInt();
		Date d2 = new Date(year, month, day);

		int rslt = Date.compareDate(d1, d2);
		if (rslt == -1) {
			System.out.println("ù ��° ��¥�� "+d1.toString()+"�� �ռ� ��¥�Դϴ�.");
		}
		else if (rslt == 0) {
			System.out.println("�� ��¥�� ���� ��¥�Դϴ�.");
		}
		else {
			System.out.println("�� ��° ��§�� "+d2.toString()+"�� �ռ� ��¥�Դϴ�.");
		}
		
		sc.close();
	}

}