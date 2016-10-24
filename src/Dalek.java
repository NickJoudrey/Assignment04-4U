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

    public Dalek(int row, int col) {
    }

    public void advanceTowards(Doctor doc) {
        int rowCompare = doc.getRow() - this.row;
        //if positive, doc is below of dalek
        //if 0, doc and dalek are in the same row
        //if negative, doc is above of dalek
        int colCompare = doc.getCol() - this.col;
        //if positive, doc is right of dalek
        //if 0, doc and dalek are in the same col
        //if negative, doc is left of dalek
        
        if (rowCompare > 0){
            this.row = this.row++;
        } else if (rowCompare < 0) {
            this.row = this.row--;
        }
        
        
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public boolean hasCrashed() {
        return this.crashed;
    }
    
    public void crash(){
        
    }
}
