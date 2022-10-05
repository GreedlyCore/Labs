package lab2.ElecticGuys.Electrike;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class FireFang extends PhysicalMove {

    public FireFang() {
        this.power = 65;
        this.accuracy = 95;
        this.type = Type.FIRE;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.1).success()) {
            p.setCondition(((new Effect().condition(Status.BURN))));
        }

        if (new Effect().chance(0.1).success() && p.getCondition()==Status.NORMAL ) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "use firefang!";
    }
}
