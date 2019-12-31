
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
		return "Ÿ��: ��\n"+super.type+", ������: "+radius+", ����: "+calcArea();
	}
}