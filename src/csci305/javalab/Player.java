package csci305.javalab;

public abstract class Player {
    public String name = "";

    public Player(String inName){
        name = inName;
    }

    public String getName(){
        return this.name;
    }

    abstract String play();
}
