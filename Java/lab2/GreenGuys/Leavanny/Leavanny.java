package lab2.GreenGuys.Leavanny;

import lab2.GreenGuys.Swagger;
import ru.ifmo.se.pokemon.Pokemon;

public class Leavanny extends Pokemon {

    public Leavanny(String name, int lvl) {
        super(name, lvl);

        this.setStats(75, 103, 80, 70, 8092, 42);
        this.addMove(new Swagger());

    }

    Leavanny() {
        super();
        this.setStats(75, 103, 80, 70, 8092, 42);


        this.addMove(new Swagger());

    }


}
