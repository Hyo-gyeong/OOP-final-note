//static 이해
import java.util.Scanner;
public class PracticeRe58 {
	
	public static void main (String[] args) {
		
		BankAccount b0 = new BankAccount("김동덕", 100, 3.1);
		BankAccount b1 = new BankAccount("홍길동", 2000, 2.15);
		BankAccount b2 = new BankAccount("성춘향", 500, 2.05);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("은행 계좌 모두의 정보입니다. ");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("\n계좌 "+b0.getAccountNo()+"에 입금할 금액을 입력하세요: ");
		int deM = sc.nextInt();
		if (b0.deposit(deM) == true) {
			System.out.println("입금에 성공했습니다.");
		}
		else {
			System.out.println("입금에 실패했습니다.");
		}
		
		System.out.println("\n은행 계좌 모두의 정보입니다. ");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("\n계좌 "+b1.getAccountNo()+"에서 출금할 금액을 입력하세요: ");
		int wiM = sc.nextInt();
		if (b1.withdraw(wiM) == true) {
			System.out.println("출금에 성공했습니다.");
		}
		else {
			System.out.println("출금에 실패했습니다.");
		}
		
		System.out.println("\n은행 계좌 모두의 정보입니다. ");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.print("계좌 "+b1.getAccountNo()+"에서 계좌 "+b2.getAccountNo()+"으로 송금할 금액을 입력하세요.");
		int sendM = sc.nextInt();
		
		if (BankAccount.transfer(b1, b2, sendM) == true) {
			System.out.println("송금이 성공했습니다.");
		}
		else {
			System.out.println("송금이 실패했습니다.");
		}
		
		System.out.println("\n은행 계좌 모두의 정보입니다. ");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		sc.close();
	}
}