public class Cat extends Animal {
    
    Cat() {
        super();
    }
    
    Cat(int weight) {
        super(weight);
    }
    
    @Override
    public String toString() {
        return "Weight is: " + getWeight() + " Hello, I'm a Cat";
    }

    @Override
    public String says() {
        return "meow";
    }
    
}
