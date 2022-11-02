package lab3;

public class Plateau extends Location{

    
    //in funts
    private int height = 20000;
    private String unit = "feet above sea level";

    @Override
    public String toString() {
        
        return height + " " + unit;
    }
}
