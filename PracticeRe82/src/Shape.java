
public class Shape {
	private int x, y;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public double calcArea() {
		return getX()*getY();
	}
	
	public String toString() {
		return "타입 : 도형\n"+positionStr();
	}
	public String positionStr() {
		return "중심좌표 :("+x+", "+y+")";
	}
}
