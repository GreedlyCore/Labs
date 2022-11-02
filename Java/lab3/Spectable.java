package Java.lab3;

public class Spectable {
    

    private String name = "Sight";
    private  Adjectives condition = Adjectives.SCARY;

    public static String getDescription() {
        return Adjectives.SCARY.getDescription();
    }

    public String getName() {
        return name;
    }
    public Adjectives getCondition() {
        return condition;
    }
}
