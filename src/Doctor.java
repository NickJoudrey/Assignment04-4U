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
        
    }
    
    public void move(int newRow, int newCol){
        this.row = newRow;
        this.col = newCol;
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
}
