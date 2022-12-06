package lab3.src.locations;

import lab3.src.based.Location;
import lab3.src.based.Time;
import lab3.src.enums.Adjectives;
import lab3.src.interfaces.TimeComparable;

public final class Town extends Location implements TimeComparable {
    public Town(String name, Adjectives... adjectives) {
        super(name, adjectives);
    }    public Town(Adjectives... adjectives) {
        super("Town", adjectives);
    }

    @Override
    public boolean isSimilarSpecificTime(Time time) {
        return false;
    }
}
