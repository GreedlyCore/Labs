package lab3.src.creatures;

import lab3.src.based.Entity;
import lab3.src.based.Nature;

public final class Devil extends Entity {

    Nature natureLaws;

    public Devil(Nature natureLaws) {
        super("Devil");
        this.natureLaws = natureLaws;
    }

    public void destroyLaws(){
        this.natureLaws.setLawsIsBroken(true);
    }


    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toString() {

        return this.getName();
    }

}
