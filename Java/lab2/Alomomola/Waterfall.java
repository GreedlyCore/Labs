package lab2.Alomomola;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {

    public Waterfall() {
        this.type = Type.WATER;
        this.power = 80;
        this.accuracy = 100;

    }

    @Override
    protected String describe() {
        return "use WaterFAALL";
    }

    // @Override
    // protected void applyOppDamage(Pokemon p, double f) {

    // //p.setCondition(new Effect().flinch(p).chance(0.2).turns(1));
    // }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.2).success()) {
            Effect.flinch(p);
        }

    }

}
