package lab3.src.locations;

import lab3.src.based.Location;
import lab3.src.enums.Adjectives;
import lab3.src.helper.Printer;

public class Sight extends Location {

    

    public Sight(Adjectives...adjectives) {

        super("Sight", adjectives);

        
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        
        for (Adjectives adjective : super.getDescriptions()) {
            stringBuilder.append(adjective);   
        }
        return Printer.setSpaces(stringBuilder.toString(), this.getName());
    }



}
