package lab3.src.creatures;

import lab3.src.based.Entity;
import lab3.src.interfaces.isExist;

public abstract class Monkey extends Entity  {

    public Monkey(String name) {
        super(name);

    }
    public Monkey() {
        super("Monkey");
        
    }

    public boolean checkExistance(){

        return false;
    }


//    @Override
//    public boolean exist(){
//        return
//    }
}
