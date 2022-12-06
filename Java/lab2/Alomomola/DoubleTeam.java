package lab2.Alomomola;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove{

    public DoubleTeam(){
        this.type = Type.NORMAL;
    }

    @Override
    protected String describe() {
        return "created Their Clones!";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(-1).stat(Stat.EVASION, +1));
    }
    
}
