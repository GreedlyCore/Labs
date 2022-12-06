package lab3.src.based;

import lab3.src.helper.Printer;

public final class Time extends Entity {

    private int count;
    private String unit;

    private Entity object;

    public Time(int count, String unit, Entity object) {
        super("Custom Time");
        this.count = count;
        this.unit = unit;
        this.object = object;
    }    public Time(String unit, Entity object) {
        super("Custom Time");

        this.unit = unit;
        this.object = object;
    }

    public Time(int count, String unit) {
        super("Custom Time");
        this.count = count;
        this.unit = unit;
    }
    public Time(String unit) {
        super("Custom Time");
        this.unit = unit;
    }
    public Time(Entity obj) {
        super("Custom Time");
        this.object = obj;
    }

    @Override
    public String toString() {
        return Printer.setSpaces(super.getName(), String.valueOf(count), unit, object.toString());
    }

    public Entity getObject() {
        return object;
    }

    public String getUnit() {
        return unit;
    }


}
