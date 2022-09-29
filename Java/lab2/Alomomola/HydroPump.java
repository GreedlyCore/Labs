package lab2.Alomomola;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove{

    public HydroPump(){
        this.type = Type.WATER;
        this.power = 110;
        this.accuracy = 80;
        
    }

    @Override
    protected String describe() {
        return "use HydroPump";
    }
    
}
