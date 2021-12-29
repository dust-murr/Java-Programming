public class Tool {
    protected double price;
    
    Tool () {
        this.price = 0.0;
    }
    
    Tool(double price) {
        this.price = price;
    }
    
    public boolean equals(Object obj) {
        System.out.println("Object Price: " + ((Tool)obj).price + ", This price " + this.price);
        return ((Tool)obj).price == this.price;
    }
    
}
