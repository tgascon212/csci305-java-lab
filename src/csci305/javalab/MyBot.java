package csci305.javalab;

public class MyBot extends Player{
    private int count=0;

    public MyBot(String inName) {
        super(inName);
    }

    //my bot depending on the first random move will either play (rock, paper or scissors) or it will play (lizard or spock)
    public String play(){
        String output;
        if(count ==0){
            int count = (int)(Math.random()*5)+1;
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
