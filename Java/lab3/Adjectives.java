package Java.lab3;

public enum Adjectives {
    SCARY("scary"),
    BROKEN("broken"),
    ANCIENT("ancient"),
    UNUSABLE("unusable"),
    COLD("cold"),
    STONE("stone");
   private String name;
   Adjectives(String name){
    this.name = name;
   }

    public String getDescription(){
        return  name;
    }


}