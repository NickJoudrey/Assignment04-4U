/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joudn2217
 */
public class Dalek {

    private int row;
    private int col;
    private boolean crashed;
    //instance variables

    /**
     * constructor for the dalek
     * @param row the row the dalek is in
     * @param col the column the dalek is in
     */
    public Dalek(int row, int col) {
        this.row = row;
        this.col = col;
    }
    

    /**
     * move towards the row and col of the doctor
     * @param doc the doctor the dalek is moving towards
     */
    public void advanceTowards(Doctor doc) {
        int rowCompare = doc.getRow() - this.row;
        //if positive, doc is below of dalek
        //if 0, doc and dalek are in the same row
        //if negative, doc is above of dalek
        int colCompare = doc.getCol() - this.col;
        //if positive, doc is right of dalek
        //if 0, doc and dalek are in the same col
        //if negative, doc is left of dalek
        if (crashed) {
        } else {
            if (rowCompare > 0) {
                this.row++;
            } else if (rowCompare < 0) {
                this.row--;
            }
            //move towards the doctors row by 1
            if (colCompare > 0) {
                this.col++;
            } else if (colCompare < 0) {
                this.col--;
            }
        }
        // move towards the doctors column by 1
    }

    /**
     * method to get daleks row from the game class
     * @return the current row of the dalek
     */
    public int getRow() {
        return this.row;
    }
    

    /**
     * method to get daleks col in game class
     * @return the current column of the dalek
     */
    public int getCol() {
        return this.col;
    }
    

    /**
     * method to get if the dalek have crashed in the game class
     * @return whether the dalek has crashed or not
     */
    public boolean hasCrashed() {
        return this.crashed;
    }
    

    /**
     * sets crashed boolean for the dalek to true
     */
    public void crash() {
        this.crashed = true;
    }
    
}
