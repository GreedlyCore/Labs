package lab3;

public class Devil extends Creature {

    String name;

    Devil(String name){
        if (name != null && !name.isEmpty())
        this.name = name;
    }
    Devil(){
        this.name = "Devil";
    }

    @Override
    public void setName(String name) {
        this.name = name;
        
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        return this.getName() + 
    }

   

}
