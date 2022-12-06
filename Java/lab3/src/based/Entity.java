package lab3.src.based;

import java.time.Instant;

public abstract class Entity  {

    private String name;



    public int hashCode(){
        long unixTime = Instant.now().getEpochSecond();
        if (Integer.MAX_VALUE < unixTime){
            return (int) unixTime;
        }
        return (int)unixTime % 1000000000;

    }
    @Override
    public String toString(){
        return name;

    }

    protected Entity(String name) {
        this.name = name;

    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode()
            && obj.getClass() == this.getClass();
    }

    public String getName() {
        return name;
    }

}
