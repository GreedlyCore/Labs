package lab2.GreenGuys.Sewaddle;

import lab2.GreenGuys.StringShot;
import lab2.GreenGuys.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sewaddle extends Pokemon {

    protected Sewaddle(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.BUG, Type.GRASS);
        this.setStats(45, 53, 70, 40, 60, 42);
        this.setMove(new StringShot(), new Swagger());

    }

    protected Sewaddle() {
        super();
        this.setStats(45, 53, 70, 40, 60, 42);
        this.setType(Type.BUG, Type.GRASS);

        this.setMove(new StringShot(), new Swagger());

    }
}
