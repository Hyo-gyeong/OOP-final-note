//
public class PracticeRe51 {

	public static void main(String[] args) {
		
		Box b0 = new Box();
		Box b1 = new Box();
		Box b2 = new Box(100, 60, 20);
		
		System.out.println("디폴트 상자의 정보입니다.");
		b0.emptyBox(); // 생성자의 empty를 매소드로 주지 않고 정의하는 방법
		System.out.println(b0.toString());

		b1.setX(30);
		b1.setY(45);
		b1.setZ(53);
		b1.fillBox();
		System.out.println("첫 번째 상자의 정보입니다.");
		System.out.println(b1.toString());
		
		System.out.println("두 번째 상자의 정보입니다.");
		b2.emptyBox();
		System.out.println(b2.toString());
	}

}
