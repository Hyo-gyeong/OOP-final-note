
public class Triangle extends Shape{

	private int base, height;
	
	public int getBase() {
		return this.base;
	}
	public int getHeight() {
		return this.height;
	}
	
	public void setBase(int l) {
		this.base = l;
	}
	public void setHeight(int w) {
		this.height = w;
	}
	
	@Override
	public double calcArea() {
		return getBase()*getHeight()/2;
	}
	
	@Override
	public String toString() {
		return "Ÿ�� : �ﰢ��\n"+super.positionStr()+"�غ� : "+getBase()+", ���� : "+getHeight()+", ���� : "+ calcArea();
	}
}