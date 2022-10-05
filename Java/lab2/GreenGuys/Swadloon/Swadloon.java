package lab2.GreenGuys.Swadloon;

import lab2.GreenGuys.GrassWhistle;
import lab2.GreenGuys.StringShot;
import lab2.GreenGuys.Swagger;
import lab2.GreenGuys.Sewaddle.Sewaddle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swadloon extends Sewaddle {

    public Swadloon(String name, int lvl) {

        super(name, lvl);
  
        this.setStats(45, 53, 70, 40, 60, 42);

        this.addMove( new GrassWhistle());

    }

    public Swadloon() {
        super();

       
        this.setStats(45, 53, 70, 40, 60, 42);

        this.addMove( new GrassWhistle());
    }

}
