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
public class DataSet {
    private Fact [] fact;
    
    /**
     *
     * @return
     */
    public Fact[] getFact(){
        return fact;
    }
    @Override
    public String toString(){
        String finalList = null;
        System.out.println("Polio Immunizations in 1980");
        for(int i=0; i < fact.length; i++){
            System.out.println(fact[i].toString());
            finalList += fact[i].toString();
        }
        return finalList;
    }
}

