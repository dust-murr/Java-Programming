//import java.util.Random
public class Lab2 {

    public static void main(String[] args) {
        /*Random randomAge = new Random();
        int cumulativeAge=0;
        double averageAge;*/
        Frog[] frogArray = new Frog[100];
        System.out.println("---------------------------------------------------------");
        int total = 0;
        for(int x = 0; x < frogArray.length; x++){
            /*frogArray[x] = new Frog(randomAge.nextInt(100));
            cumulativeAge+=frogArray[x].getAge();*/
            frogArray[x] = new Frog((int) ((Math.random() * 100) + 1));
            System.out.println("Frog #" + (x+1) + " is " + frogArray[x].getAge() + " years old");
            total = total + frogArray[x].getAge();
        }
        double average;
        average = total / frogArray.length;
        System.out.println("---------------------------------------------------------");
        System.out.println("The average age of the frogs is " + average + " years old");
        System.out.println("The total number of frogs that were created is " + Frog.getNumberOfFrogs());
        System.out.println("---------------------------------------------------------");
    }
}

class Frog {
    private int age;
    private static int numberOfFrogs = 0; 
    
    Frog() {
        age = 0;
        numberOfFrogs++;
    }
    
    Frog(int age) {
        this.age = age;
        numberOfFrogs++;
    }
    
    public static int getNumberOfFrogs() {
        return numberOfFrogs;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    } 
}

/*run:
---------------------------------------------------------
Frog #1 is 64 years old
Frog #2 is 61 years old
Frog #3 is 4 years old
Frog #4 is 61 years old
Frog #5 is 93 years old
Frog #6 is 46 years old
Frog #7 is 24 years old
Frog #8 is 39 years old
Frog #9 is 15 years old
Frog #10 is 93 years old
Frog #11 is 8 years old
Frog #12 is 17 years old
Frog #13 is 85 years old
Frog #14 is 61 years old
Frog #15 is 86 years old
Frog #16 is 46 years old
Frog #17 is 10 years old
Frog #18 is 26 years old
Frog #19 is 68 years old
Frog #20 is 49 years old
Frog #21 is 90 years old
Frog #22 is 87 years old
Frog #23 is 28 years old
Frog #24 is 39 years old
Frog #25 is 41 years old
Frog #26 is 46 years old
Frog #27 is 55 years old
Frog #28 is 80 years old
Frog #29 is 96 years old
Frog #30 is 77 years old
Frog #31 is 26 years old
Frog #32 is 78 years old
Frog #33 is 77 years old
Frog #34 is 30 years old
Frog #35 is 8 years old
Frog #36 is 12 years old
Frog #37 is 16 years old
Frog #38 is 4 years old
Frog #39 is 64 years old
Frog #40 is 61 years old
Frog #41 is 60 years old
Frog #42 is 98 years old
Frog #43 is 25 years old
Frog #44 is 1 years old
Frog #45 is 52 years old
Frog #46 is 17 years old
Frog #47 is 80 years old
Frog #48 is 2 years old
Frog #49 is 75 years old
Frog #50 is 82 years old
Frog #51 is 41 years old
Frog #52 is 100 years old
Frog #53 is 73 years old
Frog #54 is 6 years old
Frog #55 is 30 years old
Frog #56 is 40 years old
Frog #57 is 95 years old
Frog #58 is 33 years old
Frog #59 is 35 years old
Frog #60 is 80 years old
Frog #61 is 22 years old
Frog #62 is 85 years old
Frog #63 is 11 years old
Frog #64 is 39 years old
Frog #65 is 3 years old
Frog #66 is 94 years old
Frog #67 is 49 years old
Frog #68 is 91 years old
Frog #69 is 81 years old
Frog #70 is 48 years old
Frog #71 is 52 years old
Frog #72 is 15 years old
Frog #73 is 66 years old
Frog #74 is 15 years old
Frog #75 is 24 years old
Frog #76 is 5 years old
Frog #77 is 58 years old
Frog #78 is 83 years old
Frog #79 is 79 years old
Frog #80 is 85 years old
Frog #81 is 9 years old
Frog #82 is 82 years old
Frog #83 is 83 years old
Frog #84 is 67 years old
Frog #85 is 78 years old
Frog #86 is 30 years old
Frog #87 is 3 years old
Frog #88 is 37 years old
Frog #89 is 100 years old
Frog #90 is 91 years old
Frog #91 is 10 years old
Frog #92 is 47 years old
Frog #93 is 94 years old
Frog #94 is 17 years old
Frog #95 is 84 years old
Frog #96 is 55 years old
Frog #97 is 68 years old
Frog #98 is 83 years old
Frog #99 is 5 years old
Frog #100 is 49 years old
---------------------------------------------------------
The average age of the frogs is 50.0 years old
The total number of frogs that were created is 100
---------------------------------------------------------
BUILD SUCCESSFUL (total time: 0 seconds)*/
        
