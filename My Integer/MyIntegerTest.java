public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));
    
        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}

class MyInteger{
    private int value;
    
    MyInteger(){
        
    }
        
    MyInteger(int value){
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public boolean isEven(){
        return this.value % 2 == 0;
    }
    public boolean isOdd(){
        return this.value % 2 == 1;
    }
    public boolean isPrime(){
        for(int x = 2; x < this.value; x++){
            if(this.value % x == 0){
                return false;                
            } 
        }
        return true;
    }
    
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static boolean isOdd(int value){
        return value % 2 == 1;
    }
    public static boolean isPrime(int value){
        for(int x = 2; x < value; x++){
            if(value % x == 0){
                return false;                
            } 
        }
        return true;
    }
    
    public static boolean isEven(MyInteger n){
        return n.isEven();
    }
    public static boolean isOdd(MyInteger n){
        return n.isOdd();
    }
    public static boolean isPrime(MyInteger n){
        return n.isPrime();
    }
    
    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger n){
        return this.value == n.value;
    }
    
    public static int parseInt(char[] chars){
        return Integer.parseInt(String.valueOf(chars));          
    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
}

/*run:
n1 is even? false
n1 is prime? true
15 is prime? false
3539
3539
n2 is odd? false
45 is odd? true
n1 is equal to n2? false
n1 is equal to 5? true
BUILD SUCCESSFUL (total time: 0 seconds)*/
