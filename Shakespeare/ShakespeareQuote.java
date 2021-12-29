import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShakespeareQuote {
	
	private String saying;
	
	public void Quotes(String string) throws IOException {
		File file = new File(string);
	    try (Scanner input = new Scanner(file);) {
	    
	    while(input.hasNextLine()){
	    	saying = input.nextLine();
	    }
	    input.close();
	    }
	    catch(IOException ex){
	    	ex.printStackTrace();;
	    }
	 }
	
	public String getSaying() {
		return saying;
	}
}
