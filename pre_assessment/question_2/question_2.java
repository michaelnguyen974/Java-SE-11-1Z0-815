interface HasTail { 
    int getTailLength(); 
} 

abstract class Puma implements HasTail { 
    protected int getTailLength() { // compile error because the interface method is inheritently PUBLIC - making this an invalid OVERRIDE.
        return 4; 
    } 
}

public class Cougar implements HasTail { 
    public static void main(String[] args) { 
        var puma = new Puma(); // compile error as Cougar has not inherited anything from Puma, so it cannot instantiate it 
        System.out.println(puma.getTailLength()); // compile error as we are trying to call getTailLength (from HasTail) on the puma object 
                                                  // the methods have a different signature and therefore it cannot be called on puma 
    } 

    public int getTailLength(int length) { 
        return 2; 
    } 
} 
