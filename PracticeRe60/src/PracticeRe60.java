//
import java.util.Scanner;
public class PracticeRe60 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Animal a = new Animal();
		
		System.out.println("Animal ��ü animal�� �����մϴ�.");
		System.out.print("������ �߰��� ������ �Է��ϼ���:");
		a.picture = sc.next();
		System.out.print("�����Ը� �Է��ϼ���:");
		a.setWeight(sc.nextDouble());
		a.eat(); 
		
		Lion l = new Lion();
		
		System.out.println("\n\nLion ��ü buba�� �����մϴ�.");
		System.out.print("������ �߰��� ������ �Է��ϼ���:");
		l.picture = sc.next();
		System.out.print("�����Ը� �Է��ϼ���:");
		l.setWeight(sc.nextDouble());
		l.eat();
		System.out.print(":");
		l.roar();
		
		Eagle e = new Eagle();
		
		System.out.println("\n\nEagle ��ü paco�� �����մϴ�");
		System.out.print("������ �߰��� ������ �Է��ϼ���:");
		e.picture = sc.next();
		System.out.print("�����Ը� �Է��ϼ���:");
		e.setWeight(sc.nextDouble());
		e.sleep();
		System.out.print(":");
		e.fly();
		
		System.out.println("\nAnimal ��ü animal�� �����Դϴ�.");
		System.out.println(a.toString());
		System.out.println("Lion ��ü buba�� �����Դϴ�.");
		System.out.println(l.toString());
		System.out.println("Eagle ��ü paco�� �����Դϴ�. ");
		System.out.println(e.toString());

		sc.close();
	}

}
