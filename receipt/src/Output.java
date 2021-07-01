package receipt;

import java.util.ArrayList;

public class Output {

	int productTotalPrice=0, totalPrice=0, totalQuantity=0;
	
	public void printResult(ArrayList<dataClass_receipt> arrData) {
		

		System.out.println("����� �ູ�� ������ GS25\n");
		System.out.println("GS�α��غ���");
		System.out.printf("%s %20s\n","�ڸ���","8460901198");
		System.out.println("���� ��籺 ������ �α��� 631-9");
		System.out.println("����");
		System.out.printf("%s %s %s %d\n","2020/09/26","��*��","NO:",10588);
		System.out.println("--------------------------");
		System.out.println("*���ι�ħ�� ���� ��ȯ/ȯ����");
		System.out.println("�ݵ�� �������� �����ϼž� �ϸ�,");
		System.out.println("ī������� 30��(10��26��)�̳�");
		System.out.println("ī��� ������ ���� �� �����մϴ�.");
		System.out.println("--------------------------");
		System.out.printf("%-10s\t%5s\t%3s%7s\n", "��ǰ��", "�ܰ�", "����", "�ݾ�");
		
		for (int i=0; i<arrData.size(); i++) {
			productTotalPrice=arrData.get(i).savePrice*arrData.get(i).saveQuantity;
			System.out.printf("%-10s\t%5d\t%3d%7d\n",arrData.get(i).saveProduct,arrData.get(i).savePrice,arrData.get(i).saveQuantity,productTotalPrice);
			totalQuantity+=arrData.get(i).saveQuantity;
			totalPrice+=productTotalPrice;
		}
		
		System.out.printf("%-10s\t��\t%3d%7d\n","�հ�",totalQuantity,totalPrice);
		System.out.println("---------------------------");
		System.out.printf("%s\t\t\t%d\n","��������",(int)(totalPrice*0.95));
		System.out.printf("%s\t\t\t%d\n","�ΰ���",(int)(totalPrice*0.05));
		System.out.printf("%s\t\t\t%d\n","�հ�",totalPrice);
		
		System.out.println("�̿� �����մϴ�. �� �̿��� �ּ���");
		System.out.println();
		System.out.println();

		
		
		
		
		
		
	}
}
