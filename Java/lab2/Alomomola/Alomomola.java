package lab2.Alomomola;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Alomomola extends Pokemon {


    public Alomomola(String name, int lvl) {

        super(name, lvl);
        this.addType(Type.WATER);
        this.setStats(165, 75, 80, 40, 45, 65);

        this.setMove(new HydroPump(), new Psychic(), new Waterfall(), new DoubleTeam());

    }

    public Alomomola() {
        super();

        this.addType(Type.WATER);
        this.setStats(165, 75, 80, 40, 45, 65);
        this.setMove(new HydroPump(), new Psychic(), new Waterfall(), new DoubleTeam());
    }

}
