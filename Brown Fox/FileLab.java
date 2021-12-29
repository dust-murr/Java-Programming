import java.io.IOException;
import java.util.Scanner;

public class FileLab {
    
    public static void main(String[] args) {
        java.io.File file = new java.io.File("Lab_7");
        
        if(file.exists()) {
            System.out.println("File already exisits");
        }
        //else {
            
            String sentence = "The quick brown fox jumped over the lazy dog";
        
            String[] sentenceArray = sentence.split(" ", 10);
        
            for(int i = 0; i < sentenceArray.length; i++) {
            System.out.println(sentenceArray[i]);
            } 
        
            try {
                java.io.PrintWriter outputFile = new java.io.PrintWriter(file);
            
                for(int i = 0; i < sentenceArray.length; i++) {
                    outputFile.println(sentenceArray[i]);
                }
            
                outputFile.close();
            } catch(IOException e) {
                System.out.println("File Error");
            }
        
            try {
                Scanner input = new Scanner(file);
        
                while(input.hasNext()) {
                System.out.print(input.next() + " ");
            }
        
            input.close();
            } catch(IOException e) {
                System.out.println("File Read Error");
            }
        //}
    
    }
}

