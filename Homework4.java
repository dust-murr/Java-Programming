package homework.pkg4;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        String letterString;
        System.out.println("Enter a letter: ");
        letterString = input.next();
        letter = letterString.charAt(0);
        letter = Character.toUpperCase(letter);
        
        if (letter >= 'A' && letter <= 'C'){
        System.out.println("The number found on the phone keypad correlated with this letter is: 2");
        }
        else if (letter >= 'D' && letter <= 'F'){
        System.out.println("The number found on the phone keypad correlated with this letter is: 3");
        }
        else if (letter >= 'G' && letter <= 'I'){
        System.out.println("The number found on the phone keypad correlated with this letter is: 4");
        }
        else if (letter >= 'J' && letter <= 'L'){
        System.out.println("The number found on the phone keypad correlated with this letter is: 5");
        }
        else if (letter >= 'M' && letter <= 'O'){
        System.out.println("The number found on the phone keypad correlated with this letter is: 6");
        }
        else if (letter >= 'P' && letter <= 'S'){
        System.out.println("The number found on the phone keypad correlated with this letter is: 7");
        }
        else if (letter >= 'T' && letter <= 'V'){
        System.out.println("The number found on the phone keypad correlated with this letter is: 8");
        }
        else if (letter >= 'W' && letter <= 'Z'){
        System.out.println("The number found on the phone keypad correlated with this letter is: 9");
        }
        else{
        System.out.println(letter + " is an invalid input");
        }
    }  
}

/*for(int x = 0; x < phoneString.length(); ++x)
        letter = phoneString.charAt(x);*/

/*run:
Enter a letter: 
e
The number found on the phone keypad correlated with this letter is: 3
BUILD SUCCESSFUL (total time: 3 seconds)*/
