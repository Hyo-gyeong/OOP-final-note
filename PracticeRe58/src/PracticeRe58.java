//static ����
import java.util.Scanner;
public class PracticeRe58 {
	
	public static void main (String[] args) {
		
		BankAccount b0 = new BankAccount("�赿��", 100, 3.1);
		BankAccount b1 = new BankAccount("ȫ�浿", 2000, 2.15);
		BankAccount b2 = new BankAccount("������", 500, 2.05);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� ����� �����Դϴ�. ");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("\n���� "+b0.getAccountNo()+"�� �Ա��� �ݾ��� �Է��ϼ���: ");
		int deM = sc.nextInt();
		if (b0.deposit(deM) == true) {
			System.out.println("�Աݿ� �����߽��ϴ�.");
		}
		else {
			System.out.println("�Աݿ� �����߽��ϴ�.");
		}
		
		System.out.println("\n���� ���� ����� �����Դϴ�. ");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("\n���� "+b1.getAccountNo()+"���� ����� �ݾ��� �Է��ϼ���: ");
		int wiM = sc.nextInt();
		if (b1.withdraw(wiM) == true) {
			System.out.println("��ݿ� �����߽��ϴ�.");
		}
		else {
			System.out.println("��ݿ� �����߽��ϴ�.");
		}
		
		System.out.println("\n���� ���� ����� �����Դϴ�. ");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("���� "+b1.getAccountNo()+"���� ���� "+b2.getAccountNo()+"���� �۱��� �ݾ��� �Է��ϼ���.");
		int sendM = sc.nextInt();
		
		if (BankAccount.transfer(b1, b2, sendM) == true) {
			System.out.println("�۱��� �����߽��ϴ�.");
		}
		else {
			System.out.println("�۱��� �����߽��ϴ�.");
		}
		
		System.out.println("\n���� ���� ����� �����Դϴ�. ");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		sc.close();
	}
}