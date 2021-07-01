package receipt;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
		while (true) {
			
		Input input = new Input();
	    Output output = new Output();
	    
	    
		input.saveDataClear();

	    input.inputNo();

	    output.printResult(input.arrData);
	    
		}
		
	}

}
