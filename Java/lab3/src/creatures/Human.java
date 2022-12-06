package lab3.src.creatures;



import lab3.src.based.Entity;
import lab3.src.based.Thought;
import lab3.src.based.Location;
import lab3.src.enums.Climate;
import lab3.src.interfaces.isExist;
import lab3.src.locations.Continent;

public class Human extends Monkey implements isExist {

    private Thought thought;


    public Human(String name, Thought thought) {
        super(name);

        this.thought = thought;

    }

    public Human(Thought thought) {
        super("Human");
        this.thought = thought;

    }

    public Human() {
        super("Human");

        this.thought = null;

    }

    public void think(Thought thought) {
        thought.getInformation();
    }

    public boolean isSimilarInSpecificWay(Entity creature, Location location) {
        Continent place = (Continent) location;
        return creature instanceof Monkey && place.getClass() == Continent.class && place.getWeather() == Climate.FOREVER_COLD;


    }

    @Override
    public boolean checkExistance() {
        return thought != null;
    }
}
