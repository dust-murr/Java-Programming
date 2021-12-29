package homework.pkg11;
import java.util.Scanner;
public class Homework11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] cap = {{"Alabama", "Montgomery"},
                          {"Alaska", "Juneau"},
                          {"Arizona", "Phoenix"},
                          {"Arkansas", "Little Rock"},
                          {"California", "Sacramento"},
                          {"Colorado", "Denver"},
                          {"Connecticut", "Hartford"},
                          {"Delaware", "Dover"},
                          {"Florida", "Tallahassee"},
                          {"Georgia", "Atlanta"},
                          {"Hawaii", "Honolulu"},
                          {"Idaho", "Boise"},
                          {"Illinois", "Springfield"},
                          {"Indiana", "Indianapolis"},
                          {"Iowa", "Des Moines"},
                          {"Kansas", "Topeka"},
                          {"Kentucky", "Frankfort"},
                          {"Louisiana", "Baton Rouge"},
                          {"Maine", "Augusta"},
                          {"Maryland", "Annapolis"},
                          {"Massachusetts", "Boston"},
                          {"Michigan", "Lansing"},
                          {"Minnesota", "Saint Paul"},
                          {"Mississippi", "Jackson"},
                          {"Missouri", "Jefferson City"},
                          {"Montana", "Helena"},
                          {"Nebraska", "Lincoln"},
                          {"Nevada", "Carson City"},
                          {"New Hampshire", "Concord"},
                          {"New Jersey", "Trenton"},
                          {"New Mexico", "Santa Fe"},
                          {"New York", "Albany"},
                          {"North Carolina", "Raleigh"},
                          {"North Dakota", "Bismarck"},
                          {"Ohio", "Columbus"},
                          {"Oklahoma", "Oklahoma City"},
                          {"Oregon", "Salem"},
                          {"Pennsylvania", "Harrisburg"},
                          {"Rhode Island", "Providence"},
                          {"South Carolina", "Columbia"},
                          {"South Dakota", "Pierre"},
                          {"Tennessee", "Nashville"},
                          {"Texas", "Austin"},
                          {"Utah", "Salt Lake City"},
                          {"Vermont", "Montpelier"},
                          {"Virgina", "Richmond"},
                          {"Washington", "Olympia"},
                          {"West Virgina", "Charleston"},
                          {"Wisconsin", "Madison"},
                          {"Wyoming", "Cheyenne"},
                          };
        int numStates;
        String capital;
        int count = 0;
        int row;
        System.out.print("How many states do you want to guess? ");
        numStates = input.nextInt();
        String junk = input.nextLine();
        for(int x = 0; x < numStates; ++x){
            row = (int)(Math.random() * 50);
            System.out.print("What is the capital of " + cap[row][0] + "? ");
            capital = input.nextLine();
            if(capital.equalsIgnoreCase(cap[row][1])){
                System.out.println("Your answer is correct");
                ++count;
            }
            else{
                System.out.println("The correct answer should be " + cap[row][1]);
            }
        }
        System.out.println("The correct count is " + count + " out of " + numStates);    
    }//end main
}//end class

/*run:
How many states do you want to guess? 5
What is the capital of Wyoming? Cheyenne
Your answer is correct
What is the capital of Ohio? columbus
Your answer is correct
What is the capital of California? SACRAMENTO
Your answer is correct
What is the capital of Maryland? Annie
The correct answer should be Annapolis
What is the capital of New York? Albany
Your answer is correct
The correct count is 4 out of 5
BUILD SUCCESSFUL (total time: 49 seconds)*/
