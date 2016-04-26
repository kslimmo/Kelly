/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelly;

import com.google.gson.Gson;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

/**
 *
 * @author csstudent
 */
public class KellyNetBeansController implements Initializable {
    
    @FXML
    private BarChart barChart;
    @FXML
    private Slider minSlider;
    
    @FXML
    private Slider maxSlider;
    
    
    
    @Override
    public void initialize(URL ur, ResourceBundle rb) {
        String s = "http://apps.who.int/gho/athena/data/GHO/WHS4_544.json?profile=simple&filter=YEAR:1980";
        URL url = null;
        try {
            url = new URL(s);
        } catch (Exception e) {
            System.out.println("Improper URL " + s);
            System.exit(-1);
        }
     
        // read from the URL
        Scanner scan = null;
        try {
            scan = new Scanner(url.openStream());
        } catch (Exception e) {
            System.out.println("Could not connect to " + s);
            System.exit(-1);
        }
        
        String str = new String();
        while (scan.hasNext()) {
            str += scan.nextLine() + "\n";
        }
        scan.close();

        Gson gson = new Gson();
        DataSet ds = gson.fromJson(str, DataSet.class);
        System.out.println(ds);
        
        XYChart.Series<String, Number> dataInfo = new XYChart.Series();
        Fact [] blah = ds.getFact();
        for (Fact blah1 : blah) {
            if(blah1.getDim().getCountry() == null){
                
            }else{
            dataInfo.getData().add(new XYChart.Data(blah1.getDim().getCountry(), blah1.getValue()));
            }
        }
        barChart.getData().add(dataInfo);

    }  
    
}
    
   
