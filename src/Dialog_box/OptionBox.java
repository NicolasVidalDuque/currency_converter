package Dialog_box;
import javax.swing.*;
import CustomException.CustomException;

public class OptionBox {
    public static String display(int mode){
        String[] options;
        String question;
        if(mode == 1){
            options = new String[]{"Currency Converter", "Length Converter"};
            question = "Choose converter type";
        } else if (mode == 2) {
            options = new String[]{"USD", "EU"};
            question = "Choose your target currency";
        } else {
            throw new CustomException("This option does not exist");
        }
        return converterType(options, question);
    }

    private static String converterType(String[] options, String question){
        return (String) JOptionPane.showInputDialog(null, question,"Dropdown List Selection", JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
    }
}
