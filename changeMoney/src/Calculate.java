package moneyChange;

public class Calculate {

	int returnMoney;
	int returnKRW;

	public void cal_return_money(double inputKRW,double exchangeRate,String moneyType) {
		double exchange=inputKRW/exchangeRate;
		returnMoney=(int)exchange;
		System.out.printf("환전가능한 금액은 %d %s입니다\n", returnMoney, moneyType);
	}
	
	
	public void cal_return_KRW(double inputKRW, double exchangeRate) {
		returnKRW=(int) (inputKRW - (exchangeRate*returnMoney));
		returnKRW=(int) returnKRW -(returnKRW%10);
	}
}