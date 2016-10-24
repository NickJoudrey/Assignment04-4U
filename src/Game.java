
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
        //create board
        Board board = new Board(12, 12);
        Doctor doc = new Doctor(2,5);
        Dalek d1 = new Dalek(4,6);
        //put a coloured peg at x, y
        board.putPeg(Color.BLACK, d1.getRow(), d1.getCol());
        board.putPeg(Color.YELLOW, 6, 6);
        
        //remove peg
        board.removePeg(1, 5);
        
        //put a message on board
        board.displayMessage("Please click the board");
        while(true){
        //get the coordinate of a click
        Coordinate click = board.getClick();
        int row = click.getRow();
        int col = click.getCol();
        
        board.putPeg(Color.MAGENTA, row, col);
        }
    }
}
