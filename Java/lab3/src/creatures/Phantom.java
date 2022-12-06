package lab3.src.creatures;

import lab3.src.based.Entity;
import lab3.src.based.Thing;
import lab3.src.enums.Adjectives;
import lab3.src.interfaces.isExist;

public class Phantom extends Entity implements isExist {

    Thing[] distortions; // искажения
    Thing[] exaggerations; // преувеличения

    public Phantom(String name) {
        super(name);
    }


    @Override
    public boolean checkExistance() {
        return false;
    }

    public void generateDistortions(){
        Thing[] distortions = new Thing[50];
        for (int i = 0; i < 49; i++) {
            distortions[i] = new Thing("distortion", Adjectives.getRandomItem());
        }
        this.setDistortions(distortions);


    } public void generateExaggerations(){
        Thing[] exaggerations = new Thing[50];
        for (int i = 0; i < 49; i++) {
            exaggerations[i] = new Thing("exaggerations", Adjectives.getRandomItem());
        }

        this.setExaggerations(exaggerations);
    }

    public void setDistortions(Thing[] distortions) {
        this.distortions = distortions;
    }

    public void setExaggerations(Thing[] exaggerations) {
        this.exaggerations = exaggerations;
    }

    public Thing[] getDistortions() {
        return distortions;
    }

    public Thing[] getExaggerations() {
        return exaggerations;
    }
}
