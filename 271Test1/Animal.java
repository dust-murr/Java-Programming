public abstract class Animal implements Comparable<Animal> {
    private int weight;
    static int count;
    
    protected Animal() {
	this.weight = 0;
        count++;
    }
	
    protected Animal(int weight){
	this.weight = weight;
	count++;
    }
    
    public int getWeight() {
	return weight;
    }

    public void setWeight(int weight) {
	this.weight = weight;
    }
    
     public static int getCount() {
	return count;
    }
     
    @Override
    public String toString(){
        return super.toString();
    }
    
    @Override
    public int compareTo(Animal animal) {
        if(this.weight > animal.weight) {
            return 1;
        }
        else if (this.weight < animal.weight) {
            return -1;
        }
        else {
            return 0;
        }
    }
    
    public abstract String says();
    
}

