package csci305.javalab;

public abstract class Element {
    //variable to store the name, i.e. Rock, Paper, csci305.javalab.Scissors, csci305.javalab.Lizard, Spock
    public String name;

    //constructor for the Element Class
    public Element(String inName){
        this.name = inName;
    }

    //Method to get the name of the element
    public String getName()
    {
        return this.name;
    }

    //abstract method to compare to that will be defined in the elements
    abstract String compareTo(Element e);

}


