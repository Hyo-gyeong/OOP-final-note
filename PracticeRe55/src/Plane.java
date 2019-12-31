public class Plane {
	private int id, capacity;
	public static int planes = 0;//��� ��ü�� ������ ����
	private String model;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public static int getPlanes() {
		return planes;
	}
	
	public Plane() {
		/*this.id = 0;
		this.model = "��";
		this.capacity = 0;
		this.planes += 1; �� �ڵ庸��*/
		this(0, 0, "��");//�� ���� planes++�� �ڵ�!
	}
	public Plane(int id, int capacity, String model) {
		setId(id);
		setCapacity(capacity);
		setModel(model);
		planes++;
	}
	
	public String toString() {
		return "�ĺ���ȣ: "+id+"��\n��: "+model+"\n�°���: "+capacity+"��";
	}
}