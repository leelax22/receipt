package moneyChange;

import java.util.Scanner;


public class Input {
	
	public double exchangeRate;
	public final double EXCHANGE_RATE_USD=1133.1;
	public final double EXCHANGE_RATE_EUR=1349.5;
	public final double EXCHANGE_RATE_JPY=10.26;
	public String moneyType="";
	public double inputKRW;
	public int inputCountry;
	
	public void inputMoney() {
		
		Scanner myInput = new Scanner(System.in);
		System.out.print("환전하실 금액을 입력해주세요(KRW 원 기준)\n");
		inputKRW = myInput.nextDouble();
		
		System.out.print("어느 국가 돈으로 환전하겠습니까?\n1:USD, 2:EUR, 3:JPY");
		inputCountry = myInput.nextInt();
		
		if (inputCountry > 3 || inputCountry <1) {
			while ((inputCountry > 3 || inputCountry <1)) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				System.out.print("어느 돈으로 환전하겠습니까?\n1:USD, 2:EUR, 3:JPY");
				inputCountry = myInput.nextInt();
				myInput.close();
			}
		}
				
		
		
		switch (inputCountry) {
		case 1:
			moneyType="USD";
			exchangeRate=EXCHANGE_RATE_USD;
			break;
		case 2:
			moneyType="EUR";
			exchangeRate=EXCHANGE_RATE_EUR;
			break;
		default :
			moneyType="JPY";
			exchangeRate=EXCHANGE_RATE_JPY;
						
		}
		
	
	}
	
	
	
}
