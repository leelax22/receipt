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
			    System.out.println("�������. �������Դϴ�. ");
				System.out.println("�����Ͻ� ��ǰ��ȣ�� �Է��ϼ���. ");
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
						System.out.print("�߸��� ��ǰ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
						inputNo=myInput.nextInt();
						rset = stmt.executeQuery("select * from goods where no="+inputNo); 
					}
					
				    	no=rset.getInt(1);
					    product=rset.getString(2);
					    price=rset.getInt(3); 
					    
				    }
			    
				System.out.print("���ż����� ���ڷ� �Է����ּ���. ");
			    inputQuantity=myInput.nextInt();
			    saveData(no,product,price,inputQuantity);
		
				System.out.print("�� �����Ͻ÷��� 1��, �� �Է��ϼ����� 2�� �Է����ּ���.");
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

