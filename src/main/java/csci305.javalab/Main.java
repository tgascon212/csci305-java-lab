package csci305.javalab;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    //create a new hashmap to contain the moves
    private static final Map<String, Element> moves = new HashMap();

    public static void main(String[] args) {
        //create an instance of each element
        Element rock = new Rock("Rock");
        Element paper = new Paper("Paper");
        Element scissors = new Scissors("Scissors");
        Element lizard = new Lizard("Lizard");
        Element spock = new Spock("Spock");

        //store each instance in the hashmap
        moves.put("Rock", rock);
        moves.put("Paper", paper);
        moves.put("Scissors", scissors);
        moves.put("Lizard", lizard);
        moves.put("Spock", spock);

        //create two new player objects and just set them initially to stupid bot
        Player player1 = new StupidBot("StupidBot"); //initializing as stupid bot but it may change
        Player player2 = new StupidBot("StupidBot");

        //create a scanner to get input
        Scanner in =  new Scanner(System.in);

        //display a menu for the player
        System.out.println("Please choose two players:\n" +
                "   (1) Human\n" +
                "   (2) StupidBot\n" +
                "   (3) RandomBot\n" +
                "   (4) IterativeBot\n" +
                "   (5) LastPlayBot\n" +
                "   (6) MyBot");

        //Create variables for the player strings and switching integers for the menu
        boolean check;
        String player1SelectString = "";
        String player2SelectString = "";
        int player1Select;
        int player2Select;

        //do while loop to manage the input for player 1
        do{
            //reset check to true in case someone enters a number outside the range
            check = true;
            //ask for player 1 to enter a selection
            System.out.print("\nSelect player 1: ");
            //scan in player 1's selection
            player1Select = in.nextInt();

            //switch off of the selection to set who is playing the game
            switch(player1Select){
                case 1:
                    player1 = new HumanPlayer("Human");
                    break;
                case 2:
                    player1 = new StupidBot("StupidBot");
                    break;
                case 3:
                    player1 = new RandomBot("RandomBot");
                    break;
                case 4:
                    player1 = new IterativeBot("IterativeBot");
                    break;
                case 5:
                    player1 = new LastPlayBot("LastPlayBot");
                    break;
                case 6:
                    player1 = new MyBot("MyBot");
                    break;
                default:
                    //failed to enter a value between 1 and 6
                    System.out.println("please enter a value 1-6");
                    check = false;
                    break;
            }
        }while(!check);

        do{
            //reset check to true in case someone enters a number outside the range
            check = true;
            //ask for player 2 to enter a selection
            System.out.print("Select player 2: ");
            //Scan in player 2's selection
            player2Select = in.nextInt();
            System.out.println();

            //switch on the selection to fill the player2SelectString
            switch(player2Select){
                case 1:
                    player2 = new HumanPlayer("Human");
                    //player2SelectString = "Human";
                    break;
                case 2:
                    player2 = new StupidBot("StupidBot");
                    //player2SelectString = "StupidBot";
                    break;
                case 3:
                    player2 = new RandomBot("RandomBot");
                    //player2SelectString = "RandomBot";
                    break;
                case 4:
                    player2 = new IterativeBot("IterativeBot");
                    //player2SelectString = "IterativeBot";
                    break;
                case 5:
                    player2 = new LastPlayBot("LastPlayBot");
                    //player2SelectString = "LastPlayBot";
                    break;
                case 6:
                    player2 = new MyBot("MyBot");
                    //player2SelectString = "MyBot";
                    break;
                default:
                    System.out.println("please enter a value of 1-6");
                    check = false;
                    break;
            }
        }while(!check);

        //print who is vs who
        System.out.println(player1.getName() + " vs " + player2.getName() + ". Go!");

        //variables to manage the rounds
        String lastPlayP1 = "";
        String lastPlayP2 = "";
        boolean firstPass = true;
        int scoreP1 = 0;
        int scoreP2 = 0;

        //Play 5 rounds of rock, paper, scissors, lizard, spock
        for(int i = 1; i<=5; i++){
            //play the rounds for each player
            System.out.println("Round " + i + ":");
            String p1 = player1.play();
            String p2 = player2.play();

            //handle if the game is being played by Last Play Bot
            if(firstPass == false && player1.getName().equals("LastPlayBot"))
            {
                //set the play for player 1 to the last play of player 2 for the next round
                p1 = lastPlayP2;
            }else if(firstPass == false && player2.getName().equals("LastPlayBot")){
                //set the play for player 2 to the last play of player 1 for the next round
                p2 = lastPlayP1;
            }

            //set the first pass to false and the set the variables for the last play
            firstPass = false;
            lastPlayP1 = p1;
            lastPlayP2 = p2;

            //Display what player1 and player 2 chose for their play
            System.out.println("Player 1 chose " + p1);
            System.out.println("Player 2 chose " + p2);
            //construct a string called turn that will hold the value for the outcome of the play
            String turn = moves.get(p1).compareTo(moves.get(p2));
            //print the output
            System.out.println(turn);

            //split the output string to see if win or lose
            String[] outcome = turn.split(" \\-\\- ");
            switch(outcome[1]) {
                case "Win":
                    //if a win then p1 gets a point because were comparing p1 to p2
                    scoreP1++;
                    break;
                case "Lose":
                    //if a loss then p2 gets a point
                    scoreP2++;
                    break;
                case "Tie":
                    //tie means no one gets a point
                    break;
                default:
                    //if something weird happens then this will handle it
                    System.out.println("Win,Lose,Tie went wrong");
                    break;
            }
            System.out.println();
        }

        //print out the score
        System.out.println("The score is " + scoreP1 + " to " + scoreP2 + ".");

        //figure out who won the game and print it
        if(scoreP1>scoreP2){
            System.out.println("Player 1 won the game");
        }else if(scoreP1<scoreP2){
            System.out.println("Player 2 won the game");
        }else{
            System.out.println("Game was a draw");
        }

        //close the scanner
        in.close();
    }
}
