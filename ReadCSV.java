/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalindicators;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin
 */
public class ReadCSV {

    private static final List<Double> openPrice = new ArrayList();
    private static final List<Double> closePrice = new ArrayList();
    private static final List<Double> highPrice = new ArrayList();
    private static final List<Double> lowPrice = new ArrayList();
    private static final List<Double> Volume = new ArrayList();

    public static void ReadCSV(String fileName) {

        File csvFile = new File(fileName);
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {

            br = new BufferedReader(new InputStreamReader(new ReverseLineInputStream(csvFile)));
            while ((line = br.readLine()) != null) {


                String[] field = line.split(csvSplitBy);
                double open = Double.parseDouble(field[1]);
                double close = Double.parseDouble(field[2]);
                double high = Double.parseDouble(field[3]);
                double low = Double.parseDouble(field[4]);
                double volume = Double.parseDouble(field[5]);
                openPrice.add(open);
                closePrice.add(close);
                highPrice.add(high);
                lowPrice.add(low);
                Volume.add(volume);

                System.out.println("Date " + field[0] + " Open: " + field[1] + " Close: " + field[2]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
