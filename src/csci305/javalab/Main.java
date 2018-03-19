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

        Player player1 = new StupidBot("StupidBot"); //initializing as stupid bot but it may change
        Player player2 = new StupidBot("StupidBot");
        //The commented statements below are tests and they pass
        //System.out.println(rock.compareTo(paper));
        //System.out.println(paper.compareTo(rock));
        //System.out.println(rock.compareTo(rock));
        //moves.get("Rock").compareTo(moves.get("Scissors"));
        //moves.get("Rock").getOutcome();
        //int rando = (int)(Math.random()*6);

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

            //switch off of the selection to fill the player1SelectString
            switch(player1Select){
                case 1:
                    player1 = new HumanPlayer("Human");
                    //player1SelectString = "Human";
                    break;
                case 2:
                    player1 = new StupidBot("StupidBot");
                    //player1SelectString = "StupidBot";
                    break;
                case 3:
                    player1 = new RandomBot("RandomBot");
                    //player1SelectString = "RandomBot";
                    break;
                case 4:
                    player1 = new IterativeBot("IterativeBot");
                    //player1SelectString = "IterativeBot";
                    break;
                case 5:
                    player1 = new LastPlayBot("LastPlayBot");
                    //player1SelectString = "LastPlayBot";
                    break;
                case 6:
                    player1 = new MyBot("MyBot");
                    //player1SelectString = "MyBot";
                    break;
                default:
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

        System.out.println(player1.getName() + " vs " + player2.getName() + ". Go!");

        String lastPlayP1 = "";
        String lastPlayP2 = "";
        boolean firstPass = true;
        int scoreP1 = 0;
        int scoreP2 = 0;

        for(int i = 1; i<=5; i++){
            System.out.println("Round " + i + ":");
            String p1 = player1.play();
            String p2 = player2.play();

            if(firstPass == false && player1.getName().equals("LastPlayBot"))
            {
                p1 = lastPlayP2;
            }else if(firstPass == false && player2.getName().equals("LastPlayBot")){
                p2 = lastPlayP1;
            }

            firstPass = false;
            lastPlayP1 = p1;
            lastPlayP2 = p2;
            //Display the players that will verse each other

            System.out.println("Player 1 chose " + p1);
            System.out.println("Player 2 chose " + p2);
            String turn = moves.get(p1).compareTo(moves.get(p2));
            System.out.println(turn);

            //split the string to see if win or lose
            String[] outcome = turn.split(" \\-\\- ");
            switch(outcome[1]) {
                case "Win":
                    scoreP1++;
                    break;
                case "Lose":
                    scoreP2++;
                    break;
                case "Tie":
                    break;
                default:
                    System.out.println("Win,Lose,Tie went wrong");
                    break;
            }
            System.out.println();
        }

        //print out the score
        System.out.println("The score is " + scoreP1 + " to " + scoreP2 + ".");

        //figure out who won the game
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
