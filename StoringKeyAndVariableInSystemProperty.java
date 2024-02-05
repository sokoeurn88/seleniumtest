package seleniumtest;
import java.io.IOException;


public class StoringKeyAndVariableInSystemProperty {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		
		System.setProperty("Count", "3");
		printKey();
		
		
	}

	private static void printKey() {
		
		System.out.println(System.getProperty("Count"));
		
	}

}
