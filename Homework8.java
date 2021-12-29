package homework.pkg8;
import java.util.Scanner;
public class Homework8 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        final int maxScores = 100;
        int [] scores = new int[maxScores];
        int oneScore, scoreCount, x = 0, sum = 0, above = 0, below = 0, equal = 0;
        double average;
        System.out.print("Enter a score or any negative number to quit: ");
        oneScore = input.nextInt();
        while(oneScore >= 0 && x < 100){
            scores[x] = oneScore;
            sum += scores[x];
            ++x;
            System.out.print("Enter a score or any negative number to quit: ");
            oneScore = input.nextInt();
        }
        scoreCount = x;
        average = sum / scoreCount;
        System.out.println("The average is " + average);
        
        for(x = 0; x < scoreCount; ++x){
            if(scores[x] > average){
                above++;
            }
            else if(scores[x] < average){
                below++;
            }
            else{
                equal++;
            }
        }
        System.out.println("The number of scores above the average is " + above);
        System.out.println("The number of scores below the average is " + below);
        System.out.println("The number of scores equal the average is " + equal);
    }//end main
   
}//end class

/*run:
Enter a score or any negative number to quit: 10
Enter a score or any negative number to quit: 20
Enter a score or any negative number to quit: 30
Enter a score or any negative number to quit: 40
Enter a score or any negative number to quit: 50
Enter a score or any negative number to quit: -1
The average is 30.0
The number of scores above the average is 2
The number of scores below the average is 2
The number of scores equal the average is 1
BUILD SUCCESSFUL (total time: 12 seconds)*/
