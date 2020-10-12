import acm.program.*;
import java.util.*;

public class PigLatin extends ConsoleProgram {

	public void run() {
		println("This program translates a line into Pig Latin.");
		String line = readLine("Enter a line: ");
		println(translateLine(line));
	}
	
	}
}
