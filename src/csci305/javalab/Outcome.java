package csci305.javalab;

public class Outcome {
    //outcome holds a string for the outcome and value holds either win, lose or tie
    private String outcome, value;

    public Outcome(String outcome, String value) {
        this.outcome = outcome;
        this.value = value;
    }

    public String getOutcome() {
        return outcome;
    }

    public String getValue() {
        return value;
    }
}
