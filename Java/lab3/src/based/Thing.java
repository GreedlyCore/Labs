package lab3.src.based;

import lab3.src.enums.Adjectives;
import lab3.src.enums.Shape;
import lab3.src.helper.Printer;

public class Thing extends Entity{

    private Adjectives[] descriptions;
    private Shape forms;

    public Thing(String name, Adjectives...descriptions){
        this(name);
        this.descriptions = descriptions;
    }
    public Thing(String name){
        super(name);

    }
    public Thing(String name, Shape form){
        super(name);
        this.forms = form;
        //this.descriptions = new Adjectives[]{Adjectives.COMMON};

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (descriptions != null){
            for (Adjectives elem: descriptions) {
                builder.append(elem.text() + " ");
            }
        }
        builder.append(forms.text() + " ");

        return Printer.setSpaces(super.getName(), builder.toString());
    }

    public Adjectives[] getDescriptions() {
        return descriptions;
    }
}
