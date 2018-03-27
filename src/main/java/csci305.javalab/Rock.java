package csci305.javalab;

public class Rock extends Element {
    public Outcome out;

    public Rock(String inName) {
        super(inName);
    }
    public String compareTo(Element e)
    {
        //switch statement handles the following statements
        //Rock crushes Lizard
        //Rock crushes Scissors
        //Paper covers Rock
        //Spock vaporizes Rock

        switch(e.getName()){
            case "Lizard":
                out = new Outcome("Rock crushes Lizard","Win");
                break;
            case "Scissors":
                out = new Outcome("Rock crushes Scissors","Win");
                break;
            case "Paper":
                out = new Outcome("Paper covers Rock","Lose");
                break;
            case "Spock":
                out = new Outcome("Spock vaporizes Rock","Lose");
                break;
            case "Rock":
                out = new Outcome("Rock equals Rock","Tie");
                break;
            default:
                System.out.println("The name was not in the set");
                break;
        }

        //return the outcome string that is concatenated with the value of win lose or tie
        return out.getOutcome() + " -- " + out.getValue();
    }

}
