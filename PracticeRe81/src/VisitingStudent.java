
public class VisitingStudent extends Student{
	
	VisitingStudent(int id, double gpa){
		super(id, 100, gpa);
	}
	@Override
	public int calcScholarship() {
		return 0;
	}
}
