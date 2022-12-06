package lab3.src.locations;

import lab3.src.based.Location;
import lab3.src.based.Thing;

public class Cloud extends Location {

    private Thing composition;

    public Cloud(String name, Thing composition) {
        super(name);
        this.composition = composition;
    }

    public Thing getComposition() {
        return composition;
    }

    public void setComposition(Thing composition) {
        this.composition = composition;
    }
}
