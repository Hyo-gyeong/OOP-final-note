package test;

public class Rectangle extends Shape { 
	int width, height;
	public void draw() { // �߻� �޼ҵ� ���� 
		System.out .println("�簢�� �׸��� �޼ҵ�"); 
		}

	/*Rectangle()  {
		super(); // compile error 
	} */
	
	Rectangle(){
		super(0,0); //���������� �����ڸ� �����ؾߵ�. - �Ű����� ���� �����ڴ� ���⶧���� �ڹٰ� ������ִ°Ŵ� �ҿ� ����
	}
}