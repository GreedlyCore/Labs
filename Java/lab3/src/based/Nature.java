package lab3.src.based;

import lab3.src.helper.Printer;

public final class Nature extends Entity {


    Law[] lawsOfNature;
    boolean isTruth;

    public Nature(Law[] laws) {
        super("Nature");
        this.lawsOfNature = laws;
        this.isTruth = true;
        
    }
    public Nature() {
        super("Nature");
        isTruth = true;

        
    }

    public void generateLaws(){
        Law[] laws = new Law[10];
        for (int i = 0; i < 10; i++) {
            laws[i] = new Law(false);
        }
        this.lawsOfNature = laws;

    }

    public boolean isTruth() {
        return isTruth;
    }

    public void setTruth(boolean truth) {
        isTruth = truth;
    }

    public void setLawsIsBroken(boolean value) {
        for (int i = 0; i < lawsOfNature.length; i++) {
            lawsOfNature[i].setBroken(value);
        }
    }


    @Override
    public String toString() {
        if (isTruth){return Printer.setSpaces("true", super.getName());
        }   return Printer.setSpaces("false", super.getName());

    }

}
