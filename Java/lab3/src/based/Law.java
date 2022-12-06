package lab3.src.based;

public class Law extends Entity {
    
    boolean isBroken;

    public Law(boolean isBroken) {
        super("Law");
        this.isBroken = isBroken;
        
    }

    public boolean isBroken() {
        return isBroken;
    }
    
    public void setBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }

    @Override
    public String toString() {
        
        return super.getName();
    }
    
}
