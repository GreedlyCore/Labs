package lab3.src.enums;

public enum Adjectives {
    ARTIFICAL("artificial"), 
    COLD("COLD"), 
    COMMON("common"),
    SCARY("scary"),
    BROKEN("broken"),
    ANCIENT("ancient"),
    UNUSABLE("unusable"),
    DOUBTFUL("doubtful"),
    OLD("old"),
    OBJECTIVE("objective"),
    INESCAPABLE("inescapable"),
    PHYSICAL("physical"),
    GIANT("giant"),
    MULTI("multi"),
    DANGEROUS("dangerous"),
    STONE("stone");


    private String name;

    Adjectives(String name) {
        this.name = name;
    }

    public String text() {
        return name;
    }
    public static Adjectives getRandomItem() {
        int randInt = (int) (Math.random() * (Adjectives.values().length));
        return Adjectives.values()[randInt];
    }


}