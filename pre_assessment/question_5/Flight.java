public class Flight { 
    
    private FlightNumber number;

    public Flight(FlightNumber number) { 
        this.number = number;
    } 
}

public class FlightNumber { 
    public int value; 
    public String code; 
} 

// Try compiling the code - it will not work! 

// Cannot have more than 1 public class in a file 