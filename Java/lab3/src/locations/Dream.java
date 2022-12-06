package lab3.src.locations;

import lab3.src.based.Location;
import lab3.src.based.Thing;
import lab3.src.enums.Adjectives;
import lab3.src.interfaces.ThingComparable;


public class Dream extends Location implements ThingComparable {

    public Dream(String name) {
        super(name);

    }


    @Override
    public Adjectives[] DifferenceSpecificThing(Thing thing) {
        if (thing.getName().toLowerCase() == "reality" && (thing.getDescriptions()[0] == Adjectives.SCARY) && (thing.getDescriptions()[1] == Adjectives.DANGEROUS)){
            Adjectives[] result = {Adjectives.SCARY,Adjectives.DANGEROUS};
            return new Adjectives[]{Adjectives.SCARY, Adjectives.DANGEROUS};
        }
        return null;
    }
}
