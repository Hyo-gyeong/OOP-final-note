//난수생성
import java.util.Random;
public class PracticeRe52 {

	public static void main(String[] args) {
		Random rn = new Random();
		int c1 = 0;
		int c2 = 0;
		
		for (int i = 1; i <= 10000; i++) {
			int randNum = rn.nextInt(9000)+1000; //: 1000~9999 // 정수 랜덤으로 변수에 넣음, ()안의 나머지 + 밖같 수 
			
			if (randNum == 1000) {
				System.out.print(randNum+"*****  ");
				c1++;
			}
			else if (randNum == 9999) {
				System.out.print(randNum+"+++++  ");
				c2++;
			}
			else {
				System.out.print(randNum+"       ");
			}
			
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("# of 1000: "+c1);
		System.out.println("# fo 9999: "+c2);
		
	}

}
