//
public class PracticeRe54 {

	public static void main(String[] args) {
		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount("�赿��", 100);
		BankAccount b2 = new BankAccount("ȫ�浿", 2000, 2.15);

		System.out.println("ù ��° ���� ������ �����Դϴ�. ");
		System.out.println(b0.toString());
		System.out.println("\n�� ��° ���� ������ �����Դϴ�. ");
		System.out.println(b1.toString());
		System.out.println("\n�� ��° ���� ������ �����Դϴ�. ");
		System.out.println(b2.toString());
	}

}
