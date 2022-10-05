package lab2.GreenGuys;

import ru.ifmo.se.pokemon.*;

public class GrassWhistle extends StatusMove {
    
    public GrassWhistle(){
        this.type = Type.GRASS;
        this.accuracy = 55;

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }

    @Override
    protected String describe() {
        return "use GrassWhistle";
    }
}

