package lab2;

import lab2.Alomomola.Alomomola;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class BattleField {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Alomomola("Dora", 9);//new Pokemon("Чужой", 1);
        Pokemon p2 = new Alomomola("MaybeBaby", 9);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
