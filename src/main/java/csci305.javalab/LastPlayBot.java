package csci305.javalab;

public class LastPlayBot extends Player{

    //The last play bot is handled in the main class however a constructor
    //is needed to create a bot called LastPlayBot and the first play of this
    //bot will be Rock, from here on out the play will then be determined
    //by the other player
    public LastPlayBot(String inName) {
        super(inName);
    }

    //the first play of this bot will return Rock
    public String play(){
        return "Rock";
    }

}
