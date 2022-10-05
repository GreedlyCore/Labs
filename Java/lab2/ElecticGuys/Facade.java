package lab2.ElecticGuys;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Move;

public class Facade extends PhysicalMove {

    public Facade() {

        this.accuracy = 100;
        this.power = 70;
        this.type = Type.NORMAL;
    }

    @Override
    protected void applyOppDamage(Pokemon p, double dmg) {
        if (p.getCondition() == Status.BURN || p.getCondition() == Status.POISON
                || p.getCondition() == Status.PARALYZE) {
                    p.setMod(Stat.HP, 2* (int) Math.round(dmg));
        }

    }

    @Override
    protected String describe() {
        return "use Facade!!!!";
    }

}
