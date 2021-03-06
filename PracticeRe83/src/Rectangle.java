
public class Rectangle extends Shape{
	private int length, width;
	
	Rectangle(int x, int y){
		super(x, y);
	}
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	
	public void setLength(int l) {
		this.length = l;
	}
	public void setWidth(int w) {
		this.width = w;
	}
	
	@Override
	public double calcArea() {
		return getLength()*getWidth();
	}
	
	@Override
	public String toString() {
		return "타입 : 사각형\n"+super.type+"가로 : "+getWidth()+", 세로 : "+getLength()+", 면적 : "+ calcArea();
	}
}
