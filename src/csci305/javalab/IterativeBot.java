package csci305.javalab;

public class IterativeBot extends Player{
    private int count = 0;

    public IterativeBot(String inName) {
        super(inName);
    }

    public String play(){
        String output = "";
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
