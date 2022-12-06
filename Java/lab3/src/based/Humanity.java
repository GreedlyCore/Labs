package lab3.src.based;

import lab3.src.creatures.Human;
import lab3.src.creatures.Monkey;
import lab3.src.enums.Climate;
import lab3.src.interfaces.TimeComparable;
import lab3.src.locations.Continent;

public final class Humanity extends Entity implements TimeComparable {

    private Thought thought;
    private Human[] humans;
    private boolean isAppeared;



    public Humanity(Thought thought, int countOfHuman) {
        this(countOfHuman);
        this.thought = thought;
        isAppeared = false;


    }    public Humanity(int countOfHuman) {
        super("Humanity");
        humans = new Human[countOfHuman];
        for (int i = 0; i < countOfHuman; i++) {
            this.humans[i] = new Human();
        }

    }


    public void think(Time time){
        if (time.getUnit() != "before") {

            this.thought.getInformation();
        }
        else{
            thought.setAllowed(false);
        }

    }

    public boolean isSimilarSpecificTime(Time time) {
        Continent location = (Continent) time.getObject();
        //take 10 humans and compare it to monkey
        for (int i = 0; i < 10; i++) {

            int randInt = 0 + (int)(Math.random() * ((humans.length - 0) + 1));
            Human human = humans[i];
            if (!(  human instanceof Monkey &&  location.getClass() == Continent.class && location.getWeather()==Climate.FOREVER_COLD  )) {
                return false;
            }
        }
        return true;
    }
    public boolean isAppeared() {
        return isAppeared;
    }
    public void setAppeared(boolean isAppeared) {
        this.isAppeared = isAppeared;
    }

    public Thought getThought() {
        return thought;
    }

    public void setThought(Thought thought) {
        this.thought = thought;
    }


}
