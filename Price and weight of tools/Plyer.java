public class Plyer extends Tool {
    private char size;
    
    Plyer() {
        super();
        size = ' ';
    }
    
    Plyer(double price, char size) {
        super(price);
        this.size = size;
    }
    
    public String toString() {
        return "This is a Plyer. The price is " + this.price + " and the size is " + this.size;
    }
}
