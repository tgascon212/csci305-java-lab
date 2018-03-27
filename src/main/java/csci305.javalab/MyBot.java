package csci305.javalab;

public class MyBot extends Player{
    //instance variable for the count
    private int count=0;

    //constructor for MyBot
    public MyBot(String inName) {
        super(inName);
    }

    //my bot depending on the first random move will either play (rock, paper or scissors) or it will play (lizard or spock)
    //This is done by a random number generator where the count will move between 1-2-3-1-2... or 4-5-4-5-4...
    //this will make the play as stated above.
    public String play(){
        //create a string to hold the what the play is
        String output;

        //if the count hasn't been set yet
        if(count == 0){
        //set the count generate a number between 1 and 5 inclusive
            count = (int)(Math.random()*5)+1;
        }
        switch(count){
            case 1:
                output = "Rock";
                count = 2;
                break;
            case 2:
                output = "Paper";
                count = 3;
                break;
            case 3:
                output = "Scissors";
                count = 1;
                break;
            case 4:
                output = "Lizard";
                count = 5;
                break;
            case 5:
                output = "Spock";
                count = 4;
                break;
            default:
                output = "Something went wrong";
        }

        return output;
    }
}
