package Main;
import CustomException.CustomException;
import Dialog_box.*;
import Converter.Calculator;
import javax.swing.JOptionPane;



public class App {
    public static void main(String[] args){
        try {
            int cont = 0;
            while(cont == 0) {
                String mode = OptionBox.display("first");
                if (mode == null) {
                    terminateProgram();
                }
                String targetUnit = OptionBox.display(mode);
                if (targetUnit == null) {
                    terminateProgram();
                }
                boolean pass = false;
                String value = null;
                while (!pass) {
                    value = InputBox.getInput(mode, targetUnit);
                    if (value == null) {
                        terminateProgram();
                    }
                    pass = InputBox.verifyInput(value);
                    if (!pass) {
                        JOptionPane.showMessageDialog(null, "Only numerical values allowed");
                    }
                }
                Calculator cal = new Calculator();
                String originUnit = mode == "Currency Converter" ? "COP" : "cm";
                JOptionPane.showMessageDialog(null,
                        String.format(
                                "%.2f %s = %.2f %s",
                                Double.parseDouble(value),
                                originUnit,
                                cal.calculate(Double.parseDouble(value), targetUnit),
                                targetUnit
                        )
                );
                cont = JOptionPane.showConfirmDialog(null, "Want to do another calculation?");
                System.out.println(cont);
            }
        } catch (CustomException e){
            System.out.println("Error occurred:");
            throw e;
        } finally {
            System.out.println("Program closed.");
            JOptionPane.showMessageDialog(null, "Program terminated by the user");
        }
    }

    private static void terminateProgram(){
        JOptionPane.showMessageDialog(null, "Program terminated by the user");
        throw new CustomException("Program Terminated");
    }
}
