
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joudn2217
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Board board = new Board(12, 12);
        //create board
        Dalek[] dalek = new Dalek[3];
        //create an array of 3 daleks
        for (int i = 0; i < dalek.length; i++) {
            int randomR = (int) (Math.random() * 12);
            int randomC = (int) (Math.random() * 12);
            board.putPeg(Color.black, randomR, randomC);
            dalek[i] = new Dalek(randomR, randomC);
        }
        //pick a random col and row between 0-11 and place a black peg there
        //use the random coordinates to create a new dalek

        int randomRDoc = (int) (Math.random() * 12);
        int randomCDoc = (int) (Math.random() * 12);

        Doctor doc = new Doctor(randomRDoc, randomCDoc);
        board.putPeg(Color.green, randomRDoc, randomCDoc);
        //pick a random col and row between 0-11, create a new doctor at those coordinates and place a green peg there




        while (true) {
            if (dalek[0].getCol() == dalek[1].getCol() && dalek[0].getRow() == dalek[1].getRow()) {
                dalek[0].crash();
                dalek[1].crash();
                board.putPeg(Color.red, dalek[0].getRow(), dalek[0].getCol());
            }
            //if dalek 0 and dalek 1 are on the same coords make them crash and place a red peg
            if (dalek[0].getCol() == dalek[2].getCol() && dalek[0].getRow() == dalek[2].getRow()) {
                dalek[0].crash();
                dalek[2].crash();
                board.putPeg(Color.red, dalek[0].getRow(), dalek[0].getCol());
            }
            //if dalek 0 and dalek 2 are on the same coords make them crash and place a red peg
            if (dalek[1].getCol() == dalek[2].getCol() && dalek[1].getRow() == dalek[2].getRow()) {
                dalek[1].crash();
                dalek[2].crash();
                board.putPeg(Color.red, dalek[1].getRow(), dalek[1].getCol());
            }
            //if dalek 1 and dalek 2 are on the same coords make them crash and place a red peg

            boolean lose = false;
            //create boolean to allow for loops to crash the while loop
            for (int i = 0; i < dalek.length; i++) {
                if (doc.getRow() == dalek[i].getRow() && doc.getCol() == dalek[i].getCol()) {
                    board.putPeg(Color.yellow, doc.getRow(), doc.getCol());
                    board.displayMessage("You have been captured by a Dalek! You lose!");
                    lose = true;
                }
            }
            if (lose) {
                break;
            }
            //if the doctor is on the same coords of any of the dalek put a yellow peg at the coords tell the user they lost and set lose to true
            for (int i = 0; i < dalek.length; i++) {
                if (dalek[i].hasCrashed() == true && dalek[i].getRow() == doc.getRow() && dalek[i].getCol() == doc.getCol()) {
                    board.putPeg(Color.yellow, doc.getRow(), doc.getCol());
                    board.displayMessage("You have crashed into a pile of Dalek rubble! You lose!");
                    lose = true;
                }
            }
            //if the doctor and 2 crashed daleks are on the set of coords 
            if (lose) {
                break;
            }
            //break the while loop if the lose is true
            if (dalek[0].hasCrashed() && dalek[1].hasCrashed() && dalek[2].hasCrashed()) {
                board.displayMessage("All Dalek's have crashed! You win!");
                break;
            }
            //if all daleks crash you win and break while loop

            board.displayMessage("Please click the board to move the doctor");
            Coordinate click = board.getClick();
            int row = click.getRow();
            int col = click.getCol();
            board.removePeg(doc.getRow(), doc.getCol());
            doc.move(row, col);
            board.putPeg(Color.green, doc.getRow(), doc.getCol());
            //get click from user and move doc using move method in doctor class
            for (int i = 0; i < dalek.length; i++) {
                board.removePeg(dalek[i].getRow(), dalek[i].getCol());

            }
            //delete all dalek pegs
            for (int i = 0; i < dalek.length; i++) {
                dalek[i].advanceTowards(doc);
                board.putPeg(Color.black, dalek[i].getRow(), dalek[i].getCol());
                //use the advance toward dalek method to make them advance
            }
        }
    }
}
