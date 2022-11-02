public enum Condition {
    CANTSAY("cant be said with words");

    private String name;

    Condition(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }
}
