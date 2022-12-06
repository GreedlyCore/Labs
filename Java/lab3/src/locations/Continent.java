package lab3.src.locations;

import lab3.src.enums.Climate;

public final class Continent extends lab3.src.based.Location{

    Climate weather;

    public Continent(String name, Climate weather) {
        super(name);
        this.weather = weather;
    }
        public Continent() {
        super("Continent");
        this.weather = weather;

    }


    public Climate getWeather() {
        return weather;
    }


   
    
}
