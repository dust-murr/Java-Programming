package homework.pkg10;
import java.util.Scanner;
public class Homework10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int [10];
        System.out.print("Enter ten numbers: ");
        for(int x = 0; x < values.length; ++x){
            values[x] = input.nextInt();
        }
        
        int[] finalValues = eliminateDuplicates(values);
        System.out.print("The distinct numbers are: ");
        for(int x = 0; x < finalValues.length; ++x){
            System.out.print(finalValues[x] + " ");
        }
    }//end main
    
    public static int[] eliminateDuplicates(int[] list){
        int[] newArray = new int[list.length];
        boolean foundIt;
        int y = 0;
        for(int x = 0; x < list.length; ++x){
            foundIt = search(newArray, list[x]);
            if(!foundIt){
                newArray[y] = list[x];
                ++y;
            }
        }
        
        int[] trimArray = new int[y];
        for(int x = 0; x < trimArray.length; ++x){
            trimArray[x] = newArray[x];
        }  
        return trimArray;
    }//end eliminateDuplicates method 
    
    public static boolean search(int[] list, int original){
        for (int x = 0; x < list.length; x++) {
            if (original == list[x]){
                return true;
            } 
        }
        return false;
    }//end search method
}//end class

/*run:
Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5 BUILD SUCCESSFUL (total time: 11 seconds)*/
