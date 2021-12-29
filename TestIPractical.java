package testiipractical;
import java.util.Scanner;
public class TestIIPractical {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentName;
        int testScore, sum = 0, scoreCount = 0;
        double average;
        System.out.print("Enter your name: ");
        studentName = input.nextLine();
        System.out.print("Enter a test score or any negative number to quit: ");
        testScore = input.nextInt();
        while(testScore >= 0){
            sum += testScore;
            ++scoreCount;
            System.out.print("Enter another test score or any negative number to quit: ");
            testScore = input.nextInt();
        }
        average = averageScore(sum, scoreCount);
        System.out.println("The average of the test scores for " + studentName + " is " + average);
        
    }//end main
    public static double averageScore(int sum, int scoreCount){
        return sum / scoreCount;
    }
}//end class

/*run:
Enter your name: Dustin Murry
Enter a test score or any negative number to quit: 100
Enter another test score or any negative number to quit: 90
Enter another test score or any negative number to quit: 80
Enter another test score or any negative number to quit: 70
Enter another test score or any negative number to quit: 60
Enter another test score or any negative number to quit: 50
Enter another test score or any negative number to quit: -1
The average of the test scores for Dustin Murry is 75.0
BUILD SUCCESSFUL (total time: 15 seconds)*/
