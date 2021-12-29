package homework3;
import java.util.Scanner;
public class Homework3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, year;
        
        System.out.println("Enter the month numerically (MM): ");
        month = input.nextInt();
        System.out.println("Enter the year numerically (YYYY): ");
        year = input.nextInt();
        
        if(month == 1 && year >= 0){
            System.out.println("January has 31 days.");
        }
        else if(month == 2 && year %4 != 0){
            System.out.println("February has 28 days.");
        }
        else if(month == 2 && year %4 == 0){
            System.out.println("February has 29 days.");
        }
        else if(month == 3 && year >= 0){
            System.out.println("March has 31 days.");
        }
        else if(month == 4 && year >= 0){
            System.out.println("April has 30 days.");
        }
        else if(month == 5 && year >= 0){
            System.out.println("May has 31 days.");
        }
        else if(month == 6 && year >= 0){
            System.out.println("June has 30 days.");
        }
        else if(month == 7 && year >= 0){
            System.out.println("July has 31 days.");
        }
        else if(month == 8 && year >= 0){
            System.out.println("August has 31 days.");
        }
        else if(month == 9 && year >= 0){
            System.out.println("September has 30 days.");
        }
        else if(month == 10 && year >= 0){
            System.out.println("October has 31 days.");
        }
        else if(month == 11 && year >= 0){
            System.out.println("November has 30 days.");
        }
        else if(month == 12 && year >= 0){
            System.out.println("December has 31 days.");
        }
        else if((month >= 13 || month <= 0) && year >= 0) {
            System.out.println("Entered a bad month. Please try again.");
        }
        else if(month <= 12 && month >= 1 && year < 0) {
            System.out.println("Entered a bad year. Please try again.");
        }
        else {
            System.out.println("Entered a bad month and year. Please try again.");
        }
      } 
    }

/*run:
Enter the month numerically (MM): 
2
Enter the year numerically (YYYY): 
2020
February has 29 days.
BUILD SUCCESSFUL (total time: 8 seconds)*/
