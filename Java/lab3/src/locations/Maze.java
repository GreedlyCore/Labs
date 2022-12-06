package lab3.src.locations;

import lab3.src.based.Location;
import lab3.src.based.Nature;
import lab3.src.based.Thing;
import lab3.src.enums.Adjectives;
import lab3.src.enums.Shape;

public class Maze extends Location {

    Thing[] materials;
    Nature nature;

    public Maze(String name, Nature nature,Adjectives...descriptions) {
        super(name, descriptions);
        this.nature = nature;

        
    }

    public void generate(){
        Thing[] stones = new Thing[500];
        for (int i = 0; i <= 499; i++) {
            Thing stone = new Thing("Stone" + i, Shape.getRandomForm());
            stones[i] = stone;
        }
        this.materials = stones;
    }

    public String giveOpinion(){
        return nature.toString();
    }

    public Thing[] getMaterials() {
        return materials;
    }
    
}
