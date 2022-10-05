package lab2;

import lab2.Alomomola.Alomomola;
import lab2.ElecticGuys.Electrike.Electrike;
import lab2.ElecticGuys.Manetric.Manetric;
import lab2.GreenGuys.Leavanny.Leavanny;
import lab2.GreenGuys.Swadloon.Swadloon;
import lab2.GreenGuys.Sewaddle.Sewaddle;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class BattleField {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Leavanny("DORA", 30);
        Pokemon p2 = new Manetric("MAYBE BABY", 30);
        Pokemon p3 = new Alomomola("SCP", 30);
        Pokemon p4 = new Electrike("ROCK", 19);
        
        b.addAlly(p1);
        b.addAlly(p2);
        b.addFoe(p3);
        b.addFoe(p4);
       
        b.go();
    }
}
