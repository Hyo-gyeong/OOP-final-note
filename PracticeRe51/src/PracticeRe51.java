//
public class PracticeRe51 {

	public static void main(String[] args) {
		
		Box b0 = new Box();
		Box b1 = new Box();
		Box b2 = new Box(100, 60, 20);
		
		System.out.println("����Ʈ ������ �����Դϴ�.");
		b0.emptyBox(); // �������� empty�� �żҵ�� ���� �ʰ� �����ϴ� ���
		System.out.println(b0.toString());

		b1.setX(30);
		b1.setY(45);
		b1.setZ(53);
		b1.fillBox();
		System.out.println("ù ��° ������ �����Դϴ�.");
		System.out.println(b1.toString());
		
		System.out.println("�� ��° ������ �����Դϴ�.");
		b2.emptyBox();
		System.out.println(b2.toString());
	}

}