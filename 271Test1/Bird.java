public class Bird extends Animal {
    
    Bird() {
        super();
    }
    
    Bird(int weight) {
        super(weight);
    }
    
    @Override
    public String toString() {
        return "Weight is: " + getWeight() + " Hello, I'm a Bird";
    }

    @Override
    public String says() {
        return "tweet";
    }
    
}
