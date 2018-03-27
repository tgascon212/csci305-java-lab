package csci305.javalab;

public class Outcome {
    //outcome holds a string for the outcome and value holds either win, lose or tie
    private String outcome, value;

    //consturctor for Outcome
    public Outcome(String outcome, String value) {
        this.outcome = outcome;
        this.value = value;
    }

    //create a method to get the outcome
    public String getOutcome() {
        return outcome;
    }

    //create a method to get the value
    public String getValue() {
        return value;
    }
}
