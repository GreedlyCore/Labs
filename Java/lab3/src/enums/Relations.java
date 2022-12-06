package lab3.src.enums;

public enum Relations {
    WHEN("when"),
    NOW("now"),
    FROM("from"),
    HERE("here"),
    OF("of"),
    BY("by"),
    WITH("with"),
    BEFORE("before");

    private String name;

    Relations(String name) {
        this.name = name;
    }

    public String text() {
        return name;
    }

}