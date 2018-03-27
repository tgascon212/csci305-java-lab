package csci305.javalab;

import java.util.Scanner;

public class HumanPlayer extends Player{

    //constructor for HumanPlayer
    public HumanPlayer(String inName) {
        super(inName);
    }

    //method Play that will define how the human plays the game
    public String play(){
        //create a scanner variable
        Scanner in = new Scanner(System.in);

        //create a string for the output
        String output = "";

        //display a menu for the human player
        System.out.println("(1) Rock\n" +
                "(2) Paper\n" +
                "(3) Scissors\n" +
                "(4) Lizard\n" +
                "(5) Spock");
        //define a boolean called check that will keep track if a proper move was entered in
        boolean check;
        do{
            //ask human player for their move
            System.out.print("Enter your move: ");
            int count = in.nextInt();
            System.out.println();

            //set check back to true if it gets set to false and has to run the loop again
            check = true;

            //switch on the players input for the play
            switch(count){
                case 1:
                    output = "Rock";
                    break;
                case 2:
                    output = "Paper";
                    break;
                case 3:
                    output = "Scissors";
                    break;
                case 4:
                    output = "Lizard";
                    break;
                case 5:
                    output = "Spock";
                    break;
                default:
                    check = false;
                    output = "Invalid move. Please try again.";
            }
        }while(!check);

        //send back a string for the choice in play
        return output;
    }
}
