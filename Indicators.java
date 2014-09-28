/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package technicalindicators;

/**
 *
 * @author Kevin
 */
public class Indicators {
    private double lowThreshold;
    private double highThreshold;
    private double currentValue;
    public int dateLine;


    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public void setHighThreshold(double highThreshold) {
        this.highThreshold = highThreshold;
    }

    public void setLowThreshold(double lowThreshold) {
        this.lowThreshold = lowThreshold;
    }
    

    
}
