
public abstract class Shape {
	private int x, y;
	protected String type;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	Shape(int x, int y){
		setX(x);
		setY(y);
		type = "�߽���ǥ :("+this.x+", "+this.y+")";
	}
	public abstract double calcArea();
	
	public abstract String toString();
	//return "Ÿ�� : ����\n�߽���ǥ :("+x+", "+y+")";
	
}
