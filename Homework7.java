package homework.pkg7;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        String phoneString;
        System.out.print("Enter a string: ");
        phoneString = input.next();
        
        for(int x = 0; x < phoneString.length(); ++x){
            letter = phoneString.charAt(x);
            if(Character.isLetter(letter)){
                int number;
                letter = Character.toUpperCase(letter);
                number = getNumber(letter);
                System.out.print(number);
            }
            else{
                System.out.print(letter);
            } 
        }
    }//end main
    public static int getNumber(char uppercaseLetter){
        
        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C'){
            return 2;
            }
            else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F'){
            return 3;
            }
            else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I'){
            return 4;
            }
            else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L'){
            return 5;
            }
            else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O'){
            return 6;
            }
            else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S'){
            return 7;
            }
            else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V'){
            return 8;
            }
            else {
            return 9;
            }
    }
}//end class

/*run:
Enter a string: 1-800-Flowers
1-800-3569377BUILD SUCCESSFUL (total time: 6 seconds)*/
