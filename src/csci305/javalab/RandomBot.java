package csci305.javalab;

public class RandomBot extends Player {
    public RandomBot(String inName) {
        super(inName);
    }

    public String play(){
        int count = (int)(Math.random()*5);
        String output = "";

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
        return output;
    }
}
