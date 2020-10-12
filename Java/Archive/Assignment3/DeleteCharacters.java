import acm.program.ConsoleProgram;


public class DeleteCharacters extends ConsoleProgram {
	public String removeAllOccurrences(String str, char ch){
		String targetStr = "";
		for(int i=0; i < str.length();i++) {
			if (str.charAt(i) != ch) {
				targetStr += str.charAt(i);
			}
		}
		return targetStr;
	}
	
	
	public void run() {
		println(removeAllOccurrences("This is a test", 't'));
		println(removeAllOccurrences("Summer is here!", 'e'));
		println(removeAllOccurrences("---0---", '-'));
	}		
}
