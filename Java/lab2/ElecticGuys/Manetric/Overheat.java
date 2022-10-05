package lab2.ElecticGuys.Manetric;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Overheat extends SpecialMove {

    Overheat(){
        this.type = Type.FIRE;
        this.power = 130;
        this.accuracy = 90;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().stat(Stat.SPECIAL_ATTACK, -2));
    }

    @Override
    protected String describe() {
        return "use OverHeat";
    }
    
}
