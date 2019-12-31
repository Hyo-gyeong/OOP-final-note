//
import java.util.Scanner;
public class PracticeRe56 {

	public static void main(String[] args) {

		Date d1 = new Date();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 날짜를 입력하세요");
		System.out.print("년도 : ");
		d1.setYear(sc.nextInt());
		System.out.print("월 : ");
		d1.setMonth(sc.nextInt());
		System.out.print("일 : ");
		d1.setDay(sc.nextInt());
		
		System.out.println("\n두 번째 날짜를 입력하세요");
		System.out.print("년도 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();
		Date d2 = new Date(year, month, day);

		int rslt = Date.compareDate(d1, d2);
		if (rslt == -1) {
			System.out.println("첫 번째 날짜인 "+d1.toString()+"이 앞선 날짜입니다.");
		}
		else if (rslt == 0) {
			System.out.println("두 날짜는 같은 날짜입니다.");
		}
		else {
			System.out.println("두 번째 날짠인 "+d2.toString()+"이 앞선 날짜입니다.");
		}
		
		sc.close();
	}

}
