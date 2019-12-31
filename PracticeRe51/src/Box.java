
public class Box {
	private int x, y, z;
	private boolean empty;
	
	public Box() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.empty = true;
	}
	public Box(int x, int y, int z) {
		setX(x);
		setY(y);
		setZ(z);
		this.empty = false;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getZ() {
		return this.z;
	}
	
	public void fillBox() {
		this.empty = false;
	}
	public void emptyBox() {
		this.empty = true;
	}
	
	public String toString() {
		if (this.empty == false) {
			return "����: "+getX()+"cm\n����: "+getY()+"cm\n����: "+getZ()+"cm\n���� �ڽ����� ������ ��� �ֽ��ϴ�";
		}
		else {
			return "����: "+getX()+"cm\n����: "+getY()+"cm\n����: "+getZ()+"cm\n���� �ڽ��� ��� �ֽ��ϴ�."; 
		}
	}
}