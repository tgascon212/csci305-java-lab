package csci305.javalab;

public class Spock extends Element {
    public Outcome out;

    public Spock(String inName) {
        super(inName);
    }

    public String compareTo(Element e)
    {
        //Spock smashes Scissors
        //Spock vaporizes Rock
        //Lizard poisons Spock
        //Paper disproves Spock
        switch(e.getName()){
            case "Scissors":
                out = new Outcome("Spock smashes Scissors","Win");
                break;
            case "Rock":
                out = new Outcome("Spock vaporizes Rock","Win");
                break;
            case "Lizard":
                out = new Outcome("Lizard poisons Spock","Lose");
                break;
            case "Paper":
                out = new Outcome("Paper disproves Spock","Lose");
                break;
            case "Spock":
                out = new Outcome("Spock equals Spock","Tie");
                break;
            default:
                System.out.println("The name was not in the set");
                break;
        }
        return out.getOutcome() + " -- " + out.getValue();
    }

}
