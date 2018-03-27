package csci305.javalab;

public class StupidBot extends Player {
    //StupidBot constructor
    public StupidBot(String inName) {
        super(inName);
    }

    //Stupid bot always plays Rock
    public String play(){
        return "Rock";
     }
}
