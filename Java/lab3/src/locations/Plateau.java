package lab3.src.locations;

import lab3.src.based.Time;
import lab3.src.helper.Printer;

import lab3.src.based.Location;
import lab3.src.enums.Adjectives;
import lab3.src.enums.Climate;
import lab3.src.enums.Relations;

public final class Plateau extends Location {

    private String height;
    private String unit;
    private Climate climate;

    private Location innerPlace;
    private Time fromTime;

    public Location getInnerPlace() {
        return innerPlace;
    }

    public String getHeight() {
        return height;
    }

    public String getUnit() {
        return unit;
    }

    public Time getFromTime() {
        return fromTime;
    }

    public Plateau(Adjectives[] descriptions, int height, String unit, Climate climate, Time fromTime,
            Location innerPlace) {
        super("Plateau", descriptions);

        this.height = String.valueOf(height);
        this.unit = unit;
        this.climate = climate;
        this.fromTime = fromTime;
        this.innerPlace = innerPlace;
    }

    private Plateau(PlateauBuilder plateauBuilder) {
        super("Plateau", plateauBuilder.descriptions);
        this.height = String.valueOf(height);
        this.unit = plateauBuilder.unit;
        this.climate = plateauBuilder.climate;
        this.fromTime = plateauBuilder.fromTime;
        this.innerPlace = plateauBuilder.innerPlace;
    }

    public Climate climate() {
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    @Override
    public String toString() {
        StringBuilder descriptionStringBuilder = new StringBuilder();

        for (Adjectives adjective : descriptions) {

            descriptionStringBuilder.append(adjective.text() + " ");

        }
        return Printer.setSpaces(descriptionStringBuilder.toString(), this.getName(), height, unit,
                Relations.WITH.text(), climate.text());
    }

    public static class PlateauBuilder {

        private int height;
        private Adjectives[] descriptions;
        private String unit;
        private Climate climate;
        private Location innerPlace;
        private Time fromTime;

        public PlateauBuilder height(int height) {
            this.height = height;
            return this;
        }

        public PlateauBuilder description(Adjectives...descriptions) {
            this.descriptions = descriptions;
            return this;
        }

        public PlateauBuilder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public PlateauBuilder climate(Climate climate) {
            this.climate = climate;
            return this;
        }

        public PlateauBuilder innerPlace(Location innerPlace) {
            this.innerPlace = innerPlace;
            return this;
        }

        public PlateauBuilder fromTime(Time fromTime) {
            this.fromTime = fromTime;
            return this;
        }

        public Plateau build() {
            return new Plateau(this);
        }

    }

    public boolean hasInsideStoneJungles() {
        return innerPlace.getClass() == StoneJungles.class;
    }

}
