public abstract class Instrument implements Comparable<Instrument>{
    protected double price;
    
    Instrument() {
        this.price = 0.0;
    }
    
    Instrument(double price) {
        this.price = price;
    }
    
    @Override
    public int compareTo(Instrument obj) {
       if(this.price > obj.price) {
           return 1;
       } 
       else if(this.price < obj.price) {
           return -1;
       }
       else {
           return 0;
       }
    }
    
    public abstract String play(); 
      
}
