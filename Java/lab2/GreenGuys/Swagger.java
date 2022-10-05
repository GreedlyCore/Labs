package lab2.GreenGuys;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove{

    public Swagger(){
        this.accuracy = 85;
        this.type = Type.NORMAL;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.ATTACK, +2));
        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "use Swagger";
    }
    
}
