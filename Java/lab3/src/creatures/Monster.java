package lab3.src.creatures;

import lab3.src.based.Entity;
import lab3.src.based.Location;
import lab3.src.enums.Adjectives;
import lab3.src.locations.MountainRange;

public class Monster extends Entity {

    Adjectives[] description;


    public Monster beNoticedInSpesificPlace(Location place){
        if (place.getClass() == MountainRange.class){
            return this;
        }
        return null;
    }
    public Monster(String name, Adjectives...adjective) {
        super(name);
        this.description = adjective;
    }

    public void reflectFrom(Location place){

    }

   
}
