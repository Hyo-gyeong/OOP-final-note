//
import java.util.Scanner;
public class PracticeRe60 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Animal a = new Animal();
		
		System.out.println("Animal 객체 animal을 생성합니다.");
		System.out.print("사진에 추가할 문장을 입력하세요:");
		a.picture = sc.next();
		System.out.print("몸무게를 입력하세요:");
		a.setWeight(sc.nextDouble());
		a.eat(); 
		
		Lion l = new Lion();
		
		System.out.println("\n\nLion 객체 buba를 생성합니다.");
		System.out.print("사진에 추가할 문장을 입력하세요:");
		l.picture = sc.next();
		System.out.print("몸무게를 입력하세요:");
		l.setWeight(sc.nextDouble());
		l.eat();
		System.out.print(":");
		l.roar();
		
		Eagle e = new Eagle();
		
		System.out.println("\n\nEagle 객체 paco를 생성합니다");
		System.out.print("사진에 추가할 문장을 입력하세요:");
		e.picture = sc.next();
		System.out.print("몸무게를 입력하세요:");
		e.setWeight(sc.nextDouble());
		e.sleep();
		System.out.print(":");
		e.fly();
		
		System.out.println("\nAnimal 객체 animal의 정보입니다.");
		System.out.println(a.toString());
		System.out.println("Lion 객체 buba의 정보입니다.");
		System.out.println(l.toString());
		System.out.println("Eagle 객체 paco의 정보입니다. ");
		System.out.println(e.toString());

		sc.close();
	}

}
