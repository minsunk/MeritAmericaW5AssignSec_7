import acm.program.ConsoleProgram;


public class AddCommas extends ConsoleProgram {
	
	private String addCommasToNumericString(String digits){
		String digitsWithCommas = "";
		
		for(int i=0; i < digits.length() ; i++) {
		// copy one character at a time
			digitsWithCommas += digits.charAt(i);
		// determine if comma is to be added
			if(i % 3 == (digits.length()-1) % 3 && i != digits.length()-1) {
				digitsWithCommas += ",";
			}
		}
		return digitsWithCommas;
	}
			
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
			}
	}
}

