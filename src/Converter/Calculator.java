package Converter;
import com.sun.source.doctree.SystemPropertyTree;

import java.util.Map;
import java.util.HashMap;
public class Calculator {
    private Map<String, Double> units = new HashMap<>();

    public Calculator(){
        this.units.put("USD", 4139.13);
        this.units.put("EUR", 4662.60);
        this.units.put("JPY", 36.34);
        this.units.put("GBP", 5541.52);
        this.units.put("CAD", 3276.22);
        this.units.put("m", 100.0);
        this.units.put("mm", 0.1);
        this.units.put("inch", 2.54);
        this.units.put("km", 100000.0);
        this.units.put("ft", 30.48);
    }

    public double calculate(double value, String unit){
        return value/this.units.get(unit);
    }


}