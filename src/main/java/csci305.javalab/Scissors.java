package csci305.javalab;

public class Scissors extends Element {
    public Outcome out;

    public Scissors(String inName) {
        super(inName);
    }

    public String compareTo(Element e)
    {
        //switch statement handles the following statements
        //Scissors cut Paper
        //Scissors decapitate Lizard
        //Spock smashes Scissors
        //rock crushes Scissors

        switch(e.getName()){
            case "Paper":
                out = new Outcome("Scissors cut Paper","Win");
                break;
            case "Lizard":
                out = new Outcome("Scissors decapitate Lizard","Win");
                break;
            case "Spock":
                out = new Outcome("Spock smashes Scissors","Lose");
                break;
            case "Rock":
                out = new Outcome("Rock crushes Scissors","Lose");
                break;
            case "Scissors":
                out = new Outcome("Scissors equals Scissors","Tie");
                break;
            default:
                System.out.println("The name was not in the set");
                break;
        }

        //return the outcome string that is concatenated with the value of win lose or tie
        return out.getOutcome() + " -- " + out.getValue();
    }


}
