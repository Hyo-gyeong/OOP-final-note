//
public class PracticeRe50 {

	public static void main(String[] args) {
		
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		Plane p3 = new Plane(2464737, 150, "보잉 747");
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println(p1.toString());
		
		System.out.println("\n제주행 비행기의 정보입니다.");
		p2.setId(1030615);
		p2.setModel("보잉 737");
		p2.setCapacity(75);
		System.out.println(p2.toString());
		
		System.out.println("\n서울행 비행기의 정보입니다.");
		System.out.println(p3.toString());
	}
}
