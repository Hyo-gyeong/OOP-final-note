
public class Eagle extends Animal{
	private int wings = 2;
	
	public int getWings() {
		return this.wings;
	}
	void fly() {
		System.out.println("fly() 호출되었음.");
	}
	public String toString() {
		 return "몸무게: "+getWeight()+"kg - 그림 설명: "+picture+"- 날개 :"+getWings()+"개\n";
	 }
}