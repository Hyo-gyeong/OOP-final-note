//
import java.util.Scanner;
public class PracticeRe49 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		Date d2 = new Date();
		
		System.out.print("태어난 년도를 입력하세요: ");
		int year = sc.nextInt();
		d.setYear(year);
		d2.setYear(year+20);
		System.out.print("태어난 월을 입력하세요: ");
		int month = sc.nextInt();
		d.setMonth(month);
		d2.setMonth(month);
		System.out.print("태어난 날짜를 입력하세요: ");
		int day = sc.nextInt();
		d.setDay(day);
		d2.setDay(day);
		
		System.out.print("당신의 생일은 "+d.toString());
		System.out.print("당신의 성년일은 "+d2.toString());
		
		sc.close();
	}

}
