public class Plane {
	private int id, capacity;
	public static int planes = 0;//모든 객체에 공통인 변수
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
		this.model = "모름";
		this.capacity = 0;
		this.planes += 1; 이 코드보다*/
		this(0, 0, "모름");//더 좋음 planes++도 자동!
	}
	public Plane(int id, int capacity, String model) {
		setId(id);
		setCapacity(capacity);
		setModel(model);
		planes++;
	}
	
	public String toString() {
		return "식별번호: "+id+"편\n모델: "+model+"\n승객수: "+capacity+"명";
	}
}