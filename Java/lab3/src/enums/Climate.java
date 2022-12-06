package lab3.src.enums;

public enum Climate {

    FOREVER_COLD("cold"),
    NOT_FOR_LIVE("not for living here");


    private String name;

    Climate(String name) {
        this.name = name;
    }

    public String text() {
        return name;
    }

}