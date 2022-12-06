package lab3.src.locations;

import lab3.src.based.Time;
import lab3.src.enums.Adjectives;
import lab3.src.helper.Printer;
import lab3.src.based.Location;
import lab3.src.enums.Adjectives;



public final class StoneJungles extends Location{

    
    public StoneJungles(Adjectives...adjectives) {

        super("Stone Jungles", adjectives);
        //TODO Auto-generated constructor stub
    }
    public StoneJungles() {

        super("Stone Jungles", null);
    
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