//
public class PracticeRe50 {

	public static void main(String[] args) {
		
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		Plane p3 = new Plane(2464737, 150, "���� 747");
		
		System.out.println("����Ʈ ������� �����Դϴ�.");
		System.out.println(p1.toString());
		
		System.out.println("\n������ ������� �����Դϴ�.");
		p2.setId(1030615);
		p2.setModel("���� 737");
		p2.setCapacity(75);
		System.out.println(p2.toString());
		
		System.out.println("\n������ ������� �����Դϴ�.");
		System.out.println(p3.toString());
	}
}
