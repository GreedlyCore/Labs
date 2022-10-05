package lab2.ElecticGuys;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Howl extends StatusMove {

    public Howl() {
        this.type = Type.NORMAL;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(-1).stat(Stat.ATTACK, +1));
    }

    @Override
    protected String describe() {
        return "howl...";
    }

}
