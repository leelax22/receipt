package moneyChange;

public class Calculate {

	int returnMoney;
	int returnKRW;

	public void cal_return_money(double inputKRW,double exchangeRate,String moneyType) {
		double exchange=inputKRW/exchangeRate;
		returnMoney=(int)exchange;
		System.out.printf("ȯ�������� �ݾ��� %d %s�Դϴ�\n", returnMoney, moneyType);
	}
	
	
	public void cal_return_KRW(double inputKRW, double exchangeRate) {
		returnKRW=(int) (inputKRW - (exchangeRate*returnMoney));
		returnKRW=(int) returnKRW -(returnKRW%10);
	}
}