//
import java.util.Scanner;
public class PracticeRe55 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Plane p0 = new Plane();
		
		System.out.println("������ ������� ������ �Է��ϼ���.");
		System.out.print("�ĺ���ȣ: ");
		p0.setId(sc.nextInt());
		System.out.print("��: ");
		p0.setModel(sc.next());
		System.out.print("�°���: ");
		p0.setCapacity(sc.nextInt());
		System.out.println("������ ������� �����Դϴ�. ");
		System.out.println(p0.toString());
		System.out.println("������� �߰��� ������ ��� "+Plane.getPlanes()+"���Դϴ�."); //p0.getPlanes()(x) -> public static int planes
		
		System.out.println("\n������ ������� ������ �Է��ϼ���.");
		System.out.print("�ĺ���ȣ: ");
		int id = sc.nextInt();
		System.out.print("��: ");
		String model = sc.next();
		System.out.print("�°���: ");
		int capacity = sc.nextInt();
		System.out.println("������ ������� �����Դϴ�. ");
		Plane p1 = new Plane(id, capacity, model);
		System.out.println(p1.toString());
		System.out.println("������� �߰��� ������ ��� "+Plane.getPlanes()+"���Դϴ�.");
		
		sc.close();
	}
}