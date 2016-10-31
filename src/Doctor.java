/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joudn2217
 */
public class Doctor {

    private int row;
    private int col;
    //instance variables

    /**
     * constructor for doctor
     * @param row the row of the doctor on the board
     * @param col the column of the doctor on the board
     */
    public Doctor(int row, int col) {
        this.row = row;
        this.col = col;
    }
    

    /**
     *method to move the doctor on the board
     * @param newRow row in which the doctor will be moving to
     * @param newCol column in which the doctor will be moving to
     */
    public void move(int newRow, int newCol) {
        if ((newRow == this.row - 1 || newRow == this.row + 1 || newRow == this.row) && (newCol == this.col - 1 || newCol == this.col + 1 || newCol == this.col)) {
            this.row = newRow;
            this.col = newCol;
        } else {
            this.row = (int) (Math.random() * 12);
            this.col = (int) (Math.random() * 12);
        }
    }
    

    /**
     *method to get the doctors row from the game class
     * @return the doctors current row
     */
    public int getRow() {
        return this.row;
    }

    /**
     *method to get the doctors row from the game class
     * @return the doctors current column
     */
    public int getCol() {
        return this.col;
    }
    
}
