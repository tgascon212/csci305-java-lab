package csci305.javalab;

public class RandomBot extends Player {
    //RandomBot constructor
    public RandomBot(String inName) {
        super(inName);
    }

    //RandomBot play method
    public String play(){
        //set the count to a random number between and including 0 and 4
        int count = (int)(Math.random()*5);
        String output = "";

        //switch statement to determine the random move
        switch(count){
            case 0:
                output = "Rock";
                break;
            case 1:
                output = "Paper";
                break;
            case 2:
                output = "Scissors";
                break;
            case 3:
                output = "Lizard";
                break;
            case 4:
                output = "Spock";
                break;
            default:
                output = "Something went wrong";
        }
        //return the randombot move
        return output;
    }
}
