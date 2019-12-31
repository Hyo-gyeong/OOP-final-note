package test;

public class Rectangle extends Shape { 
	int width, height;
	public void draw() { // 추상 메소드 구현 
		System.out .println("사각형 그리기 메소드"); 
		}

	/*Rectangle()  {
		super(); // compile error 
	} */
	
	Rectangle(){
		super(0,0); //명시적으로 생성자를 정의해야됨. - 매개변수 없는 생성자는 없기때문에 자바가 만들어주는거는 소용 없음
	}
}
