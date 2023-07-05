package Dialog_box;
import javax.swing.*;

public class InputBox {
    public static String getInput(String option, String unit) {
        String message = "";
        if(option == "Currency Converter"){
            message = String.format("Input the amount of COP you want to convert into %s", unit);
        } else if (option == "Length Converter") {
            message = String.format("Input the amount of cm you want to convert into %s", unit);
        }
        return JOptionPane.showInputDialog(null, message);
    }

    public static boolean verifyInput(String input){
        return input.matches("^[0-9]+(\\.[0-9]+)?$");
    }
}
