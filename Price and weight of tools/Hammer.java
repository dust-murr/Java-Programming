public class Hammer extends Tool {
    private int weight;
    
    Hammer() {
        super();
        this.weight = 0;
    }
    
    Hammer(double price, int weight) {
        super(price);
        
        this.weight = weight;
    }
    
    public String toString() {
        return "This is a Hammer. The price is " + this.price + " and the weight is " + this.weight;
    }
}
