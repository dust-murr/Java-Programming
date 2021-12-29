public class InstrumentDriver {
    
    public static void main(String[] args) {
    
        Instrument a = new Guitar(135.00, 6);
        Instrument b = new Piano(225.00, 44);
    
        if (a.compareTo(b) > 0){
        System.out.println(a.play());
        }
        else if(a.compareTo(b) < 0){
            System.out.println(b.play());
        }
    }
}
