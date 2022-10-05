package lab2.ElecticGuys.Electrike;

import lab2.ElecticGuys.Facade;
import lab2.ElecticGuys.Howl;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Electrike extends Pokemon {

  


    public Electrike(String name, int lvl) {

        super(name, lvl);
        this.addType(Type.ELECTRIC);
        this.setStats(40, 45, 40, 65, 40, 65);

        this.setMove(new Howl(), new Facade(), new FireFang());
 
    }

    public Electrike() {
        super();

        this.addType(Type.ELECTRIC);
        this.setStats(40, 45, 40, 65, 40, 65);

        this.setMove(new Howl(), new Facade(), new FireFang());
    }

}
