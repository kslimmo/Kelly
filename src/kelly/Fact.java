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
    private String Value;
    
    @Override 
    public String toString(){
        return dim.getCountry() + ": " + Value + "% immunized";
    }
}
