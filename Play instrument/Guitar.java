public class Guitar extends Instrument {
    protected int numberOfStrings;
    
    Guitar() {
        
    }
    
    Guitar(double price, int numberOfStrings) {
        super(price);
        this.numberOfStrings = numberOfStrings;
    }
    
    @Override
    public String play() {
        return "I'm a Guitar WaWaWaWa I have " + numberOfStrings + " strings";
    }
}
