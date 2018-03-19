package csci305.javalab;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String inName) {
        super(inName);
    }

    public String play(){
        Scanner in = new Scanner(System.in);

        String output = "";

        System.out.println("(1) Rock\n" +
                "(2) Paper\n" +
                "(3) Scissors\n" +
                "(4) Lizard\n" +
                "(5) Spock");
        boolean check;
        do{
            System.out.print("Enter your move: ");
            int count = in.nextInt();
            System.out.println();

            check = true;

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

        //in.close();
        return output;
    }
}
