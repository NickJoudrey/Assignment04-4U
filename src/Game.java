
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
        //put a coloured peg at x, y
        Dalek[] dalek = new Dalek[3];
        
        for(int i = 0; i < dalek.length; i++){
            int randomR = (int) (Math.random() *12);
            int randomC = (int) (Math.random() *12);
            board.putPeg(Color.yellow, randomR, randomC);
            dalek[i] = new Dalek(randomR, randomC);
        }
        
        int randomRDoc = (int) (Math.random() *12);
        int randomCDoc = (int) (Math.random() *12);
        
        Doctor doc = new Doctor(randomRDoc, randomCDoc);
        board.putPeg(Color.black, randomRDoc, randomCDoc);
        
        
        
        
        
        while(true){
        //get the coordinate of a click
        
        board.displayMessage("Please click the board to move the doctor");
        Coordinate click = board.getClick();
        int row = click.getRow();
        int col = click.getCol();
        board.removePeg(doc.getRow(), doc.getCol());
        doc.move(row, col);
        board.putPeg(Color.black, doc.getRow(), doc.getCol());
        for(int i = 0; i < dalek.length; i++){
            board.removePeg(dalek[i].getRow(), dalek[i].getCol());
            dalek[i].advanceTowards(doc);
            board.putPeg(Color.yellow, dalek[i].getRow(), dalek[i].getCol());
        }
            
        
        
        
        }
    }
}
