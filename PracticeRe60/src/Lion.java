
public class Lion extends Animal{
	private int leg = 4;
	
	public int getLeg() {
		return this.leg;
	}
	void roar() {
		System.out.println("roar() 호출되었음.");
	}
	public String toString() {
		 return "몸무게: "+getWeight()+"kg -그림 설명: "+picture+"- 다리 : "+getLeg()+"개\n";
	 }
}
