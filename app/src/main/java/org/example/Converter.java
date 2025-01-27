package org.example;

import java.text.DecimalFormat;

public class Converter {
    public String toPounds(int ounces) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        double pounds = ounces / 16d;
        String poundsString = decimalFormat.format(pounds) + " lb";
        if(pounds != 1) {
            poundsString += 's';
        }
        return poundsString;
    }
    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int ouncesR = ounces % 16;
        String poundsAndOuncesString = pounds + " lb";
        if(pounds != 1) {
            poundsAndOuncesString += 's';
        }
        poundsAndOuncesString += " " + ouncesR + " oz";
        return poundsAndOuncesString;
    }
}
