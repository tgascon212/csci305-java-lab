package csci305.javalab;

public class Lizard extends Element {
    public Outcome out;

    public Lizard(String inName) {
        super(inName);
    }

    public String compareTo(Element e)
    {
        //switch statement handles the following statements
        //Lizard poisons Spock
        //Lizard eats Paper
        //Rock crushes Lizard
        //Scissors decapitate Lizard

        switch(e.getName()){
            case "Spock":
                out = new Outcome("Lizard poisons Spock","Win");
                break;
            case "Paper":
                out = new Outcome("Lizard eats Paper","Win");
                break;
            case "Rock":
                out = new Outcome("Rock crushes Lizard","Lose");
                break;
            case "Scissors":
                out = new Outcome("Scissors decapitate Lizard","Lose");
                break;
            case "Lizard":
                out = new Outcome("Lizard equals Lizard","Tie");
                break;
            default:
                System.out.println("The name was not in the set");
                break;
        }

        //return the outcome string that is concatenated with the value of win lose or tie
        return out.getOutcome() + " -- " + out.getValue();
    }

}
