public class Dog extends Animal {
    
    Dog() {
        super();
    }
    
    Dog(int weight) {
        super(weight);
    }
    
    @Override
    public String toString() {
        return "Weight is: " + getWeight() + " Hello, I'm a Dog";
    }

    @Override
    public String says() {
        return "ruff";
    }
    
}
