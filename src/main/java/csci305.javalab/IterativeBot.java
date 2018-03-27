package csci305.javalab;

public class IterativeBot extends Player{
    //variable to keep track of the count
    private int count = 0;

    //constructor
    public IterativeBot(String inName) {
        super(inName);
    }

    //method to play the game as an iterative bot
    public String play(){
        //variable to hold a string for the output
        String output = "";

        //switch handles playing the moves off of the count
        //after the move is played it increments the count and returns the output
        //unless spock is played where it then sets the output back to 0 to iterate through again.
        switch(count){
            case 0:
                output = "Rock";
                count++;
                break;
            case 1:
                output = "Paper";
                count++;
                break;
            case 2:
                output = "Scissors";
                count++;
                break;
            case 3:
                output = "Lizard";
                count++;
                break;
            case 4:
                output = "Spock";
                count=0;
                break;
            default:
                output = "Something went wrong";
        }
        return output;
    }
}
