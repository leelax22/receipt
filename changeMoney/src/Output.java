package moneyChange;

public class Output {


	
	public void output_return_money_sorted(int inputCountry, int returnMoney) {
		
		if (inputCountry == 1) {
			System.out.println("$100 ���� " + returnMoney / 100 + "��");
			System.out.println("$50 ���� " + returnMoney % 100 / 50 + "��");
			System.out.println("$20 ���� " + returnMoney % 100 % 50 / 20 + "��");
			System.out.println("$10 ���� " + returnMoney % 100 % 50 % 20 / 10 + "��");
			System.out.println("$5 ���� " + returnMoney % 100 % 50 % 20 % 10 / 5 + "��");
			System.out.println("$1 ���� " + returnMoney % 100 % 50 % 20 % 10 % 5 / 1 + "��\n");
		}
		
		else if (inputCountry == 2) {
			System.out.println("\n200���α� " + (int) returnMoney / 200 + "��");
			System.out.println("100���α� " + (int) returnMoney % 200 / 100 + "��");
			System.out.println("50���α� " + (int) returnMoney % 200 % 100 / 50 + "��");
			System.out.println("20���α� " + (int) returnMoney % 200 % 100 % 50 / 20 + "��");
			System.out.println("10���α� " + (int) returnMoney % 200 % 100 % 50 % 20 / 10 + "��");
			System.out.println("5���α� " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 / 5 + "��");
			System.out.println("2���ε��� " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 % 5 / 2 + "��");
			System.out.println("1���ε��� " + (int) returnMoney % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + "��\n");
		}
		else {
			System.out.println("\n10000���� " + (int) returnMoney / 10000 + "��");
			System.out.println("5000���� " + (int) returnMoney % 10000 / 5000 + "��");
			System.out.println("2000���� " + (int) returnMoney % 10000 % 5000 / 2000 + "��");
			System.out.println("1000���� " + (int) returnMoney % 10000 % 5000 % 2000 / 1000 + "��");
			System.out.println("500������ " + (int) returnMoney % 10000 % 5000 % 2000 % 1000 / 500 + "��");
			System.out.println("100������ " + (int) returnMoney % 10000 % 5000 % 2000 % 500 / 100 + "��");
			System.out.println("50������ " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 / 50 + "��");
			System.out.println("10������ " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + "��");
			System.out.println("1������ " + (int) returnMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + "��\n");	
		}
	}
	
	public void output_return_KRW(int returnKRW,int inputCountry) {
		if (inputCountry !=3) {
			System.out.println("���� ��ȭ�� "+returnKRW+"���Դϴ�.");
			System.out.println("1000�� ���� " + (int) (returnKRW / 1000) + "��");
			System.out.println("500�� ���� " + (int)(returnKRW % 1000 / 500) + "��");
			System.out.println("100�� ���� " + (int)(returnKRW % 1000 % 500 /100) + "��");
			System.out.println("50�� ���� " + (int)(returnKRW % 1000 % 500 % 100 / 50) + "��");
			System.out.println("10�� ���� " + (int) (returnKRW % 1000 % 500 % 100 % 50 / 10) + "���� ���޵˴ϴ�.");
		}
		else {
			System.out.println("��ȭ ȯ���ÿ� �ܾ��� ���� �ʽ��ϴ�. �����մϴ�.");
		}

	
	}
	
	
}
