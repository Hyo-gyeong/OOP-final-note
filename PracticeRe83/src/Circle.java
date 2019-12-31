
public class Circle extends Shape{
	private int radius;
	
	Circle(int x, int y){
		super(x, y);
	}
	
	public void setRadius(int r) {
		this.radius = r;
	}
	public int getRadius() {
		return this.radius;
	}
	
	@Override
	public double calcArea() {
		return radius*radius*3.14;
	}
	
	@Override
	public String toString() {
		return "타입: 원\n"+super.type+", 반지름: "+radius+", 면적: "+calcArea();
	}
}
