public class Piano extends Instrument {
    protected int numberOfKeys;
    
    Piano() {
        
    }
    
    Piano(double price, int numberOfKeys) {
        super(price);
        this.numberOfKeys = numberOfKeys;
    }
    
    @Override
    public String play() {
        return "I'm a Piano TinkleTinkleTinkle I have " + numberOfKeys + " keys";
    }
}
