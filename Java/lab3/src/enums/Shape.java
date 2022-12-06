package lab3.src.enums;

public enum Shape {
    ROUNDED("rounded"), // round
    SQUARED("squaered"), // square
    RECTANGLED("rectangled"), // rectangle
    ;

    private String form;


    Shape(String form) {
        this.form = form;
    }

    public String text() {
        return form;
    }

    public static Shape getRandomForm(){
        int randInt = (int) (Math.random() * 3);
        return Shape.values()[randInt];

    }

}