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
    
    
    public Doctor(int row, int col){
        this.row = row;
        this.col = col;
    }
    
    public void move(int newRow, int newCol){
        if((newRow == this.row - 1 || newRow == this.row +1 || newRow == this.row) && (newCol == this.col - 1 || newCol == this.col +1 || newCol == this.col)){
            this.row = newRow;
            this.col = newCol;
        } else {
            this.row = (int) (Math.random() *12);
            this.col = (int) (Math.random() *12);
        }
        
        
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
}
