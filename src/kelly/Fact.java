/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

/**
 *
 * @author csstudent
 */
public class Fact {
    private Dim dim;
    private int Value;
    
    public Dim getDim(){
        return dim;
    }
    
    public int getValue(){
        return Value;
    }
    
    @Override 
    public String toString(){
        return dim.getCountry() + ": " + Value + "% immunized";
    }
}
