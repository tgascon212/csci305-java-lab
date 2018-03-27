package csci305.javalab;

public abstract class Player {
    //create an instance variable for a string name
    public String name = "";

    //create a constructor for the player class that takes in a string and sets it to the name
    public Player(String inName){
        name = inName;
    }

    //create a getName method that returns the instance variable 'name'
    public String getName(){
        return this.name;
    }

    //create an abstract method called play
    abstract String play();
}
