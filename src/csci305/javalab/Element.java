package csci305.javalab;

public abstract class Element {
    //variable to store the name, i.e. Rock, Paper, csci305.javalab.Scissors, csci305.javalab.Lizard, Spock
    public String name;

    public Element(String inName){
        this.name = inName;
    }

    public String getName()
    {
        return this.name;
    }

    abstract String compareTo(Element e);

}


