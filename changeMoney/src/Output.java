package moneyChange;

public class Output {


	
	public void output_return_money_sorted(int inputCountry, int returnMoney) {
		
		if (inputCountry == 1) {
			System.out.println("$100 지폐 " + returnMoney / 100 + "장");
			System.out.println("$50 지폐 " + returnMoney % 100 / 50 + "장");
			System.out.println("$20 지폐 " + returnMoney % 100 % 50 / 20 + "장");
			System.out.println("$10 지폐 " + returnMoney % 100 % 50 % 20 / 10 + "장");
			System.out.println("$5 지폐 " + returnMoney % 100 % 50 % 20 % 10 / 5 + "장");
			System.out.println("$1 지폐 " + returnMoney % 100 % 50 % 20 % 10 % 5 / 1 + "장\n");
		}
		
		else if (inputCountry == 2) {
			System.out.println("\n200유로권 " + (int) returnMoney / 200 + "장");
			System.out.println("100유로권 " + (int) returnMoney % 200 / 100 + "장");
			System.out.println("50유로권 " + (int) returnMoney % 200 % 100 / 50 + "장");
			System.out.println("20유로권 " + (int) returnMoney % 200 % 100 % 50 / 20 + "장");
			System.out.println("10유로권 " + (int) returnMoney % 200 % 100 % 50 % 20 / 10 + "장");
			System.out.println("5유로권 " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 / 5 + "장");
			System.out.println("2유로동전 " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 % 5 / 2 + "개");
			System.out.println("1유로동전 " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + "개\n");
		}
		else {
			System.out.println("\n10000엔권 " + (int) returnMoney / 10000 + "장");
			System.out.println("5000엔권 " + (int) returnMoney % 10000 / 5000 + "장");
			System.out.println("2000엔권 " + (int) returnMoney % 10000 % 5000 / 2000 + "장");
			System.out.println("1000엔권 " + (int) returnMoney % 10000 % 5000 % 2000 / 1000 + "장");
			System.out.println("500엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 1000 / 500 + "개");
			System.out.println("100엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 500 / 100 + "개");
			System.out.println("50엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 / 50 + "개");
			System.out.println("10엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + "개");
			System.out.println("1엔동전 " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + "개\n");	
		}
	}
	
	public void output_return_KRW(int returnKRW,int inputCountry) {
		if (inputCountry !=3) {
			System.out.println("남은 원화는 "+returnKRW+"원입니다.");
			System.out.println("1000원 지폐 " + (int) (returnKRW / 1000) + "장");
			System.out.println("500원 동전 " + (int)(returnKRW % 1000 / 500) + "개");
			System.out.println("100원 동전 " + (int)(returnKRW % 1000 % 500 /100) + "개");
			System.out.println("50원 동전 " + (int)(returnKRW % 1000 % 500 % 100 / 50) + "개");
			System.out.println("10원 동전 " + (int) (returnKRW % 1000 % 500 % 100 % 50 / 10) + "개가 지급됩니다.");
		}
		else {
			System.out.println("엔화 환전시엔 잔액이 남지 않습니다. 감사합니다.");
		}

	
	}
	
	
}
