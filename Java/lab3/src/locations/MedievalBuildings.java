package lab3.src.locations;

import lab3.src.based.Location;
import lab3.src.based.Nature;
import lab3.src.enums.Adjectives;

public class MedievalBuildings extends Location  {


    Nature notCreator;


    public MedievalBuildings(String name,  Nature notCreator, Adjectives[] description) {
        // super(description);
        this(name, notCreator);
        super.descriptions = description;
        
        
    }

    public MedievalBuildings(String name,  Nature notCreator) {
        super(name);
        this.notCreator = notCreator;
    }

    
    @Override
    public String toString() {
        return null;
    }
}
