package lab3;

public class Ghost extends Creature {
    
    private final Thing[] things;
    private String name;



    public Ghost(Thing...things){
        this.things = things;
    }

    public String carry(){
        return "I carry" + things[0] + " // "+ things[1];
    }


    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return false;
    }


    @Override
    public String toString() {
        
        return "I am " + getName() + " " + this.carry();
    }
    @Override
    public void setName(String name) {
        this.name = name;
        
    }
    @Override
    public String getName() {
        
        return name;
    }





}
