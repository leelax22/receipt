package receipt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class Input {
	
    int purchaseContinue;
    int no=0, price=0, inputQuantity=0;
    String product="";
    
    
	public void inputNo() {

		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/goodslist", "root" , "123456");
	    Scanner myInput = new Scanner(System.in);
	    
			do {
			    System.out.println("어서오세요. 편의점입니다. ");
				System.out.println("구매하실 상품번호를 입력하세요. ");
				int inputNo;
		
			    inputNo=myInput.nextInt();
			    
			    Statement stmt = conn.createStatement(); 
			    ResultSet rset = stmt.executeQuery("select * from goods where no="+inputNo); 
			    
			    
			    if(rset.next()) {

				    no=rset.getInt(1);
				    product=rset.getString(2);
				    price=rset.getInt(3);
	    		}
			    
			    else {
					while (!rset.next()) {
						System.out.print("잘못된 상품번호입니다. 다시 입력해주세요.");
						inputNo=myInput.nextInt();
						rset = stmt.executeQuery("select * from goods where no="+inputNo); 
					}
					
				    	no=rset.getInt(1);
					    product=rset.getString(2);
					    price=rset.getInt(3); 
					    
				    }
			    
				System.out.print("구매수량을 숫자로 입력해주세요. ");
			    inputQuantity=myInput.nextInt();
			    saveData(no,product,price,inputQuantity);
		
				System.out.print("더 구매하시려면 1을, 다 입력하셨으면 2를 입력해주세요.");
				purchaseContinue=myInput.nextInt();
				
		    }
		    
		    while (purchaseContinue ==1);
			
		}

	    catch(Exception e) {
		e.printStackTrace();
	    }
		
	}

//	 rset.close(); 
//	 stmt.close(); 
//	 conn.close(); 
	
	public ArrayList<dataClass_receipt> arrData = new ArrayList<dataClass_receipt>();
	
	public void saveData(int saveNo, String saveProduct, int savePrice, int saveQuantity) {
		dataClass_receipt item = new dataClass_receipt();
		item.saveNo=no;
		item.saveProduct=product;
		item.savePrice=price;
		item.saveQuantity=inputQuantity;

		arrData.add(item);

	}
	
	

	public void saveDataClear() {
		arrData.clear();


	}
	
}

