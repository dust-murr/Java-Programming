package homework.pkg9;
import java.util.Scanner;
import java.util.GregorianCalendar;
public class Homework9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GregorianCalendar myCal = new GregorianCalendar();
        System.out.println("Today's date is");
        System.out.println("---------------");
        System.out.println("Month: " + (myCal.get(myCal.MONTH) + 1));
        System.out.println("Day: " + myCal.get(myCal.DAY_OF_MONTH));
        System.out.println("Year: " + myCal.get(myCal.YEAR));
        myCal.setTimeInMillis(1234567898765L);
        System.out.println();
        System.out.println("The set date is");
        System.out.println("---------------");
        System.out.println("Month: " + (myCal.get(myCal.MONTH) + 1));
        System.out.println("Day: " + myCal.get(myCal.DAY_OF_MONTH));
        System.out.println("Year: " + myCal.get(myCal.YEAR));
    }//end main
}// end class

/*run:
Today's date is
---------------
Month: 4
Day: 27
Year: 2021

The set date is
---------------
Month: 2
Day: 13
Year: 2009
BUILD SUCCESSFUL (total time: 0 seconds)*/
