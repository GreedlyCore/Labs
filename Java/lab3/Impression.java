package Java.lab3;

public class Impression extends Emotions {
    
    private String name;

    Impression(){
        this.name = "Impression";
    }

    Impression(String name){
        this.name = name;
    }

    public void born(Spectable sight){
        if (sight.getCondition() == Adjectives.SCARY){
            return Condition.CANTSAY.getName();
        }
    }


    @Override
    public void setName(String name) {
        this.name = name;
        
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
    }
}
