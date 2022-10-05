package lab2.GreenGuys;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class StringShot extends StatusMove {

    public StringShot() {

        this.accuracy = 95;
        this.type = Type.BUG;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(((new Effect().stat(Stat.SPEED, -2))));

    }

    @Override
    protected String describe() {
        return "use String shot!";
    }
}
