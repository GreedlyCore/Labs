package lab2.ElecticGuys.Manetric;

import lab2.ElecticGuys.Electrike.Electrike;

public class Manetric extends Electrike {




    public Manetric(String name, int lvl) {

        super(name, lvl);
     
        this.setStats(70, 75, 60, 105, 60, 105);

        this.addMove(new Overheat());
        
    }

    public Manetric() {
        super();

        this.setStats(70, 75, 60, 105, 60, 105);

        this.addMove(new Overheat());
    }

}
