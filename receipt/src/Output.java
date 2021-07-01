package receipt;

import java.util.ArrayList;

public class Output {

	int productTotalPrice=0, totalPrice=0, totalQuantity=0;
	
	public void printResult(ArrayList<dataClass_receipt> arrData) {
		

		System.out.println("가까운 행복을 만나다 GS25\n");
		System.out.println("GS인구해변점");
		System.out.printf("%s %20s\n","박명자","8460901198");
		System.out.println("강원 양양군 현남면 인구리 631-9");
		System.out.println("번지");
		System.out.printf("%s %s %s %d\n","2020/09/26","박*자","NO:",10588);
		System.out.println("--------------------------");
		System.out.println("*정부방침에 의해 교환/환불은");
		System.out.println("반드시 영수증을 지참하셔야 하며,");
		System.out.println("카드결제는 30일(10월26일)이내");
		System.out.println("카드와 영수증 지참 시 가능합니다.");
		System.out.println("--------------------------");
		System.out.printf("%-10s\t%5s\t%3s%7s\n", "상품명", "단가", "수량", "금액");
		
		for (int i=0; i<arrData.size(); i++) {
			productTotalPrice=arrData.get(i).savePrice*arrData.get(i).saveQuantity;
			System.out.printf("%-10s\t%5d\t%3d%7d\n",arrData.get(i).saveProduct,arrData.get(i).savePrice,arrData.get(i).saveQuantity,productTotalPrice);
			totalQuantity+=arrData.get(i).saveQuantity;
			totalPrice+=productTotalPrice;
		}
		
		System.out.printf("%-10s\t　\t%3d%7d\n","합계",totalQuantity,totalPrice);
		System.out.println("---------------------------");
		System.out.printf("%s\t\t\t%d\n","과세매출",(int)(totalPrice*0.95));
		System.out.printf("%s\t\t\t%d\n","부가세",(int)(totalPrice*0.05));
		System.out.printf("%s\t\t\t%d\n","합계",totalPrice);
		
		System.out.println("이용 감사합니다. 또 이용해 주세요");
		System.out.println();
		System.out.println();

		
		
		
		
		
		
	}
}
