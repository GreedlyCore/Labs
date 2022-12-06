package lab3.src.creatures;

import lab3.src.based.Entity;
import lab3.src.based.Thing;

public class Ghost extends Entity {

    private final Thing[] things;
    private String name;

    protected Ghost(String name, Thing[] things) {
        super(name);
        this.things = things;
    }


    public String carry() {
        return "I carry" + things[0] + " // " + things[1];
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        return false;
    }

    @Override
    public String toString() {

        return "I am " + getName() + " " + this.carry();
    }




}
