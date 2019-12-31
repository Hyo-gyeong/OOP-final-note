//��ǻ���а� 20190975 ��ȿ��
public class Graduate extends Student{
	private String lab;
	
	Graduate() {	//�ʱ�ȭ
		super();
		this.lab = "";
	}
	Graduate(int id, double gpa, String lab) {
		super(id, 100, gpa);
		this.lab = lab;
	}
	@Override
	public int calcScholarship() {
		if (getGpa() >= 3.5)
			return (int)(getTuition() * 0.5);
		else
			return (int)(getTuition() * 0.3);
	}
	public String toString() {
		return "�й�: "+getId()+", ��ϱ�: "+getTuition()+", ��յ��: "+getGpa()+
				", ���б�: "+calcScholarship()+", ������: "+lab;
	}
}