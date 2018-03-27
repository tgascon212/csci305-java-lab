package csci305.javalab;

public class Paper extends Element {
    public Outcome out;

    public Paper(String inName) {
        super(inName);
    }

    public String compareTo(Element e)
    {
        //switch statement handles the following statements
        //Paper Covers Rock
        //Paper disproves Spock
        //Scissors cut Paper
        //Lizard eats Paper

        switch(e.getName()){
            case "Rock":
                out = new Outcome("Paper covers Rock","Win");
                break;
            case "Spock":
                out = new Outcome("Paper disproves Spock","Win");
                break;
            case "Scissors":
                out = new Outcome("Scissors cut Paper","Lose");
                break;
            case "Lizard":
                out = new Outcome("Lizard eats Paper","Lose");
                break;
            case "Paper":
                out = new Outcome("Paper equals Paper","Tie");
                break;
            default:
                System.out.println("The name was not in the set");
                break;
        }

        //return the outcome string that is concatenated with the value of win lose or tie
        return out.getOutcome() + " -- " + out.getValue();
    }

}
