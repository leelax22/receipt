package moneyChange;

public class Main {


	public static void main(String[] args) {

		while (true) {
			
			Input input= new Input();
			Calculate cal= new Calculate();
			Output output = new Output();
			
			input.inputMoney();
			
			cal.cal_return_money(input.inputKRW,input.exchangeRate,input.moneyType);
			
			output.output_return_money_sorted(input.inputCountry,cal.returnMoney);
			
			cal.cal_return_KRW(input.inputKRW,input.exchangeRate);
			output.output_return_KRW(cal.returnKRW,input.inputCountry);
		}
		
		
	}
}